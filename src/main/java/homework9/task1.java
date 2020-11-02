package homework9;

import java.io.*;

public class task1 {
    public static void search(String path, String str) {
        int sum = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String s;
            while ((s=br.readLine()) !=null){
                int i = s.indexOf(str);
                while (i>=0){
                    sum++;
                    i = s.indexOf(str, i+1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Последовательность " + str + " встречалась в файле " + sum + " раз");
    }



    public static void main(String[] args) {
        search("C:\\Users\\ВТБ\\IdeaProjects\\untitled\\src\\main\\java\\homework9\\demo.txt", "He");
    }
}
