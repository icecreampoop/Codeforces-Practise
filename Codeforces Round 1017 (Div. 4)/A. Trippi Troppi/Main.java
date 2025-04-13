import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String next;
        String[] temp;

        br.readLine(); // first input is bait
        while ((next = br.readLine()) != null) {
            temp = next.split(" ");

            for (String x : temp) {
                sb.append(x.charAt(0));
            }

            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}