public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100;
        float length = 1.72F;
        float index = service.calculate(weight, length);
        System.out.println(index);
    }
}
