import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(bufferedReader.readLine());
        BigInteger B = new BigInteger(bufferedReader.readLine());

        //A+B
        BigInteger add = A.add(B);
        //A-B
        BigInteger subtract = A.subtract(B);
        //AxB
        BigInteger multiply = A.multiply(B);

        bufferedWriter.write(String.valueOf(add));
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(subtract));
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(multiply));

        bufferedReader.close();
        bufferedWriter.close();

    }
}
