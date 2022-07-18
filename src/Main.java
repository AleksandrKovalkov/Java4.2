public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 61;
        double growht = 1.65;

        double bmi = service.calculate(weight, growht);

        System.out.println(bmi);

    }
}
