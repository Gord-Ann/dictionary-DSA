import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class HashAuthor {

    public void hashing() throws IOException {
        Map<Integer, List<String>> map = getMap("D:\\sa\\dictionary\\slovar.txt");
        Set<Map.Entry<Integer, List<String>>> set1 = map.entrySet();
        for (Map.Entry<Integer, List<String>> me : set1)
            System.out.println(me.getKey() + " " + me.getValue());

        System.out.println("Введите число:");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Integer f = Integer.parseInt(read.readLine()); //reading the input
        System.out.println(map.get(f));
    }

    public static int countA(String s) {
        int firstCharInt = s.charAt(0);//code of girts letter

        return s.length() + firstCharInt;
    }

    //hashing
    public static Map<Integer, List<String>> getMap(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename), Charset.defaultCharset())
                .stream().collect(Collectors.groupingBy(HashAuthor::countA, Collectors.toList()));

    }
}
