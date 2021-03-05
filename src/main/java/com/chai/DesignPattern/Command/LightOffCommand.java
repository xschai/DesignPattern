package com.chai.DesignPattern.Command;
//关灯命令
public class LightOffCommand implements Command{
    LightReceiver lightReceiver;


    public LightOffCommand(LightReceiver lightReceiver){
        this.lightReceiver=lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
