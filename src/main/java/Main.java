import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.mainMenu();
        int action;
        do {
            menu.actions();
            System.out.print("Введите номер: ");
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            action = Integer.parseInt(read.readLine());
            switch (action) {
                case 1:
                    Sort sort = new Sort();
                    sort.sorting();
                    break;
                case (2):
                    Search search = new Search();
                    search.searching();
                    break;
                case (3):
                    HashFirst hashFirst = new HashFirst();
                    hashFirst.searching();
                    break;
                case(4):
                    HashVandC hashVowel = new HashVandC();
                    hashVowel.vowel();
                    break;
                case(5):
                    HashVandC hashCons = new HashVandC();
                    hashCons.consonant();
                    break;
                case(6):
                    HashAuthor hashAuthor = new HashAuthor();
                    hashAuthor.hashing();
                    break;
                case(0):
                    System.out.println("Программа завершена по вашей команде");
                    break;
                default:
                    System.out.println("Действие невозможно, вы ввели неверный номер. Попробуйте еще раз");
            }
        } while (action != 0);


        /*
        // alphabet
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char c : abcArray) {
            alphabet.add(c);
        }

        //sort array
        ArrayList<Character> sortArray = new ArrayList<Character>();
        for (int i = 0; i< alphabet.size();i++) {
            for (int j = 0; j < list.size(); j++) {
                String alphavit = list.get(j);
                char[] test = alphavit.toCharArray();
                for (int x = 0; x < test.length; x++) {
                    if (alphabet.get(i).equals(test[x])) {
                        sortArray.add(test[x]);
                    }
                }
            }
        }

        /*
        for (int j = 0; j < arrayWords.length; j++){
        for (int i = j + 1; i < arrayWords.length; i++) {
            if (arrayWords[i].compareTo(arrayWords[j]) < 0) {
                String k = arrayWords[j];
                arrayWords[j] = arrayWords[i];
                arrayWords[i] = k;
            }
        }

         */

        //System.out.println(arrayWords[j]);

    }
}






