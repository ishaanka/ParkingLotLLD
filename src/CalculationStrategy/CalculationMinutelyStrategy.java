package CalculationStrategy;

public class CalculationMinutelyStrategy implements ICalculationStrategy {
    @Override
    public int calculatePrice(int price,int time) {
        return price * 60 * time;
    }
}
