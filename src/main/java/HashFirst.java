import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class HashFirst  {
    private ArrayList<String> list = new ArrayList<String>(); //implement array list
    List<String> result = new ArrayList<String>();
    Map<String, List> findMap = new HashMap<>();

    public void searching() throws IOException {

       // Map<String, List<String>>  mapOf = list.stream().collect(groupingBy(word -> word.substring(0, 1), Collectors.toList()));
        Map<String, List> findMap = new HashMap<>();
        Files.readAllLines(Paths.get("D:\\sa\\dictionary\\slovar.txt"), Charset.defaultCharset())
                .stream().collect(Collectors.toList()).forEach(word -> {
            final String latter = word.substring(0, 1); //get first letter
            if (findMap.containsKey(latter)) findMap.get(latter).add(word);
            else {
                List<String> result = new ArrayList<>();
                result.add(word);
                findMap.put(latter, result);
            }
        });
        //printing hashing list
        System.out.println("Результат:");
        Set<Map.Entry<String, List>> set = findMap.entrySet();
        for(Map.Entry<String, List> me : set)
            System.out.println(me.getKey() +" "+ me.getValue());

        //finding words by first letter
        System.out.println("Поиск. Введите пурвую букву");
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        String f = read.readLine(); //reading the input
        System.out.println(findMap.get(f));
    }
}
