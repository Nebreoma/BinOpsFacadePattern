public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        String result;
        int resultInt;

        resultInt = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);

        result = Integer.toBinaryString(resultInt);

        return result;
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        String result;
        int resultInt;

        resultInt = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);

        result = Integer.toBinaryString(resultInt);

        return result;
    }
}