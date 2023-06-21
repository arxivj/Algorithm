import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = bufferedReader.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        int result = (a+b)*(a-b);
        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
