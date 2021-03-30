import java.util.Scanner;

public class Player {
    private final Scanner scanner = new Scanner(System.in);
    private int playerVar;

    public int getPlayerVar() {
        return playerVar;
    }

    public void turn() {
        System.out.println("1. Камень\n2. Ножницы\n3. Бумага\n");
        String input = this.scanner.nextLine();
        switch (input) {
            case "1" -> {
                System.out.println("Ваш выбор - Камень.\n");
                playerVar = 1;
            }
            case "2" -> {
                System.out.println("Ваш выбор - Ножницы.\n");
                playerVar = 2;
            }
            case "3" -> {
                System.out.println("Ваш выбор - Бумага.\n");
                playerVar = 3;
            }
            default -> {
                System.out.println("Неправильный ввод. Выберите один из вариантов.");
                turn();
            }
        }
    }
}
