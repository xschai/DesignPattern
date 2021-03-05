package com.chai.DesignPattern.Command;
//遥控器
public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;


    public RemoteController(){
        onCommands=new Command[5];
        offCommands=new Command[5];
        for (int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();

        }
    }

    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
        }

    public void onButtonClicked(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offButtonClicked(int no){
        offCommands[no].execute();
        undoCommand=offCommands[no];
    }

    public void undoButtonClick(int no){
        undoCommand.undo();
    }
}
