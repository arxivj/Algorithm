import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long number = Integer.parseInt(bufferedReader.readLine());
        long finger = number%8;
        if(finger==0){
            bufferedWriter.write("2");
        } else if(finger==7){
            bufferedWriter.write("3");
        } else if(finger==6){
            bufferedWriter.write("4");
        } else {
            bufferedWriter.write(String.valueOf(finger));
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
