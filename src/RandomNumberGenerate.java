public class RandomNumberGenerate {
    //随机数生成器
    public static int GenerateStep() {
        //投骰子
        int step = (int)(Math.random() * 6) + 1;
        return step;
    }

    //后续可能会删，优化机器人的思考逻辑
    public static int GenerateRobChoose() {
        //生成机器人的幸运通道选择
        int choice = (int)(Math.random() * 2) + 1;
        return choice;
    }
}
