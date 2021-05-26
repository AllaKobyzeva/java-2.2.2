public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double weight = 59.2;
        double height = 1.72; // в метрах
        double bmi = service.calculate(weight,height);
        double bmi2 = Math.round(bmi*10.0)/10.0;
        System.out.println(bmi2);
    }
}