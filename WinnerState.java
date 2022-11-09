/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gumballmachinetestdrive;

import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.State;

/**
 *
 * @author guilh
 */

    public class WinnerState implements State {
	GumballMachine gumballMachine; 

public WinnerState(GumballMachine gumballMachine) { 
this.gumballMachine = gumballMachine; 
} 
 
public void insertQuarter() { 
} 

public void ejectQuarter() { 
} 

public void turnCrank(){

}

public void dispense(){
	System.out.println("voce venceu");
	if(gumballMachine.getCount()==0){
		gumballMachine.setState(gumballMachine.getSoldOutState());
	}else{
		gumballMachine.releaseBall();
	}
	if(gumballMachine.getCount()>0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());

	}else{
			System.out.println("acabou");
		gumballMachine.setState(gumballMachine.getSoldOutState());

	}
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




