import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> welcome = new ArrayList<>();
        welcome.add(".  .   .");
        welcome.add("|  | _ | _. _ ._ _  _");
        welcome.add("|/\\|(/.|(_.(_)[ | )(/.");

        for(String line : welcome){
            System.out.println(line);
        }
    }
}

