import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Shadowdancer on 03.10.2018.
 */
public class TheFactorial {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int result = 0;
        do {
            n /= (++result);
        }
        while (n > 1);

        System.out.println(result);
    }
}
