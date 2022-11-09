
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.State;
import gumballmachinetestdrive.GumballMachine;


public class SoldOutState implements State {
	GumballMachine gumballMachine; 
public SoldOutState(GumballMachine gumballMachine) { 
this.gumballMachine = gumballMachine; 
} 
 
public void insertQuarter() { 
} 

public void ejectQuarter() { 
} 

public void turnCrank(){

}

public void dispense(){
	
}

    @Override
    public void preAction(FSM fsm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postAction(FSM fsm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}