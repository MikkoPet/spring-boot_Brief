package com.scoretable.restapi.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "matches")

public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer scoreTeam1;
    private Integer scoreTeam2;
    private Date date;

    public Match() {}

    public Match(String name, Integer scoreTeam1, Integer scoreTeam2) {
        this.name = name;
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScoreTeam1() {
        return scoreTeam1;
    }

    public void setScoreTeam1(Integer score) {
        this.scoreTeam1 = score;
    }

    public Integer getScoreTeam2() {
        return scoreTeam2;
    }

    public void setScoreTeam2(Integer score) {
        this.scoreTeam2 = score;
    }
}
