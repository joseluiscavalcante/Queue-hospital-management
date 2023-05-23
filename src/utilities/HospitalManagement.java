package utilities;

import entities.Patient;
import entities.Patient.PriorityLevel;

public class HospitalManagement {
	private static HospitalQueue normalQueue = new HospitalQueue();
	private static HospitalQueue lightQueue = new HospitalQueue();
	private static HospitalQueue moderateQueue = new HospitalQueue();
	private static HospitalQueue severeQueue = new HospitalQueue();
	private static int numberOfCalls = 0;
	
	public void addToQueue(Patient patient) throws FullQueueException {
		if(patient.getPriorityLevel() == PriorityLevel.NORMAL) {
			normalQueue.enqueue(patient);
		}
		else if(patient.getPriorityLevel() == PriorityLevel.LIGHT) {
			lightQueue.enqueue(patient);
		}
		else if(patient.getPriorityLevel() == PriorityLevel.MODERATE) {
			moderateQueue.enqueue(patient);
		}
		else if(patient.getPriorityLevel() == PriorityLevel.SEVERE) {
			severeQueue.enqueue(patient);
		}
	}
	
	public void callForService() throws EmptyQueueException {
		if(numberOfCalls % 7 == 0 || numberOfCalls % 7 == 3 || numberOfCalls % 7 == 5) {
			System.out.println("Calling severe patient!");
			severeQueue.dequeue();
		}
		else if(numberOfCalls % 7 == 1 || numberOfCalls % 7 == 4) {
			System.out.println("Calling moderate patient!");
			moderateQueue.dequeue();
		}
		else if(numberOfCalls % 7 == 2) {
			System.out.println("calling light patient!");
			lightQueue.dequeue();
		}
		else if(numberOfCalls % 7 == 6) {
			System.out.println("Calling normal patient!");
			normalQueue.dequeue();
		}
		
		numberOfCalls ++;
		
		DisplayQueuesInformation();
	}
	
	public void DisplayQueuesInformation() {
		System.out.println("Normal queue:   " + normalQueue);
		System.out.println("Light queue:    " + lightQueue);
		System.out.println("Moderate queue: " + moderateQueue);
		System.out.println("Severe queue:   " + severeQueue);
		System.out.println();
	}
}
