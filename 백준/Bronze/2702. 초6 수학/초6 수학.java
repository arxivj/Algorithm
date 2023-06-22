import java.io.*;

public class Main {
    public static int euclidean(int a, int b) {
        if (b == 0)
            return a;
        return euclidean(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine());


        for (int i = 0; i < t; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            if (input.length != 2) {
                throw new IllegalArgumentException("Invalid input");
            }

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int grComDiv = euclidean(a, b);
            int loComMul = a * b / grComDiv;

            bufferedWriter.write(String.valueOf(loComMul) + " ");
            bufferedWriter.write(String.valueOf(grComDiv));
            bufferedWriter.newLine();
        }


        bufferedReader.close();
        bufferedWriter.close();
    }
}
