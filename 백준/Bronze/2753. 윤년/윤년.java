import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long year = Long.parseLong(bufferedReader.readLine());
        long result = 0;
        if((year%4==0 && year%100!=0) || year%400==0) result=1;
        else result=0;

        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }
}

