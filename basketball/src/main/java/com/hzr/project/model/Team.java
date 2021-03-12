package com.hzr.project.model;

public class Team {
    private String team;
    private String createTime;
    private String city;
    private String star;
    private String content;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team='" + team + '\'' +
                ", createTime='" + createTime + '\'' +
                ", city='" + city + '\'' +
                ", star='" + star + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
