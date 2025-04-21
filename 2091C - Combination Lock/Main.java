import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int temp, count = 0;
        StringBuilder sb = new StringBuilder();

        br.readLine();
        while ((line = br.readLine()) != null) {
            if (Integer.parseInt(line) % 2 == 0) {
                System.out.println("-1");
                continue;
            }

            temp = Integer.parseInt(line);

            for (int x = 1; x <= temp; x++) {
                // if n = 5, 5%5=0 but we want 5 instead
                if ((x + count)%temp == 0) sb.append(temp + " ");
                else sb.append((x + count)%temp + " ");
                count++;
            }

            System.out.println(sb.toString().trim());
            count=0;
            sb.setLength(0);
        }
    }
}