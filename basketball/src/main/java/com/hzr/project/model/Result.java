package com.hzr.project.model;

import java.util.Objects;


public class Result {
    private String wteam;
    private String lteam;
    private double probability;
    private String date;

    public String getWteam() {
        return wteam;
    }

    public void setWteam(String wteam) {
        this.wteam = wteam;
    }

    public String getLteam() {
        return lteam;
    }

    public void setLteam(String lteam) {
        this.lteam = lteam;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "result{" +
                "wteam='" + wteam + '\'' +
                ", lteam='" + lteam + '\'' +
                ", probability=" + probability +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Double.compare(result.probability, probability) == 0 && Objects.equals(wteam, result.wteam) && Objects.equals(lteam, result.lteam) && Objects.equals(date, result.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wteam, lteam, probability, date);
    }
}
