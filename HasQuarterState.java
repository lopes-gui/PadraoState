
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.State;
import gumballmachinetestdrive.GumballMachine;
import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine; 
	Random ramdomWinner = new Random (System.currentTimeMillis());

public HasQuarterState(GumballMachine gumballMachine) { 
this.gumballMachine = gumballMachine; 
} 
 
public void insertQuarter() { 
System.out.println("You can't insert another quarter"); 
} 

public void ejectQuarter() { 
System.out.println("quarter returned"); 
 gumballMachine.setState(gumballMachine.getNoQuarterState() );
} 

public void turnCrank(){
	System.out.println("you turned"); 
	 int winner = ramdomWinner.nextInt(10);
	 if ((winner==0) && (gumballMachine.getCount()>1)){
	 gumballMachine.setState(gumballMachine.getWinnerState() );}
else{
	gumballMachine.setState(gumballMachine.getSoldState());
}

}

public void dispense(){
	System.out.println(" no gumball dispensed"); 
	
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