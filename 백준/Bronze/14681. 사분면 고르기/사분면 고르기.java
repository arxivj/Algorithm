import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long x = Long.parseLong(bufferedReader.readLine());
        long y = Long.parseLong(bufferedReader.readLine());

        if(x>0&&y>0){
            System.out.println("1");
        } else if (x>0&&y<0) {
            System.out.println("4");
        } else if (x<0&&y>0) {
            System.out.println("2");
        } else if (x<0&&y<0) {
            System.out.println("3");
        }
        bufferedReader.close();
    }
}

