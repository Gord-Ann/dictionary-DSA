import java.io.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/*
public class Sort {
    private ArrayList<String> list= new ArrayList<String>(); //implement array list

    public void sorting() throws IOException {
        //getting from file
        BufferedReader reader = new BufferedReader(new FileReader("D:\\sa\\dictionary\\slovar.txt"));
        String str;
        while ((str = reader.readLine()) != null) { //file reading while file is not finished
            if (!str.isEmpty()) {
                list.add(str); //adding words to list while file is not empty
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        reader.close(); //close the stream
        System.out.println(list);
        //sorting
        Collator coll = Collator.getInstance(new Locale("ru", "RU")); //getting russian locale
        coll.setStrength(Collator.IDENTICAL);
        Collections.sort(list, coll);
        String[] arrayWords = list.toArray(new String[0]); //getting sorted array with all elements of list
        //for (int i = 0; i < arrayWords.length; i++) {
          //  System.out.println(arrayWords[i]);
        //}



        //recording in file
        BufferedWriter out = new BufferedWriter(new FileWriter("D:\\sa\\dictionary\\slovarSort.txt"));
        StringBuilder result = new StringBuilder();
        for (String arrayWord : arrayWords) {
            result.append(arrayWord).append("\n");
        }
        out.write(result.toString());
        out.flush();
        out.close(); // close the stream
        System.out.println("Sorted!");
    }

}

 */

public class Sort {
    private ArrayList<String> list = new ArrayList<String>(); //Реализация списка массивов

    public void sorting() throws IOException {
        //Получаем слова из файла
        BufferedReader reader = new BufferedReader(new FileReader("D:\\sa\\dictionary\\slovarEx.txt"));
        String str;
        while ((str = reader.readLine()) != null) { //Файл будет считываться, пока он не закончится
            if (!str.isEmpty()) {
                list.add(str); //Добавляем слова в коллекцию, пока файл не закончится
            }
        }
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        reader.close(); //Закрываем считывание файла

        //Сортировка
        Collator coll = Collator.getInstance(new Locale("ru", "RU")); //Отображение русских слов
        coll.setStrength(Collator.IDENTICAL);
        Collections.sort(list, coll);
        String[] arrayWords = list.toArray(new String[0]); //Получение отсортированного массива со всеми элементами списка
        //Запись в файл
        BufferedWriter out = new BufferedWriter(new FileWriter("D:\\sa\\dictionary\\slovarExS.txt"));
        StringBuilder result = new StringBuilder();
        for (String arrayWord : arrayWords) {
            result.append(arrayWord).append("\n");
        }
        out.write(result.toString());
        out.flush();
        out.close(); // Закрываем считывание файла
        System.out.println("Sorted!");
    }
}
