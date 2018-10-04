import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Shadowdancer on 03.10.2018.
 */
public class TheFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(in.readLine());
        int result = 0;
        do {
            n = n.divide(new BigInteger(Integer.toString(++result)));
        }
        while (n.compareTo(BigInteger.ONE) == 1);
        System.out.println(result);
    }
}
