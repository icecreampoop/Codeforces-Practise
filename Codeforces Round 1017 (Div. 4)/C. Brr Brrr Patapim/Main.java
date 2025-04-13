import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sizeString, line;
        StringBuilder sb = new StringBuilder();
        int sizeInt;
        String[] tempStrings;
        var map = new HashMap<Integer, Integer>();

        br.readLine(); // first input is bait
        while ((sizeString = br.readLine()) != null) {
            sizeInt = Integer.parseInt(sizeString);

            for (int x = 0; x < sizeInt; x++) {
                line = br.readLine();
                for (int y = 0; y < sizeInt; y++) {
                    tempStrings = line.split(" ");
                    map.putIfAbsent(x + y + 2, Integer.parseInt(tempStrings[y]));
                }

                if (map.size() == sizeInt * 2 - 1) break;
            }

            for (int x = 1; x <= sizeInt * 2; x++) {
                if (!map.containsValue(x)) map.put(1, x);
            }

            for (int x : map.keySet()) {
                sb.append(map.get(x) + " ");
            }

            System.out.println(sb.toString().trim());
            sb.setLength(0);
            map.clear();
        }

    }
}