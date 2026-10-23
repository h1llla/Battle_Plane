public class Player {
    String ID;
    boolean IsRobot;
    String Name;
    String Skill;
    int priority;

    public void ChooseName (Player player) {
        //选择角色及相关技能
        player.Name = GameResource.PlayerName[PlayerInput.inputPlayerName()];
        player.Skill = GameResource.SkillName[PlayerInput.inputPlayerName()];

    }

    //设定优先级，no == 0为最高优先级，用于区分{玩家一，玩家二}，{人类玩家，机器人}
    public static void SetPriority (int no , Player player) {

    }


}
