import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String id = bufferedReader.readLine();
        boolean isValid = id.length() <= 50 && id.matches("^[a-z]+$");

        if (isValid && id.equals(id)) {
            bufferedWriter.write(id + "??!");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}

