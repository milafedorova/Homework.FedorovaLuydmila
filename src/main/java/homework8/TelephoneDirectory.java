package homework8;

import java.util.Collection;
import java.util.HashMap;

public class TelephoneDirectory {
    private HashMap<String, String> td = new HashMap<String , String>();

    public void add(String number, String firstname){
        this.td.put(number, firstname);
    }
    public void get(String firstname){
        Collection<String> collection = td.keySet();
        for (String key : collection){
            String fn = td.get(key);
            if (key != null){
                if (firstname.equals(fn)){
                    System.out.println(fn + " - " + key);
                }
            }
        }
    }

    public static void main(String[] args) {
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add("89067032722", "Ivanov");
        telephoneDirectory.add("89067032724", "Petrov");
        telephoneDirectory.add("89067032725", "Sidorov");
        telephoneDirectory.add("89067032726", "Simanov");
        telephoneDirectory.add("89067032727", "Ivanov");

        telephoneDirectory.get("Ivanov");
        telephoneDirectory.get("Sidorov");

    }
}
