public class PlayGame {
    public static void main(String[] args) {
        Character[][] playField = new Character[3][3];
        Player player1 = new Player("Ivan", '0');
        Player player2 = new Player("Roman", 'x');
        boolean flag = true;
        if (player1.getSign() == 'x') {
            while (flag) {
                player1.makeMove(playField);
                printField(playField);
                if (!isSuccessCheck( player1.getSign(), playField)) {
                    System.out.println("Ура, игрок " +  player1.getName() + " победил!");
                    flag = false;
                }
                if(!isFullFieldCheck(playField)) {
                    System.out.println("Игра завершена в ничью!");
                    flag = false;
                }
                if (flag) {
                    player2.makeMove(playField);
                    printField(playField);
                    if (!isSuccessCheck(player2.getSign(), playField)) {
                        System.out.println("Ура, игрок " + player2.getName() + " победил!");
                        flag = false;
                    }
                    if (!isFullFieldCheck(playField)) {
                        System.out.println("Игра завершена в ничью!");
                        flag = false;
                    }
                }
            }
        }
        else {
            while (flag) {
                player2.makeMove(playField);
                printField(playField);
                if (!isSuccessCheck(player2.getSign(), playField)) {
                    System.out.println("Ура, игрок " + player2.getName() + " победил!");
                    flag = false;
                }
                if (!isFullFieldCheck(playField)) {
                    System.out.println("Игра завершена в ничью!");
                    flag = false;
                }
                if (flag) {
                    player1.makeMove(playField);
                    printField(playField);
                    if (!isSuccessCheck(player1.getSign(), playField)) {
                        System.out.println("Ура, игрок " + player1.getName() + " победил!");
                        flag = false;
                    }
                    if (!isFullFieldCheck(playField)) {
                        System.out.println("Игра завершена в ничью!");
                        flag = false;
                    }
                }
        }
    }
}
    public static boolean isSuccessCheck(Character sign, Character[][] arr) {
        for (int i = 0; i < 3; i++) {
            if ((arr[i][0] == sign && arr[i][1] == sign && arr[i][2] == sign) ||
                (arr[0][i] == sign && arr[1][i] == sign && arr[2][i] == sign))
                return false;
        }
        if ((arr[0][0] == sign && arr[1][1] == sign && arr[3][3] == sign) ||
            (arr[2][0] == sign && arr[1][1] == sign && arr[0][2] == sign))
            return false;
        return true;
    }
    public static boolean isFullFieldCheck(Character[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == null)
                    return true;
            }
        }
        return false;
    }
    static void printField(Character[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
