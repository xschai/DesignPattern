package com.chai.DesignPattern.Command;

//命令接口
public interface Command {
//执行
    void execute();
//撤销
    void undo();
}
