import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write(".  .   .");
        bufferedWriter.newLine();
        bufferedWriter.write("|  | _ | _. _ ._ _  _");
        bufferedWriter.newLine();
        bufferedWriter.write("|/\\|(/.|(_.(_)[ | )(/.");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}