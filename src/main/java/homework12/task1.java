package homework12;

import java.util.Arrays;
import java.util.stream.Stream;

public class task1 {

    public static void main(String[] args) {
        String originText = "Lose eyes get fat shew. Winter can indeed letter oppose way change tended now. So is improve my charmed picture exposed adapted demands. Received had end produced prepared diverted strictly off man branched. Known ye money so large decay voice there to. Preserved be mr cordially incommode as an. He doors quick child an point at. Had share vexed front least style off why him. Oh acceptance apartments up sympathize astonished delightful. Waiting him new lasting towards. Continuing melancholy especially so to. Me unpleasing impossible in attachment announcing so astonished. What ask leaf may nor upon door. Tended remain my do stairs.";
        String[] str = originText.split(" ");
        Stream<String> stream = Arrays.stream(str);
        String reduce = stream.filter(word -> word.length() > 5)
                .reduce("",(a,b) -> a+" "+b);
        System.out.println(reduce);
    }
}
