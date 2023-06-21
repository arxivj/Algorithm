import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        int x = k/m;
        int y = k%m;

        bufferedWriter.write(String.valueOf(x)+" ");
        bufferedWriter.write(String.valueOf(y));
        bufferedReader.close();
        bufferedWriter.close();
    }
}