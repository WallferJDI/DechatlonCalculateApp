package service.caclulator;

import utils.DecathlonEvents;

public class CalculatorPointsFieldEventsImpl implements  CalculatorPointsService{
    @Override
    public Integer calculate(DecathlonEvents decathlonEvents, Double performance) {
        Double points = decathlonEvents.getA() * Math.pow(performance - decathlonEvents.getB(),decathlonEvents.getC());
        return points.intValue();
    }
}
