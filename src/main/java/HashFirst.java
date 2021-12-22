import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class HashFirst {
    private List<String> result;

    private Map<String, List<String>> findMap;

    public void searching() throws IOException {
        result = new ArrayList<>();
        // Map<String, List<String>>  mapOf = list.stream().collect(groupingBy(word -> word.substring(0, 1), Collectors.toList()));
        findMap = new HashMap<>();
        Files.readAllLines(Paths.get("D:\\sa\\dictionary\\slovar.txt"), Charset.defaultCharset())
                .stream().collect(Collectors.toList()).forEach(word -> {
                    final String letter = word.substring(0, 1); //get first letter
                    if (findMap.containsKey(letter)) findMap.get(letter).add(word);
                    else {
                        result.add(word);
                        findMap.put(letter, result);
                    }
                });

        //printing hashing list
        System.out.println("Результат:");
        Set<Map.Entry<String, List<String>>> set = findMap.entrySet();
        for (Map.Entry<String, List<String>> me : set)
            System.out.println(me.getKey() + " " + me.getValue());

        //finding words by first letter
        System.out.println("Поиск. Введите первую букву");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String f = read.readLine(); //reading the input
        System.out.println(findMap.get(f));
    }
}
