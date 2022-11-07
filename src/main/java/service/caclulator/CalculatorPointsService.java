package service.caclulator;

import utils.DecathlonEvents;

public interface CalculatorPointsService {
     Integer calculate(DecathlonEvents decathlonEvents, Double performance);
}
