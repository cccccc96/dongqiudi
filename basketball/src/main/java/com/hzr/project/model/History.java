package com.hzr.project.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hu Zirui
 * @version 1.0.0
 * @ClassName History.java
 * @Description TODO
 * @createTime 2021年03月16日 09:52:00
 */
@Entity
@Table(name = "History")
public class History {
    String PlayerName;
    String GamesPlayed;
    String MinutesPlayed;
    String year;
    String TeamName;
    double item_1;
    double item_2;
    double item_3;
    double item_4;
    double item_5;
    double item_6;
    double item_7;
    double item_8;
    double item_9;
    double item_10;
    double item_11;
    double item_12;
    double item_13;
    double item_14;
    double item_15;
    double item_16;
    double item_17;
    double item_18;
    double item_19;
    double item_20;
    double item_21;
    double item_22;
    double item_23;
    double item_24;
    double item_25;
    double item_26;
    double item_27;
    double item_28;
    double item_29;
    double item_30;
    double item_31;
    double item_32;
    double item_33;
    double item_34;
    double item_35;
    double item_36;
    double item_37;
    double item_38;
    double item_39;
    double item_40;
    double item_41;
    double item_42;
    double item_43;
    double item_44;
    double item_45;
    double item_46;
    double item_47;
    double item_48;
    @Id
    private Long id;

    @Override
    public String toString() {
        return "History{" +
                "PlayerName='" + PlayerName + '\'' +
                ", GamesPlayed='" + GamesPlayed + '\'' +
                ", MinutesPlayed='" + MinutesPlayed + '\'' +
                ", year='" + year + '\'' +
                ", TeamName='" + TeamName + '\'' +
                ", item_1=" + item_1 +
                ", item_2=" + item_2 +
                ", item_3=" + item_3 +
                ", item_4=" + item_4 +
                ", item_5=" + item_5 +
                ", item_6=" + item_6 +
                ", item_7=" + item_7 +
                ", item_8=" + item_8 +
                ", item_9=" + item_9 +
                ", item_10=" + item_10 +
                ", item_11=" + item_11 +
                ", item_12=" + item_12 +
                ", item_13=" + item_13 +
                ", item_14=" + item_14 +
                ", item_15=" + item_15 +
                ", item_16=" + item_16 +
                ", item_17=" + item_17 +
                ", item_18=" + item_18 +
                ", item_19=" + item_19 +
                ", item_20=" + item_20 +
                ", item_21=" + item_21 +
                ", item_22=" + item_22 +
                ", item_23=" + item_23 +
                ", item_24=" + item_24 +
                ", item_25=" + item_25 +
                ", item_26=" + item_26 +
                ", item_27=" + item_27 +
                ", item_28=" + item_28 +
                ", item_29=" + item_29 +
                ", item_30=" + item_30 +
                ", item_31=" + item_31 +
                ", item_32=" + item_32 +
                ", item_33=" + item_33 +
                ", item_34=" + item_34 +
                ", item_35=" + item_35 +
                ", item_36=" + item_36 +
                ", item_37=" + item_37 +
                ", item_38=" + item_38 +
                ", item_39=" + item_39 +
                ", item_40=" + item_40 +
                ", item_41=" + item_41 +
                ", item_42=" + item_42 +
                ", item_43=" + item_43 +
                ", item_44=" + item_44 +
                ", item_45=" + item_45 +
                ", item_46=" + item_46 +
                ", item_47=" + item_47 +
                ", item_48=" + item_48 +
                ", id=" + id +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public String getGamesPlayed() {
        return GamesPlayed;
    }

    public void setGamesPlayed(String gamesPlayed) {
        GamesPlayed = gamesPlayed;
    }

    public String getMinutesPlayed() {
        return MinutesPlayed;
    }

    public void setMinutesPlayed(String minutesPlayed) {
        MinutesPlayed = minutesPlayed;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public double getItem_1() {
        return item_1;
    }

    public void setItem_1(double item_1) {
        this.item_1 = item_1;
    }

    public double getItem_2() {
        return item_2;
    }

    public void setItem_2(double item_2) {
        this.item_2 = item_2;
    }

    public double getItem_3() {
        return item_3;
    }

    public void setItem_3(double item_3) {
        this.item_3 = item_3;
    }

    public double getItem_4() {
        return item_4;
    }

    public void setItem_4(double item_4) {
        this.item_4 = item_4;
    }

    public double getItem_5() {
        return item_5;
    }

    public void setItem_5(double item_5) {
        this.item_5 = item_5;
    }

    public double getItem_6() {
        return item_6;
    }

    public void setItem_6(double item_6) {
        this.item_6 = item_6;
    }

    public double getItem_7() {
        return item_7;
    }

    public void setItem_7(double item_7) {
        this.item_7 = item_7;
    }

    public double getItem_8() {
        return item_8;
    }

    public void setItem_8(double item_8) {
        this.item_8 = item_8;
    }

    public double getItem_9() {
        return item_9;
    }

    public void setItem_9(double item_9) {
        this.item_9 = item_9;
    }

    public double getItem_10() {
        return item_10;
    }

    public void setItem_10(double item_10) {
        this.item_10 = item_10;
    }

    public double getItem_11() {
        return item_11;
    }

    public void setItem_11(double item_11) {
        this.item_11 = item_11;
    }

    public double getItem_12() {
        return item_12;
    }

    public void setItem_12(double item_12) {
        this.item_12 = item_12;
    }

    public double getItem_13() {
        return item_13;
    }

    public void setItem_13(double item_13) {
        this.item_13 = item_13;
    }

    public double getItem_14() {
        return item_14;
    }

    public void setItem_14(double item_14) {
        this.item_14 = item_14;
    }

    public double getItem_15() {
        return item_15;
    }

    public void setItem_15(double item_15) {
        this.item_15 = item_15;
    }

    public double getItem_16() {
        return item_16;
    }

    public void setItem_16(double item_16) {
        this.item_16 = item_16;
    }

    public double getItem_17() {
        return item_17;
    }

    public void setItem_17(double item_17) {
        this.item_17 = item_17;
    }

    public double getItem_18() {
        return item_18;
    }

    public void setItem_18(double item_18) {
        this.item_18 = item_18;
    }

    public double getItem_19() {
        return item_19;
    }

    public void setItem_19(double item_19) {
        this.item_19 = item_19;
    }

    public double getItem_20() {
        return item_20;
    }

    public void setItem_20(double item_20) {
        this.item_20 = item_20;
    }

    public double getItem_21() {
        return item_21;
    }

    public void setItem_21(double item_21) {
        this.item_21 = item_21;
    }

    public double getItem_22() {
        return item_22;
    }

    public void setItem_22(double item_22) {
        this.item_22 = item_22;
    }

    public double getItem_23() {
        return item_23;
    }

    public void setItem_23(double item_23) {
        this.item_23 = item_23;
    }

    public double getItem_24() {
        return item_24;
    }

    public void setItem_24(double item_24) {
        this.item_24 = item_24;
    }

    public double getItem_25() {
        return item_25;
    }

    public void setItem_25(double item_25) {
        this.item_25 = item_25;
    }

    public double getItem_26() {
        return item_26;
    }

    public void setItem_26(double item_26) {
        this.item_26 = item_26;
    }

    public double getItem_27() {
        return item_27;
    }

    public void setItem_27(double item_27) {
        this.item_27 = item_27;
    }

    public double getItem_28() {
        return item_28;
    }

    public void setItem_28(double item_28) {
        this.item_28 = item_28;
    }

    public double getItem_29() {
        return item_29;
    }

    public void setItem_29(double item_29) {
        this.item_29 = item_29;
    }

    public double getItem_30() {
        return item_30;
    }

    public void setItem_30(double item_30) {
        this.item_30 = item_30;
    }

    public double getItem_31() {
        return item_31;
    }

    public void setItem_31(double item_31) {
        this.item_31 = item_31;
    }

    public double getItem_32() {
        return item_32;
    }

    public void setItem_32(double item_32) {
        this.item_32 = item_32;
    }

    public double getItem_33() {
        return item_33;
    }

    public void setItem_33(double item_33) {
        this.item_33 = item_33;
    }

    public double getItem_34() {
        return item_34;
    }

    public void setItem_34(double item_34) {
        this.item_34 = item_34;
    }

    public double getItem_35() {
        return item_35;
    }

    public void setItem_35(double item_35) {
        this.item_35 = item_35;
    }

    public double getItem_36() {
        return item_36;
    }

    public void setItem_36(double item_36) {
        this.item_36 = item_36;
    }

    public double getItem_37() {
        return item_37;
    }

    public void setItem_37(double item_37) {
        this.item_37 = item_37;
    }

    public double getItem_38() {
        return item_38;
    }

    public void setItem_38(double item_38) {
        this.item_38 = item_38;
    }

    public double getItem_39() {
        return item_39;
    }

    public void setItem_39(double item_39) {
        this.item_39 = item_39;
    }

    public double getItem_40() {
        return item_40;
    }

    public void setItem_40(double item_40) {
        this.item_40 = item_40;
    }

    public double getItem_41() {
        return item_41;
    }

    public void setItem_41(double item_41) {
        this.item_41 = item_41;
    }

    public double getItem_42() {
        return item_42;
    }

    public void setItem_42(double item_42) {
        this.item_42 = item_42;
    }

    public double getItem_43() {
        return item_43;
    }

    public void setItem_43(double item_43) {
        this.item_43 = item_43;
    }

    public double getItem_44() {
        return item_44;
    }

    public void setItem_44(double item_44) {
        this.item_44 = item_44;
    }

    public double getItem_45() {
        return item_45;
    }

    public void setItem_45(double item_45) {
        this.item_45 = item_45;
    }

    public double getItem_46() {
        return item_46;
    }

    public void setItem_46(double item_46) {
        this.item_46 = item_46;
    }

    public double getItem_47() {
        return item_47;
    }

    public void setItem_47(double item_47) {
        this.item_47 = item_47;
    }

    public double getItem_48() {
        return item_48;
    }

    public void setItem_48(double item_48) {
        this.item_48 = item_48;
    }
}

