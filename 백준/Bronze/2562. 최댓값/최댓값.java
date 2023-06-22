import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        String[] arrCopy = new String[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            arrCopy[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[8]);
        System.out.println(Arrays.asList(arrCopy).indexOf(String.valueOf(arr[8]))+1);
        bufferedReader.close();
    }
}
