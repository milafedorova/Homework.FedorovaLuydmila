package homework12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task2 {

    public static void main(String[] args) {
        String[][] strDim = new String[5][5];
        strDim[0][0] = "Lose";
        strDim[0][1] = "eyes";
        strDim[0][2] = "get";
        strDim[0][3] = "fat";
        strDim[0][4] = "shew";
        strDim[1][0] = "Winter";
        strDim[1][1] = "can";
        strDim[1][2] = "indeed";
        strDim[1][3] = "letter";
        strDim[1][4] = "oppose";
        strDim[2][0] = "Lose";
        strDim[2][1] = "eyes";
        strDim[2][2] = "get";
        strDim[2][3] = "fat";
        strDim[2][4] = "shew";
        strDim[3][0] = "Winter";
        strDim[3][1] = "can";
        strDim[3][2] = "indeed";
        strDim[3][3] = "letter";
        strDim[3][4] = "oppose";
        strDim[4][0] = "Lose";
        strDim[4][1] = "indeed";
        strDim[4][2] = "change";
        strDim[4][3] = "tended";
        strDim[4][4] = "letter";

        List<String> uniq = Arrays.stream(strDim)
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniq);





    }
}
