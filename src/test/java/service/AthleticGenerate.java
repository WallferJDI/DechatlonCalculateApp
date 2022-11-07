package service;

import model.Athletic;

public class AthleticGenerate {
    public Athletic createAthletic1(){
        Athletic athletic = new Athletic();
        athletic.setName("John Smith");
        athletic.setRace100m(12.61);
        athletic.setLongJump(5.00);
        athletic.setShotPut(9.22);
        athletic.setHighJump(1.50);
        athletic.setRace400m(60.39);
        athletic.setRace110m(16.43);
        athletic.setDiscusThrow(21.60);
        athletic.setPoleVault(2.60);
        athletic.setJavelinThrow(35.81);
        athletic.setRace1500m("5:25.72");
        return athletic;
    }
    public Athletic createAthletic2(){
        Athletic athletic = new Athletic();
        athletic.setName("Simon Var");
        athletic.setRace100m(11.61);
        athletic.setLongJump(5.00);
        athletic.setShotPut(9.22);
        athletic.setHighJump(1.50);
        athletic.setRace400m(60.39);
        athletic.setRace110m(16.43);
        athletic.setDiscusThrow(21.60);
        athletic.setPoleVault(2.60);
        athletic.setJavelinThrow(35.81);
        athletic.setRace1500m("6:25.72");
        return athletic;
    }
    public Athletic createAthletic3SameAs2(){
        Athletic athletic = new Athletic();
        athletic.setName("Simon Var 2");
        athletic.setRace100m(11.61);
        athletic.setLongJump(5.00);
        athletic.setShotPut(9.22);
        athletic.setHighJump(1.50);
        athletic.setRace400m(60.39);
        athletic.setRace110m(16.43);
        athletic.setDiscusThrow(21.60);
        athletic.setPoleVault(2.60);
        athletic.setJavelinThrow(35.81);
        athletic.setRace1500m("6:25.72");
        return athletic;
    }
}
