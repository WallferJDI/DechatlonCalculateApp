package utils;

import service.calculator.CalculatorPointsFieldEventsImpl;
import service.calculator.CalculatorPointsService;
import service.calculator.CalculatorPointsTrackEventsImpl;

public enum DecathlonEvents {
    NAME(0),
    RACE_100(1,new CalculatorPointsTrackEventsImpl(), 25.4347,18.0,1.81),
    LONG_JUMP(2,new CalculatorPointsTrackEventsImpl(),0.14354,220.0,1.4),
    SHOT_PUT(3,new CalculatorPointsFieldEventsImpl(),51.39,1.5,1.05),
    HIGH_JUMP(4,new CalculatorPointsTrackEventsImpl(),0.8465,75.0,1.42),
    RACE_400(5,new CalculatorPointsTrackEventsImpl(),1.53775,82.0,1.81),
    HURDLES(6,new CalculatorPointsTrackEventsImpl(),5.74352,28.5,1.92),
    DISCUS_THROW(7,new CalculatorPointsTrackEventsImpl(),12.91,4.0,1.1),
    POLE_VAULT(8,new CalculatorPointsTrackEventsImpl(),0.2797,100.0,1.35),
    JAVELIN_THROW(9,new CalculatorPointsTrackEventsImpl(),10.14,7.0,1.08),
    RACE_1500(10,new CalculatorPointsTrackEventsImpl(),0.03768,480.0,1.85);

    private Integer index;
    private CalculatorPointsService calculator;
    private Double a;
    private Double b;
    private Double c;


    public Integer calculatePoints(Double points){
        return calculator.calculate(this,points);
    }


    DecathlonEvents(Integer index) {
        this.index = index;
    }

    DecathlonEvents(Integer index, CalculatorPointsService calculator, Double a, Double b, Double c) {
        this.index = index;
        this.calculator = calculator;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer getIndex() {
        return index;
    }

    public CalculatorPointsService getCalculator() {
        return calculator;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }
}
