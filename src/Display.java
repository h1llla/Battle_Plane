public class Display {
    public static void splashScreen() {
        System.out.println("**************************************************************");
        System.out.println("*                         骑士飞行棋                         *");
        System.out.println("**************************************************************\n");
    }

    public static void startGame() {
        System.out.println("\n");
        System.out.print("**************************************************************\n");
        System.out.print("*                        Game Start                          *\n");
        System.out.print("**************************************************************\n");
    }

    public static void gameOver() {
        System.out.println("\n\n\n\n");
        System.out.print("****************************************************\n");
        System.out.print("                      Game  Over                    \n");
        System.out.print("****************************************************\n\n");
    }

    public static void ModeChoose1() {
        System.out.println("——————————————模式选择——————————————");
        System.out.println("1.双人对战");
        System.out.println("2.人机对战");
    }

    public static void ModeChoose2() {
        System.out.println("——————————————模式选择——————————————");
        System.out.println("1.赛跑");
        System.out.println("2.Boss战");
    }
}
