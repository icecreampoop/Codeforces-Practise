import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void check(int[] num1, int[] num2) {
        int odd = 0, even = 0;

        for (int x = 0; x < num1.length; x++) {
            if (x % 2 == 0) {
                if (num1[x] == 0)
                    even++;
            } else {
                if (num2[x] == 0)
                    even++;
            }
        }
        for (int x = 0; x < num1.length; x++) {
            if (x % 2 == 0) {
                if (num2[x] == 0)
                    odd++;
            } else {
                if (num1[x] == 0)
                    odd++;
            }
        }

        if (even >= num1.length / 2.0 && odd >= num1.length / 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String next;
        int[] num1 = new int[0], num2 = new int[0];

        br.readLine(); // first input is bait
        while ((next = br.readLine()) != null) {
            next = br.readLine();

            num1 = new int[next.length()];

            for (int x = 0; x < next.length(); x++) {
                num1[x] = next.charAt(x) - '0';
            }

            next = br.readLine();

            num2 = new int[next.length()];

            for (int x = 0; x < next.length(); x++) {
                num2[x] = next.charAt(x) - '0';
            }

            check(num1, num2);
        }
    }
}