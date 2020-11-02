package homework9;

import java.io.*;

public class task2 {
    public static void toOneFile(String path){
        File folder = new File(path);
        File newFile = new File(path+"newFile.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fr = null;
        for (File item : folder.listFiles()){
            try{
                fr = new FileWriter(newFile, true);
                BufferedReader buffer = new BufferedReader(new FileReader(item));
                String s;
                while ((s=buffer.readLine()) != null){
                    fr.write(s+"\n");
                }
                fr.flush();
                fr.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        toOneFile("C:\\Users\\ВТБ\\IdeaProjects\\untitled\\src\\\\main\\java\\homework9\\");
    }
}
