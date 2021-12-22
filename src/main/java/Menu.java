public class Menu {
    public void mainMenu() {
        System.out.println("Добро пожаловать!" + "\n" + "Выберете действие:");
    }

    public void actions() {
        System.out.println("1 - Сортировка");
        System.out.println("2 - Поиск слова");
        System.out.println("3 - Хеширование по первой букве");
        System.out.println("4 - Хеширование по гласным");
        System.out.println("5 - Хеширование по согласным");
        System.out.println("6 - Авторское хеширование");
        System.out.println("0 - Выход из программы");
    }
}
