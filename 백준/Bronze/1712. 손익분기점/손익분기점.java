import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");
        long a = Integer.parseInt(input[0]);
        long b = Integer.parseInt(input[1]);
        long c = Integer.parseInt(input[2]);
        long result = 0;
        if(b<c){
            result = a/(c-b)+1;
        } else {
            result = -1;
        }
//        long i=0;
//        while(true){
//            if(b<c) {
//                if (a + (b * i) < c * i) break;
//                i++;
//            } else {
//                i = -1;
//                break;
//            }
//        }
        System.out.println(result);
        bufferedReader.close();
    }
}

