package homework12;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tak4 {
    public static void main(String[] args) {
        String originText = "Lose eyes get fat shew.";
        String[] str = originText.split("");
        Stream<String> stream = Arrays.stream(str);
        Long counting = stream.map(s->s.split(""))
                .collect(Collectors.counting());

        System.out.println(counting);
    }
}
