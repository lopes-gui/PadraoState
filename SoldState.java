
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.State;
import gumballmachinetestdrive.GumballMachine;

public class SoldState implements State {
	GumballMachine gumballMachine; 

public SoldState(GumballMachine gumballMachine) { 
this.gumballMachine = gumballMachine; 
} 
 
public void insertQuarter() { 
System.out.println("wait, ja estamos dando"); 
} 

public void ejectQuarter() { 
System.out.println("qja devolvwmos"); 
} 

public void turnCrank(){
	System.out.println("duas vezes não é possivel"); 

}

public void dispense(){
	gumballMachine.releaseBall();
	if (gumballMachine.getCount()>0){
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	else{
			System.out.println("ACABOU"); 
				gumballMachine.setState(gumballMachine.getSoldOutState());

	}
	
}

    @Override
    public void preAction(FSM fsm) {
    }

    @Override
    public void postAction(FSM fsm) {
    }
}