import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//        BigInteger input = new BigInteger(bufferedReader.readLine());
//        String sInput = input.toString();
        String input = bufferedReader.readLine();
        long modulo = 0;
        for(int i=0; i<input.length(); i++){
            modulo = (modulo*10+(input.charAt(i)-'0'))%20000303;
        }
        bufferedWriter.write(String.valueOf(modulo));
        bufferedReader.close();
        bufferedWriter.close();
    }
}
