package model;


import utils.DecathlonEvents;

import java.util.Objects;

public class Athletic {

    private String name;
    private Double race100m;
    private Double longJump;
    private Double shotPut;
    private Double highJump;
    private Double race400m;
    private Double race110m;
    private Double discusThrow;
    private Double poleVault;
    private Double javelinThrow;
    private Double race1500m;
    private String rank;
    private Integer points;



    public Integer calculatePoints(){
        return DecathlonEvents.RACE_100.calculatePoints(race100m) +
                DecathlonEvents.LONG_JUMP.calculatePoints(longJump)+
                DecathlonEvents.SHOT_PUT.calculatePoints(shotPut)+
                DecathlonEvents.HIGH_JUMP.calculatePoints(highJump)+
                DecathlonEvents.RACE_400.calculatePoints(race400m)+
                DecathlonEvents.HURDLES.calculatePoints(race110m)+
                DecathlonEvents.DISCUS_THROW.calculatePoints(discusThrow)+
                DecathlonEvents.POLE_VAULT.calculatePoints(poleVault)+
                DecathlonEvents.JAVELIN_THROW.calculatePoints(javelinThrow)+
                DecathlonEvents.RACE_1500.calculatePoints(race1500m);
    }
    public void setRace1500m(String race1500m) {
        String[] time =  race1500m.split(":") ;
        Double seconds = Double.valueOf(time[0])  * 60.0 + Double.valueOf(time[1]);
        this.race1500m = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athletic athletic = (Athletic) o;
        return name.equals(athletic.name) && race100m.equals(athletic.race100m) && longJump.equals(athletic.longJump) && shotPut.equals(athletic.shotPut) && highJump.equals(athletic.highJump) && race400m.equals(athletic.race400m) && race110m.equals(athletic.race110m) && discusThrow.equals(athletic.discusThrow) && poleVault.equals(athletic.poleVault) && javelinThrow.equals(athletic.javelinThrow) && race1500m.equals(athletic.race1500m);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, race100m, longJump, shotPut, highJump, race400m, race110m, discusThrow, poleVault, javelinThrow, race1500m);
    }

    @Override
    public String toString() {
        return "Athletic{" +
                "name='" + name + '\'' +
                ", race100m=" + race100m +
                ", longJump=" + longJump +
                ", shotPut=" + shotPut +
                ", highJump=" + highJump +
                ", race400m=" + race400m +
                ", race110m=" + race110m +
                ", discusThrow=" + discusThrow +
                ", poleVault=" + poleVault +
                ", javelinThrow=" + javelinThrow +
                ", race1500m=" + race1500m +
                ", rank='" + rank + '\'' +
                ", points=" + points +
                '}';
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getRace100m() {
        return race100m;
    }

    public Double getLongJump() {
        return longJump;
    }

    public Double getShotPut() {
        return shotPut;
    }

    public Double getHighJump() {
        return highJump;
    }

    public Double getRace400m() {
        return race400m;
    }

    public Double getRace110m() {
        return race110m;
    }

    public Double getDiscusThrow() {
        return discusThrow;
    }

    public Double getPoleVault() {
        return poleVault;
    }

    public Double getJavelinThrow() {
        return javelinThrow;
    }

    public Double getRace1500m() {
        return race1500m;
    }

    public void setRace100m(Double race100m) {
        this.race100m = race100m;
    }

    public void setLongJump(Double longJump) {
        this.longJump = longJump;
    }

    public void setShotPut(Double shotPut) {
        this.shotPut = shotPut;
    }

    public void setHighJump(Double highJump) {
        this.highJump = highJump;
    }

    public void setRace400m(Double race400m) {
        this.race400m = race400m;
    }

    public void setRace110m(Double race110m) {
        this.race110m = race110m;
    }

    public void setDiscusThrow(Double discusThrow) {
        this.discusThrow = discusThrow;
    }

    public void setPoleVault(Double poleVault) {
        this.poleVault = poleVault;
    }

    public void setJavelinThrow(Double javelinThrow) {
        this.javelinThrow = javelinThrow;
    }
}
