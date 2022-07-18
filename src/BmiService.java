public class BmiService {

    public double calculate(int weight, double growht) {

        double bmi = weight / (growht * growht);

        return bmi;

    }
}
