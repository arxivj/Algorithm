import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = bufferedReader.readLine().split(" ");
        long a = Integer.parseInt(input[0]);
        long b = Integer.parseInt(input[1]);

        if(a>b){
            bufferedWriter.write(">");
        } else if (a<b) {
            bufferedWriter.write("<");
        }else if (a==b){
            bufferedWriter.write("==");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
