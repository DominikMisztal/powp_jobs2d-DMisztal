package edu.kis.powp.command;

import edu.kis.powp.jobs2d.drivers.adapter.Jobs2DToDrawerAdapter;

public class OperateToCommand implements CommandInterface {
    private Jobs2DToDrawerAdapter adapter;
    private int x;
    private int y;
    
    @Override
    public void execute(){
        adapter.operateTo(x, y);
    }
}
