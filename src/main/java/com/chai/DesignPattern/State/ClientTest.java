package com.chai.DesignPattern.State;

//状态模式测试类
public class ClientTest {
    public static void main(String[] args) {

        // 创建活动对象，奖品有 1 个奖品
        RaffleActivity activity = new RaffleActivity(1);


        // 我们连续抽 30 次奖
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽奖----------");
            // 参加抽奖，第一步点击扣除积分
            activity.debuctMoney();

            // 第二步抽奖
            activity.raffle();
        }
    }
}
