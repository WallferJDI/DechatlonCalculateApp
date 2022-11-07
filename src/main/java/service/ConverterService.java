package service;

import configuration.AppConfig;
import model.Athletic;
import utils.DecathlonEvents;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ConverterService {


    public List<Athletic> convertToAthleticList(List<String> lineList) throws FileNotFoundException {
        List<Athletic> athleticList = new ArrayList<>();
        lineList.forEach((line)->athleticList.add(writeAthleticPerformance(line)));
        return athleticList;
    }

    private Athletic writeAthleticPerformance(String line){
        String[] performances = line.split(AppConfig.REGEX);
        Athletic athletic = new Athletic();
        athletic.setName(performances[DecathlonEvents.NAME.getIndex()]);
        athletic.setLongJump(Double.valueOf(performances[DecathlonEvents.LONG_JUMP.getIndex()]));
        athletic.setRace100m(Double.valueOf(performances[DecathlonEvents.RACE_100.getIndex()]));
        athletic.setShotPut(Double.valueOf(performances[DecathlonEvents.SHOT_PUT.getIndex()]));
        athletic.setHighJump(Double.valueOf(performances[DecathlonEvents.HIGH_JUMP.getIndex()]));
        athletic.setRace400m(Double.valueOf(performances[DecathlonEvents.RACE_400.getIndex()]));
        athletic.setRace110m(Double.valueOf(performances[DecathlonEvents.HURDLES.getIndex()]));
        athletic.setDiscusThrow(Double.valueOf(performances[DecathlonEvents.DISCUS_THROW.getIndex()]));
        athletic.setPoleVault(Double.valueOf(performances[DecathlonEvents.POLE_VAULT.getIndex()]));
        athletic.setJavelinThrow(Double.valueOf(performances[DecathlonEvents.JAVELIN_THROW.getIndex()]));
        athletic.setRace1500m(performances[DecathlonEvents.RACE_1500.getIndex()]);
        return athletic;

    }
}
