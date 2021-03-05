package com.chai.DesignPattern.Command;

public class Client {
    public static void main(String[] args) {
        // 创建电灯对象（接收者）
        LightReceiver lightReceiver = new LightReceiver();
        // 创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 创建遥控器
        RemoteController remoteController = new RemoteController();
        // 给遥控器设置相关命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("++++++按下灯的开按钮+++++");
        remoteController.onButtonClicked(0);
        System.out.println("++++++按下灯的关按钮+++++");
        remoteController.offButtonClicked(0);
        System.out.println("++++++按下撤销按钮+++++");
        remoteController.undoButtonClick(0);

    }

}
