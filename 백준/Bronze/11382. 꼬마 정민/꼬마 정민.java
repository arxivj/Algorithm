import java.io.*;
import java.math.BigInteger;

public class Main {
    private static BigInteger a;
    private static BigInteger b;
    private static BigInteger c;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = bufferedReader.readLine().split(" ");

        //첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
        BigInteger power = new BigInteger("1000000000000");
        a = new BigInteger(arr[0]);
        b = new BigInteger(arr[1]);
        c = new BigInteger(arr[2]);
        if (a.compareTo(BigInteger.ONE) >= 0) {
            if (c.compareTo(power) <= 0) {
                BigInteger add = (a.add(b)).add(c);
                bufferedWriter.write(String.valueOf(add));
            }
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}