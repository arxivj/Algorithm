import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = bufferedReader.readLine().split(" ");
        long n = Integer.parseInt(input[0]);
        long t = Integer.parseInt(input[1]);
        long c = Integer.parseInt(input[2]);
        long p = Integer.parseInt(input[3]);
        long i = 0;
        long first = (t+1);
        while(n>=t+1){
            long harvest = (t+1)+(t*i++);
            if(harvest>n){
                i = i-1;
                break;
            } else if (harvest==n){
                break;
            }
        }
        long result = i*c*p;

        bufferedWriter.write(String.valueOf(result));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
