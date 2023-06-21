import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long distance = Long.parseLong(bufferedReader.readLine());
        if(distance%5==0){
            bufferedWriter.write((String.valueOf(distance / 5L)));
        } else{
            bufferedWriter.write(String.valueOf(distance / 5L + 1));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}

