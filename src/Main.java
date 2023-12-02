public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        double BMI = service.calculate(98, 1.87);
        int myBMI = (int) BMI;
        System.out.println(myBMI);
    }
}
