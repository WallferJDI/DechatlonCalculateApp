package service.calculator;

import utils.DecathlonEvents;

public class CalculatorPointsTrackEventsImpl implements CalculatorPointsService  {

    @Override
    public Integer calculate(DecathlonEvents decathlonEvents, Double performance) {
        Double points = decathlonEvents.getA() * Math.pow(decathlonEvents.getB() - performance,decathlonEvents.getC());
        return points.intValue();
    }
}
