import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] set = bufferedReader.readLine().split(" ");
        BigInteger totalMoney = new BigInteger(set[0]);
        BigInteger totalPeople = new BigInteger(set[1]);
        BigInteger moneyPerPerson = totalMoney.divide(totalPeople);
        BigInteger remainMoney = totalMoney.remainder(totalPeople);

        bufferedWriter.write(String.valueOf(moneyPerPerson));
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(remainMoney));
        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}