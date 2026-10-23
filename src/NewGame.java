public class NewGame {
    Player player1;
    Player player2;
    Map map;

    //初始化
    public void Init (Player player1,Player player2,Map map) {
        player1.ID = GameResource.PlayerIDs[0];
        player2.ID = GameResource.PlayerIDs[1];
        player1.IsRobot = false;
        player2.IsRobot = false;
    }

    public NewGame() {
        Player player1 = new Player();
        Player player2 = new Player();
        Map map = new Map();
        Init(player1,player2,map);
    }

    //开始游戏
    public void start () {
        Init(player1,player2,map);

        //开始动画、展示横幅

        Display.ModeChoose1();
        int GameMod1 = PlayerInput.inputGameMode();

        //双人对战
        if (GameMod1 == 1) {
            Display.ModeChoose2();
            int GameMod2 = PlayerInput.inputGameMode();
            //双人赛跑
            if (GameMod2 == 1) {

            }
            //双人boss战
            else if (GameMod2 == 2) {

            }

        }
        //人机对战
        else if (GameMod1 == 2) {
            Display.ModeChoose2();
            int GameMod2 = PlayerInput.inputGameMode();
            int Human = PlayerInput.inputWhosHuman();

            //人机赛跑
            if (GameMod2 == 1) {

            }
            //人机boss战
            else if (GameMod2 == 2) {

            }
        }



    }

    public void play() {

    }

}
