package com.hzr.project.dao;

import java.util.List;

public interface IRecord {
    String DISPLAY_DATA="Select * from result where 1 = 1 and date = ? and((lteam = ? and  wteam = ?) or (lteam = ? and wteam = ?)) ";

    List<String> search(String t1, String t2, String date);
}
