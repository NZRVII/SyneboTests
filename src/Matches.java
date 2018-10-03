import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Shadowdancer on 03.10.2018.
 */
public class Matches {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int sqares = Integer.parseInt(in.readLine());

        if (1<= sqares && sqares <= 1000000000) {
            double x = Math.floor(Math.sqrt(sqares));
            double y = Math.ceil((sqares / Math.sqrt(sqares)));
            System.out.println((int)(x + y + (2 * sqares)));
        }else {
            System.out.println(" out of: (1 ≤ n ≤ 10^9)");
        }
    }
}
