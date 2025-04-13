import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] tempStrings;
        int[] tempInts;
        int count;

        br.readLine(); // first input is bait
        while ((line = br.readLine()) != null) {
            //0 is days passed n, 1 is desired days m , 2 is starting infected l, 3 is ending infected r
            //1≤m≤n≤2000    range of numbers
            //−n≤l≤0≤r≤n    l is always negative or 0, r is always positive or 0
            //r−l=n
            tempStrings = line.split(" ");
            tempInts = new int[tempStrings.length];
            for (int x = 0; x < tempStrings.length; x++) {
                tempInts[x] = Integer.parseInt(tempStrings[x]);
            }

            count = tempInts[0] - tempInts[1];

            while (count > 0) {
                if (tempInts[3] - 1 >= 0) tempInts[3] = tempInts[3] - 1;
                else tempInts[2] = tempInts[2] + 1;
                count--;
            }

            System.out.println(tempInts[2] + " " + tempInts[3]);
        }
    }
}