package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private Job2dDriver driver;
    private int x;
    private int y;
    
    @Override
    public void execute(){
        driver.operateTo(x, y);
    }
}
