package service.calculator;

import utils.DecathlonEvents;

public interface CalculatorPointsService {
     Integer calculate(DecathlonEvents decathlonEvents, Double performance);
}
