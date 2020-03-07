package state;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import patternDessign.IObservable;


public class State{
    private int inMoney, inTime, inLuck, inRisk, inFail;
    private int outWinningCalc;
    private List outDigramCalc;
    
    public int getOutWinningCalc() {
        return outWinningCalc;
    }

    public void setOutWinningCalc(int outWinningCalc) {
        this.outWinningCalc = outWinningCalc;
    }

    public List getOutDigramCalc() {
        if(outDigramCalc == null) {
            return new ArrayList();
        }
        return outDigramCalc;
    }

    public void setOutDigramCalc(List outDigramCalc) {
        this.outDigramCalc = outDigramCalc;
    }

    public int getInMoney() {
        return inMoney;
    }

    public void setInMoney(int inMoney) {
        this.inMoney = inMoney;
    }

    public int getInTime() {
        return inTime;
    }

    public void setInTime(int inTime) {
        this.inTime = inTime;
    }

    public int getInLuck() {
        return inLuck;
    }

    public void setInLuck(int inLuck) {
        this.inLuck = inLuck;
    }

    public int getInRisk() {
        return inRisk;
    }

    public void setInRisk(int inRisk) {
        this.inRisk = inRisk;
    }

    public int getInFail() {
        return inFail;
    }

    public void setInFail(int inFail) {
        this.inFail = inFail;
    }  
}
