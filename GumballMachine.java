package gumballmachinetestdrive;

import com.sun.corba.se.spi.orbutil.fsm.State;
import com.sun.corba.se.spi.orbutil.fsm.FSM;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
   
    State state = soldOutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);

        noQuarterState = (State) new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    
   
    public void insertQuarter() {
        this.insertQuarter();
    }

    public void ejectQuarter() {
        this.ejectQuarter();
    }

    /**
     *
     */
    public void turnCrank() {
        this.turnCrank();
        this.dispense();
    }

    public void setState(State state) {
        this.state = state;

    }

    public void winnerState() {
        this.winnerState();
    }

    public void releaseBall() {
        System.out.println("a gumball comes rolling out the slote");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return 0;
    }

    public State getNoQuarterState() {
        return null;
    }

    public State getSoldOutState() {
        return null;
    }

    public State getWinnerState() {
        return null;
    }

    public State getSoldState() {
        return null;
    }

    private void dispense() {
    }

    public State getHasQuarterState() {
        return null;
    }

}
