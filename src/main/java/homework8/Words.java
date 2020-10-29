package homework8;

import java.util.ArrayList;
import java.util.HashMap;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("dog");
        words.add("fish");
        words.add("mouse");
        words.add("rabbit");
        words.add("cat");
        words.add("duck");
        words.add("cat");
        words.add("fish");
        words.add("parrot");
        words.add("dog");

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i < words.size(); i++){
            if (!hm.containsKey(words.get(i))){
                hm.put(words.get(i), 1);
            } else {
                int k = hm.get(words.get(i));
                hm.put(words.get(i), k+1);
            }
        }
        System.out.println(hm);

    }


}