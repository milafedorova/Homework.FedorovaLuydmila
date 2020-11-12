package homework12;

import java.util.Arrays;
import java.util.Optional;

public class task3 {
    public static void main(String[] args) {
        Integer[] integ = new Integer[100];
        for(int i =0; i < integ.length; i++){
            integ[i] = i + 101;
        }
        Optional<Integer> a = Arrays.stream(integ)
                .filter(i -> i%2==0)
                .reduce((i,b) -> i + b);

        System.out.println(a);
    }
}
