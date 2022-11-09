package gumballmachinetestdrive;


import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.State;

/**
 *
 * @author guilh
 */
public  class NoQuarterState implements State {
 GumballMachine gumballMachine; 

    /**
     *
     * @param gumballMachine
     */
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine; 
} 
 
 
 
 
  public void insertOuarter() {
	  System.out.println("rou inserted a quarter"); 
	  gumballMachine.setState(gumballMachine.getHasQuarterState() );
} 

 
    /**
     *
     */
    public void ejectQuarter() { 
    System.out.println("vou haven't inserted a quarter");
}
 public void turnCrank(){
	System.out.println("You turned, but there's no quarter"); 
}
	public void dispense() { 
	System.out.println("You need to pay first"); 

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