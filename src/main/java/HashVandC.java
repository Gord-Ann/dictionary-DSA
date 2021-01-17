import java.io.*;
import java.util.*;

public class HashVandC {
    private List<String> list = new ArrayList<String>();

    //method of getting list with vowels
    public void vowel() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\sa\\dictionary\\slovar.txt"));
        String str;
        while ((str = reader.readLine()) != null) { //file reading while file is not finished
            if (!str.isEmpty()) {
                list.add(str); //adding words to list while file is not empty
            }
        }
        String[] array = list.toArray(new String[0]);

        //create map with vowels
        int[] resultVowel = getCountVowel(array);
        Map<Integer, List<String>> vowelMap = new HashMap<>();
        vowelMap =  createMap(array,resultVowel);

        //printing result of counting vowels
        Set<Map.Entry<Integer, List<String>>> set1 = vowelMap.entrySet();
        for(Map.Entry<Integer, List<String>> me : set1)
            System.out.println(me.getKey() +" "+ me.getValue());

        //finding words by number of vowels
        System.out.println("Введите количество гласных:");
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        int s = Integer.parseInt(read.readLine());
        System.out.println(vowelMap.get(s));

    }
    //method of getting list with consonants
    public void consonant() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\sa\\dictionary\\slovar.txt"));
        String str;
        while ((str = reader.readLine()) != null) { //file reading while file is not finished
            if (!str.isEmpty()) {
                list.add(str); //adding words to list while file is not empty
            }
        }
        String[] array = list.toArray(new String[0]);

        //create map with consonants
        int[] resultСons = getCountCons(array);
        Map<Integer, List<String>> consMap = new HashMap<>();
        consMap =  createMap(array, resultСons);
        //printing result of counting vowels
        Set<Map.Entry<Integer, List<String>>> set1 = consMap.entrySet();
        for(Map.Entry<Integer, List<String>> me : set1)
            System.out.println(me.getKey() +" "+ me.getValue());

        //finding words by number of vowels
        System.out.println("Введите количество согласных:");
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
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
            else{
                List<String> list1 = new ArrayList<>();
                list1.add(array[i]);
                findMap.put(count[i], list1);
            }
        }
        return findMap;
    }
}
