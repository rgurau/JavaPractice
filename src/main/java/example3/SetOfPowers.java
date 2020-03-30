package example3;

import java.util.HashSet;
import java.util.Set;

public class SetOfPowers {
    public void returnPowers(int n, int m) {
        Set<Double> values = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                values.add(Math.pow(i, j));
            }
        }

        System.out.println(values);
    }
}
