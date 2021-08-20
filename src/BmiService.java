public class BmiService {
    public float calculate(int mass, float height) {
        float index = mass / height / height;
        return index;
    }
}
