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
                case (4):
                    HashVandC hashVowel = new HashVandC();
                    hashVowel.vowel();
                    break;
                case (5):
                    HashVandC hashCons = new HashVandC();
                    hashCons.consonant();
                    break;
                case (6):
                    HashAuthor hashAuthor = new HashAuthor();
                    hashAuthor.hashing();
                    break;
                case (0):
                    System.out.println("Программа завершена по вашей команде");
                    break;
                default:
                    System.out.println("Действие невозможно, вы ввели неверный номер. Попробуйте еще раз");
            }
        } while (action != 0);
    }
}






