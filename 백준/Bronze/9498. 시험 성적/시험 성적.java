import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        long input = Long.parseLong(bufferedReader.readLine());

        if(input>89){
            bufferedWriter.write("A");
        }else if(input>79){
            bufferedWriter.write("B");
        }else if(input>69){
            bufferedWriter.write("C");
        }else if(input>59){
            bufferedWriter.write("D");
        }else{
            bufferedWriter.write("F");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}

