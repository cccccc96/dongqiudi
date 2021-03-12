package com.hzr.project.model;

public class Text {
    private String round;
    private String winner;
    private String loser;
    private String time;
    private String winnerText;
    private String loserText;
    private String place;

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getLoser() {
        return loser;
    }

    public void setLoser(String loser) {
        this.loser = loser;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWinnerText() {
        return winnerText;
    }

    public void setWinnerText(String winnerText) {
        this.winnerText = winnerText;
    }

    public String getLoserText() {
        return loserText;
    }

    public void setLoserText(String loserText) {
        this.loserText = loserText;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "text{" +
                "round='" + round + '\'' +
                ", winner='" + winner + '\'' +
                ", loser='" + loser + '\'' +
                ", time='" + time + '\'' +
                ", winnerText='" + winnerText + '\'' +
                ", loserText='" + loserText + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
