import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger multiply = new BigInteger("1");
        for(String number : bufferedReader.readLine().split(" ")){
            multiply = multiply.multiply(new BigInteger(number));
        }
        bufferedWriter.write(String.valueOf(multiply));
        bufferedReader.close();
        bufferedWriter.close();
    }
}