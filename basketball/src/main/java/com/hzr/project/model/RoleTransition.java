package com.hzr.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Hu Zirui
 * @version 1.0.0
 * @ClassName RoleTransition.java
 * @Description TODO
 * @createTime 2021年03月16日 14:13:00
 */
@Entity
@Table(name = "NCAA_NBA")
public class RoleTransition {
    @Id
    private int playerId;
    private String playerName;
    private String currentRole;
    private String predicted_role;
    private String labels;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String currentRole) {
        this.currentRole = currentRole;
    }

    public String getPredicted_role() {
        return predicted_role;
    }

    public void setPredicted_role(String predicted_role) {
        this.predicted_role = predicted_role;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "RoleTransition{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", currentRole='" + currentRole + '\'' +
                ", predicted_role='" + predicted_role + '\'' +
                ", labels='" + labels + '\'' +
                '}';
    }
}
