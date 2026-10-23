import java.util.*;

public class PlayerInput {
    private static final Scanner Input = new Scanner(System.in);

    //输入游戏模式
    public static int inputGameMode() {
        while (true) {
            System.out.print("请选择游戏模式：");
            String input = Input.nextLine().trim();
            if (input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '2') {
                return input.charAt(0) - '0';
            }
            System.out.println("请输入正确的代码!");
        }
    }

    //输入玩家名字
    public static int inputPlayerName() {
        while (true) {
            System.out.print("请选择人物：");
            String input = Input.nextLine().trim();
            if (input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '4') {
                return input.charAt(0) - '0';
            }
            System.out.println("请输入正确的代码!");
        }
    }

    //输入谁是人类玩家
    public static int inputWhosHuman() {
        while (true) {
            System.out.print("请选择作为哪名玩家进行游戏：");
            String input = Input.nextLine().trim();
            if (input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '2') {
                return input.charAt(0) - '0';
            }
            System.out.println("请输入正确的代码!");
        }
    }
}
