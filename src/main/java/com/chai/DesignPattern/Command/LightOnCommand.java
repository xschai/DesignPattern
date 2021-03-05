package com.chai.DesignPattern.Command;

//开灯命令
public class LightOnCommand implements Command{
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver){
         this.lightReceiver=lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
