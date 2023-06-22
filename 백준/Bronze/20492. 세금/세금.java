import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long input = Long.parseLong(bufferedReader.readLine());
        long netPay = (long) (input*(0.78));
        long necessary = (long) (input-((input*0.2)*0.22));
        bufferedWriter.write(String.valueOf(netPay));
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(necessary));
        bufferedReader.close();
        bufferedWriter.close();
    }
}

