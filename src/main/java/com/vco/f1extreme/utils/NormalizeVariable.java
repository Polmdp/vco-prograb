package main.java.com.vco.f1extreme.utils;

public class NormalizeVariable {
    public static double normalizeVariable(float variable,float idealValue) {
        float maxValue = 10;
        float minValue = 1;
        float normalizedVariable = (variable - minValue) / (maxValue - minValue) * 5;
        float roundedNormalizedVariable = (float) (Math.round(normalizedVariable * 100) / 100.0);

        // If the variable is less than the ideal value, set the normalized variable to the ideal value.
        if (roundedNormalizedVariable < idealValue) {
            roundedNormalizedVariable = idealValue;
        }

        return roundedNormalizedVariable;
    }
}
