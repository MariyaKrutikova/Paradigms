import java.util.Scanner;

public class Player {

    String name;
    Character sign;

    public Player(String name, Character sign) {
        this.name = name;
        this.sign = sign;
    }

    public void makeMove(Character[][] playField) {
        Scanner scn = new Scanner(System.in);
        System.out.println(name + ", укажите номер строки от 0 до 2: ");
        int i = scn.nextInt();
        System.out.println(name + ", укажите номер столбца от 0 до 2: ");
        int j = scn.nextInt();

        if (playField[i][j] == null) {
            playField[i][j] = sign;
        }
        else System.out.println("Клетка занята. Нужно переходить.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSign() {
        return sign;
    }

    public void setSign(Character sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Игрок " + name + " играет " + sign;
    }
}



