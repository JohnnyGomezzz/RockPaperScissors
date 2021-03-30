import java.util.Scanner;

public class Game {

    public void start() {
        initGame();
        calculation();
        endDialog();
    }

    private void initGame() {
        System.out.println("Добро пожаловать в игру \"Камень-ножницы-бумага\"!\n" +
                "Ваш ход!\n");
    }

    private void calculation() {
        Player player = new Player();
        Computer computer = new Computer();

        player.turn();
        computer.turn();

        if (player.getPlayerVar() == computer.getComputerVar()) {
            System.out.println("Ничья!");
        } else {
            switch (player.getPlayerVar()) {
                case 1:
                    if (computer.getComputerVar() == 2) {
                        System.out.println("Вы победили!");
                    } else {
                        System.out.println("Вы проиграли!");
                    }
                    break;
                case 2:
                    if (computer.getComputerVar() == 3) {
                        System.out.println("Вы победили!");
                    } else {
                        System.out.println("Вы проиграли!");
                    }
                    break;
                case 3:
                    if (computer.getComputerVar() == 1) {
                        System.out.println("Вы победили!");
                    } else {
                        System.out.println("Вы проиграли!");
                    }
                    break;
            }
        }
    }

    private void endDialog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nПовторить?\n1. Да\n2. Нет\n");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            start();
        } else if (input.equals("2")) {
            System.exit(0);
        } else {
            System.out.println("Неправильный ввод. Выберите один из вариантов.");
            endDialog();
        }
    }
}
