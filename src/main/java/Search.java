import java.io.*;
import java.util.ArrayList;

public class Search {
    private final ArrayList<String> list = new ArrayList<>(); //implement array list

    public void searching() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\sa\\dictionary\\slovar.txt"));
        String str;
        while ((str = reader.readLine()) != null) { //file reading while file is not finished
            if (!str.isEmpty()) {
                list.add(str); //adding words to list while file is not empty
            }
        }
        reader.close(); //close the stream

        //searching word
        System.out.println("Введите слово");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine(); //reading the input
        if (list.contains(s)) { //searching the word in list
            System.out.println("Такое слово есть!" + " Индекс слова: " + list.indexOf(s));
        } else {
            System.out.println("Извините, но такое слово не найдено. Повторите попытку");
        }
    }
}
