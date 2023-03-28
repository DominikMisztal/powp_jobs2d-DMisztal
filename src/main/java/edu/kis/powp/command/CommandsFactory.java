package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandsFactory {
    private Job2dDriver driver;
    
    public CommandsFactory(Job2dDriver driver){
        this.driver = driver;
    }

    public DriverCommand getComplexFigure1(){
        ComplexCommand commandSet = new ComplexCommand();
        commandSet.addCommand(new SetPositionCommand(driver, 200, 100));
        commandSet.addCommand(new OperateToCommand(driver, -200, 100));
        commandSet.addCommand(new OperateToCommand(driver, -200, 0));
        commandSet.addCommand(new OperateToCommand(driver, 200, 0));
        commandSet.addCommand(new OperateToCommand(driver, 200, 100));
        return commandSet;
    }
}
