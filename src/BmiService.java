public class BmiService {
    public double calculate(int mass, float height) {
        double index = (mass / Math.pow (height,2));
        return index;
    }
}
