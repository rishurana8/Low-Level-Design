package org.rishudesign.com.designpatterns.CodingandConcept.StateDesignPattern;

public class GumballMachine {
    State soldOutState;
    State NoQuarterState;
    State SoldState;
    State HasQuarterState;

    State state = soldOutState;
    int count  = 0;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        NoQuarterState = new NoQuarterState(this);
        SoldState = new SoldOutState(this);
        HasQuarterState = new HasQuarterState(this);
        this.count = numberGumballs;
        if (count > 0) {
            state = NoQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense(); //  dispense state isi mai kyunki user alga se dispense call nahi kr skta
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getHasQuarterState(){
        return HasQuarterState;
    }

        public State getNoQuarterState(){
            return NoQuarterState;
        }

        public State getSoldState(){
            return SoldState;
        }

        public State getSoldOutState(){
            return soldOutState;
        }

        public int getCount() {
            return count;
        }

}
