package com.hzr.project.model;

public class Player {
    private String Team;
    private String player;
    private String age;
    private String content;
    private String position;
    private String salary;

    @Override
    public String toString() {
        return "Player{" +
                "Team='" + Team + '\'' +
                ", player='" + player + '\'' +
                ", age='" + age + '\'' +
                ", content='" + content + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
