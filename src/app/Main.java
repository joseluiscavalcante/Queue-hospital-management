package app;

import entities.Patient;
import entities.Patient.PriorityLevel;
import utilities.EmptyQueueException;
import utilities.FullQueueException;
import utilities.HospitalManagement;

public class Main {

	public static void main(String[] args) throws FullQueueException, EmptyQueueException {
		
		HospitalManagement hospitalManagement = new HospitalManagement();
		
		Patient patient1 = new Patient("A", "111.111.111-11", PriorityLevel.LIGHT);
		Patient patient2 = new Patient("B", "222.222.222-22", PriorityLevel.MODERATE);
		Patient patient3 = new Patient("C", "333.333.333-33", PriorityLevel.NORMAL);
		Patient patient4 = new Patient("D", "444.444.444-44", PriorityLevel.SEVERE);
		Patient patient5 = new Patient("E", "555.555.555-55", PriorityLevel.LIGHT);
		Patient patient6 = new Patient("F", "666.666.666-66", PriorityLevel.MODERATE);
		Patient patient7 = new Patient("G", "777.777.777-77", PriorityLevel.SEVERE);
		Patient patient8 = new Patient("H", "888.888.888-88", PriorityLevel.SEVERE);
		Patient patient9 = new Patient("I", "999.999.999-99", PriorityLevel.SEVERE);
		
		hospitalManagement.addToQueue(patient1);
		hospitalManagement.addToQueue(patient2);
		hospitalManagement.addToQueue(patient3);
		hospitalManagement.addToQueue(patient4);
		hospitalManagement.addToQueue(patient5);
		hospitalManagement.addToQueue(patient6);
		hospitalManagement.addToQueue(patient7);
		hospitalManagement.addToQueue(patient8);
		hospitalManagement.addToQueue(patient9);
		
		hospitalManagement.DisplayQueuesInformation();
		System.out.printf("-----------------------%n%n");
		
		hospitalManagement.callForService();
		hospitalManagement.callForService();
		hospitalManagement.callForService();
		hospitalManagement.callForService();
		hospitalManagement.callForService();
		hospitalManagement.callForService();
		hospitalManagement.callForService();
		hospitalManagement.callForService();
	}

}
