public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double a = 2;
        int height = (int) a;

        int weight = 98;
        int myBMI = service.calculate(2, 98);
        System.out.println(myBMI);
    }
}
