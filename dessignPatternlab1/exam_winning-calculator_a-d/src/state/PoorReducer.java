
package state;

import java.util.ArrayList;

import java.util.List;


public class PoorReducer implements Reducer{
    @Override
    public State reduce(State oldState, String action, int value) {
        if(action.equalsIgnoreCase("money")) {
            oldState.setInMoney(value);
        } else if(action.equalsIgnoreCase("time")) {
            oldState.setInTime(value);
        } else if(action.equalsIgnoreCase("luck")) {
            oldState.setInLuck(value);
        } else if(action.equalsIgnoreCase("risk")) {
            oldState.setInRisk(value);
        } else if(action.equalsIgnoreCase("fail")) {
            oldState.setInFail(value);
        }
        
        int winValue = ( oldState.getInMoney() * Math.max(oldState.getInLuck(), 1) / Math.max(oldState.getInRisk(), 1) + oldState.getInTime() - oldState.getInFail() );
        
        oldState.setOutWinningCalc(winValue);
        List winList = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            winList.add(40+i+winValue);
        }
        
        oldState.setOutDigramCalc(winList);
        
        return oldState; //we are poor and lazy :D
    }
}
