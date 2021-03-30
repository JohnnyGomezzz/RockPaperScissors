import java.util.Random;

public class Computer {
    Random random = new Random();
    private final String[] variant = {"Камень", "Ножницы", "Бумага"};
    private final int computerVar = random.nextInt(variant.length) + 1;

    public int getComputerVar() {
        return computerVar;
    }

    public void turn() {
        System.out.println("Ход компьютера!\nВыбор компьютера - " + variant[computerVar-1] + ".\n");
    }
}
