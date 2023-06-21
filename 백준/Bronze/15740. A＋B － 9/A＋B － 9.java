import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = bufferedReader.readLine().split(" ");
        BigInteger A = new BigInteger(arr[0]);
        BigInteger B = new BigInteger(arr[1]);

        BigInteger add = A.add(B);

        bufferedWriter.write(String.valueOf(add));

        bufferedReader.close();
        bufferedWriter.close();
    }
}
