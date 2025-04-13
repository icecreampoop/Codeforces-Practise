import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String next, testcase;
    static int nextCount = 1, testCaseCount, tolerance, testcasemarker = 0;
    static char temp, temp1;

    private static boolean check() {
        temp1 = testcase.charAt(testcasemarker);
        tolerance--;
        testCaseCount = testcasemarker + 1;

        if (testcase.charAt(testcasemarker) != temp) {
            return false;
        }

        while (testcase.charAt(testCaseCount) == temp1) {
            tolerance--;

            if (tolerance <= 0)
                return false;
            temp1 = testcase.charAt(testCaseCount);
            testCaseCount++;
        }

        tolerance = 0;
        testcasemarker = testCaseCount + 1;
        return true;
    }

    public static void main(String[] args) throws IOException {
        br.readLine(); // first input is bait
        while ((next = br.readLine()) != null) {
            testcase = br.readLine();
            temp = next.charAt(0);
            tolerance = 2;

            while (next.length() > nextCount) {
                if (next.charAt(nextCount) == temp) {
                    tolerance += 2;
                } else {
                    if (!check()) {
                        System.out.println("NO");
                        break;
                    }
                }

                temp = next.charAt(nextCount);
                nextCount++;
            }

            if (nextCount == next.length())
                System.out.println("YES");
            nextCount = 1;
            testCaseCount = 1;
            tolerance = 0;
            testcasemarker = 0;
        }
    }
}