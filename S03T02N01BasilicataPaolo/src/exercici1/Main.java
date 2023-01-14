package exercici1;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		ObersvableAgent agent = new ObersvableAgent();
		ObserverAgency agency1 = new ObserverAgency("Agency1");
		ObserverAgency agency2 = new ObserverAgency("agency2");
		ObserverAgency agency3 = new ObserverAgency("agency3");
		
		agent.addObserver(agency1);
		agent.addObserver(agency2);
		agent.addObserver(agency3);
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				agent.updateIbex35((float)Math.random() * 5);
				System.out.println("#####################################");
			}
		},5000,5000);
		
		
	}

}