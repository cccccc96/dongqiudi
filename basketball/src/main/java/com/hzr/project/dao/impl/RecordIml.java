package com.hzr.project.dao.impl;

import com.hzr.project.dao.IRecord;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RecordIml implements IRecord {

    @Override
    public List<String> search(String t1, String t2, String date) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<String> list = new ArrayList<>();
        String jdbcUrl = "jdbc:mysql://101.132.45.226:3306/ai?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false&serverTimezone=UTC";
        try {
            conn = DriverManager.getConnection(jdbcUrl, "root", "Czh_123456");
            String sql = "Select * from result where 1 = 1 and date = ? and((lteam = ? and  wteam = ?) or (lteam = ? and wteam = ?)) ";
            ps = conn.prepareStatement(sql);
            ps.setString(1,date);
            ps.setString(2,t1);
            ps.setString(3,t2);
            ps.setString(4,t2);
            ps.setString(5,t1);
            rs = ps.executeQuery();
            if (rs.next()) {
                String team1 = rs.getString("wteam");
                String team2 = rs.getString("lteam");
                String probability = rs.getString("probability");
                list.add(team1);
                list.add(team2);
                list.add(probability);
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert rs != null;
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  null;

    }
}
