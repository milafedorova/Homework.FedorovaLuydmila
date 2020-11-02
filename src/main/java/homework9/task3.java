package homework9;

import java.io.File;

public class task3 {

    public static void deleteFolder(File folder){
        for (File item : folder.listFiles()){
            if (item.isDirectory()){
                deleteFolder(item);
            }
            item.delete();
        }
    }

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\ВТБ\\Desktop\\test\\test1\\");
        deleteFolder(folder);
    }
}
