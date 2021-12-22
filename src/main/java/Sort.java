import java.io.*;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Locale;

public class Sort {
    private final ArrayList<String> list = new ArrayList<>();

    public void sorting() throws IOException {
        //get words from file
        BufferedReader reader = new BufferedReader(new FileReader("D:\\sa\\dictionary\\slovarEx.txt"));
        String str;
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        reader.close();

        //sorting
        Collator coll = Collator.getInstance(new Locale("ru", "RU"));
        coll.setStrength(Collator.IDENTICAL);
        list.sort(coll);
        String[] arrayWords = list.toArray(new String[0]);

        //write in file
        BufferedWriter out = new BufferedWriter(new FileWriter("D:\\sa\\dictionary\\slovarExS.txt"));
        StringBuilder result = new StringBuilder();
        for (String arrayWord : arrayWords) {
            result.append(arrayWord).append("\n");
        }
        out.write(result.toString());
        out.flush();
        out.close();

        System.out.println("Sorted!");
    }
}
