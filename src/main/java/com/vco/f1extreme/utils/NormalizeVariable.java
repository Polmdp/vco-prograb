package main.java.com.vco.f1extreme.utils;

public class NormalizeVariable {
    public static double normalizeVariable(double variable,double minValue,double maxValue) {
        double normalizedVariable = (variable - minValue) / (maxValue - minValue) * 5;
        double roundedNormalizedVariable = Math.round(normalizedVariable * 100) / 100.0;

        return roundedNormalizedVariable;
    }

//    public static void main(String[] args) {
//        double variable = 12;
//        double normalizedVariable = normalizeVariable(variable);
//        System.out.println("The normalized variable is " + normalizedVariable);
//    }
}
