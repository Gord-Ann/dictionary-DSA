import java.io.*;
import java.util.*;

public class HashVandC {
    private final List<String> list = new ArrayList<>();

    private BufferedReader reader;

    {
        try {
            reader = new BufferedReader(new FileReader("D:\\sa\\dictionary\\slovar.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //getting list with vowels
    public void vowel() throws IOException {
        String str;
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        String[] array = list.toArray(new String[0]);

        //create map with vowels
        int[] resultVowel = getCountVowel(array);
        Map<Integer, List<String>> vowelMap = createMap(array, resultVowel);

        //printing result of counting vowels
        Set<Map.Entry<Integer, List<String>>> set1 = vowelMap.entrySet();
        for (Map.Entry<Integer, List<String>> me : set1)
            System.out.println(me.getKey() + " " + me.getValue());

        //finding words by number of vowels
        System.out.println("Введите количество гласных:");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(read.readLine());
        System.out.println(vowelMap.get(s));

    }

    //method of getting list with consonants
    public void consonant() throws IOException {
        String str;
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        String[] array = list.toArray(new String[0]);

        //create map with consonants
        int[] resultCons = getCountCons(array);
        Map<Integer, List<String>> consMap = createMap(array, resultCons);

        //printing result of counting vowels
        Set<Map.Entry<Integer, List<String>>> set1 = consMap.entrySet();
        for (Map.Entry<Integer, List<String>> me : set1)
            System.out.println(me.getKey() + " " + me.getValue());

        //finding words by number of vowels
        System.out.println("Введите количество согласных:");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(read.readLine());
        System.out.println(consMap.get(s));

    }

    //find vowels in words
    public static int[] getCountVowel(String[] offers) {
        int[] result = new int[offers.length];
        String pattern = "[а, е, ё, и, о, у, ы, э, ю, я]";

        for (int i = 0; i < offers.length; i++) {
            result[i] = offers[i].length() - offers[i].toLowerCase().replaceAll(pattern, "").length();
        }

        return result;
    }

    //find consonants in words
    public static int[] getCountCons(String[] offers) {
        int[] result = new int[offers.length];
        String pattern = "[б, в, г, д, ж, з, к, л, м, н, п, р, с, т, ф, х, ц, ч, ш, щ, ъ, ь]";

        for (int i = 0; i < offers.length; i++) {
            result[i] = offers[i].length() - offers[i].toLowerCase().replaceAll(pattern, "").length();
        }
        return result;
    }

    //hashing
    public static Map<Integer, List<String>> createMap(String[] array, int[] count) {
        Map<Integer, List<String>> findMap = new HashMap<>();
        for (int i = 0; i < count.length; i++) {
            if (findMap.containsKey(count[i])) findMap.get(count[i]).add(array[i]);
            else {
                List<String> list1 = new ArrayList<>();
                list1.add(array[i]);
                findMap.put(count[i], list1);
            }
        }

        return findMap;
    }
}
