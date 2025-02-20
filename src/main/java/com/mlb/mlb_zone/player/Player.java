package com.mlb.mlb_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {
    @Id
    @Column(name = "player_name", unique = true)
    private String name;
    private Integer age;
    private String pos;
    private Float war;
    private Integer g;
    private Integer pa;
    private Integer ab;
    private Integer r;
    private Integer h;
    private Integer secondBase;
    private Integer thirdBase;
    private Integer hr;
    private Integer rbi;
    private Integer sb;
    private Integer cs;
    private Integer bb;
    private Integer so;
    private Float ba;
    private Float obp;
    private Float slg;
    private Float ops;
    private Float opsPlus;
    private Float roba;
    private Integer rbat;
    private Integer tb;
    private Integer gidp;
    private Integer hbp;
    private Integer sh;
    private Integer sf;
    private Integer ibp;
    private String teamName;

    public Player() {
    }

    public Player(String name, Integer age, String pos, Float war, Integer g, Integer pa, Integer ab, Integer r, Integer h, Integer secondBase, Integer thirdBase, Integer hr, Integer rbi, Integer sb, Integer cs, Integer bb, Integer so, Float ba, Float obp, Float slg, Float ops, Float opsPlus, Float roba, Integer rbat, Integer tb, Integer gidp, Integer hbp, Integer sh, Integer sf, Integer ibp, String teamName) {
        this.name = name;
        this.age = age;
        this.pos = pos;
        this.war = war;
        this.g = g;
        this.pa = pa;
        this.ab = ab;
        this.r = r;
        this.h = h;
        this.secondBase = secondBase;
        this.thirdBase = thirdBase;
        this.hr = hr;
        this.rbi = rbi;
        this.sb = sb;
        this.cs = cs;
        this.bb = bb;
        this.so = so;
        this.ba = ba;
        this.obp = obp;
        this.slg = slg;
        this.ops = ops;
        this.opsPlus = opsPlus;
        this.roba = roba;
        this.rbat = rbat;
        this.tb = tb;
        this.gidp = gidp;
        this.hbp = hbp;
        this.sh = sh;
        this.sf = sf;
        this.ibp = ibp;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Float getWar() {
        return war;
    }

    public void setWar(Float war) {
        this.war = war;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getPa() {
        return pa;
    }

    public void setPa(Integer pa) {
        this.pa = pa;
    }

    public Integer getAb() {
        return ab;
    }

    public void setAb(Integer ab) {
        this.ab = ab;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(Integer secondBase) {
        this.secondBase = secondBase;
    }

    public Integer getThirdBase() {
        return thirdBase;
    }

    public void setThirdBase(Integer thirdBase) {
        this.thirdBase = thirdBase;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getRbi() {
        return rbi;
    }

    public void setRbi(Integer rbi) {
        this.rbi = rbi;
    }

    public Integer getSb() {
        return sb;
    }

    public void setSb(Integer sb) {
        this.sb = sb;
    }

    public Integer getCs() {
        return cs;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }

    public Integer getBb() {
        return bb;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public Integer getSo() {
        return so;
    }

    public void setSo(Integer so) {
        this.so = so;
    }

    public Float getBa() {
        return ba;
    }

    public void setBa(Float ba) {
        this.ba = ba;
    }

    public Float getObp() {
        return obp;
    }

    public void setObp(Float obp) {
        this.obp = obp;
    }

    public Float getSlg() {
        return slg;
    }

    public void setSlg(Float slg) {
        this.slg = slg;
    }

    public Float getOps() {
        return ops;
    }

    public void setOps(Float ops) {
        this.ops = ops;
    }

    public Float getOpsPlus() {
        return opsPlus;
    }

    public void setOpsPlus(Float opsPlus) {
        this.opsPlus = opsPlus;
    }

    public Float getRoba() {
        return roba;
    }

    public void setRoba(Float roba) {
        this.roba = roba;
    }

    public Integer getRbat() {
        return rbat;
    }

    public void setRbat(Integer rbat) {
        this.rbat = rbat;
    }

    public Integer getTb() {
        return tb;
    }

    public void setTb(Integer tb) {
        this.tb = tb;
    }

    public Integer getGidp() {
        return gidp;
    }

    public void setGidp(Integer gidp) {
        this.gidp = gidp;
    }

    public Integer getHbp() {
        return hbp;
    }

    public void setHbp(Integer hbp) {
        this.hbp = hbp;
    }

    public Integer getSh() {
        return sh;
    }

    public void setSh(Integer sh) {
        this.sh = sh;
    }

    public Integer getSf() {
        return sf;
    }

    public void setSf(Integer sf) {
        this.sf = sf;
    }

    public Integer getIbp() {
        return ibp;
    }

    public void setIbp(Integer ibp) {
        this.ibp = ibp;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
