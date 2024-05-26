public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        String a = "11101000";
        String b = "00001000";
        System.out.println("SUM = " + bins.sum(a, b));
        System.out.println("MULT = " + bins.mult(a, b));
    }
}