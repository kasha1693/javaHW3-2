public class BmiService {

    public int calculate(int height, int weight) {
        int bmi = weight / (height * height);
        return bmi;
    }
}
