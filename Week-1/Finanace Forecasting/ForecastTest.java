public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = FinancialForecast.forecastValue(presentValue, growthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);

        double[] memo = new double[years + 1];
        double futureValueMemo = FinancialForecast.forecastMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future value (memoized) after %d years: %.2f%n", years, futureValueMemo);
    }
}
