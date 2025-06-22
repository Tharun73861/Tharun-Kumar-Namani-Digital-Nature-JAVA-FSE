public class FinancialForecast {

    public static double forecastValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static double forecastMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = forecastMemo(presentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}
