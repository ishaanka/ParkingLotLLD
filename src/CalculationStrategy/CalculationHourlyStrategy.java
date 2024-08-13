package CalculationStrategy;

public class CalculationHourlyStrategy implements ICalculationStrategy {
    @Override
    public int calculatePrice(int price,int time) {
        return price * time;
    }
}
