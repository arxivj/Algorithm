import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long input = Long.parseLong(bufferedReader.readLine());
        long input2 = Long.parseLong(bufferedReader.readLine());
        long a = input2/100;
        long b = (input2/10)%10;
        long c = input2%10;
        System.out.println(input*c);
        System.out.println(input*b);
        System.out.println(input*a);
        System.out.println(input*input2);
        bufferedReader.close();
    }
}

