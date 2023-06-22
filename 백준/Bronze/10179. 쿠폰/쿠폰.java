import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < loop; i++) {
           double input = Double.parseDouble(bufferedReader.readLine());
           double result = (double) Math.round(input*0.8 * 1000)/1000;
           bufferedWriter.write("$"+String.format("%.2f",result));
           bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

