package utilities;

import entities.Patient;

public class HospitalQueue {
	private Patient[] queue;
	private final int N = 50;
	private int f;
	private int r;
	
	public HospitalQueue() {
		this.queue = new Patient[N];
		f = r = 0;
	}
	
	public int size() {
		return (N - f + r)%N;
	}
	
	public boolean isEmpty() {
		return f == r;
	}
	
	public Patient dequeue() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException("A fila está vazia");
		}
		Patient temp = queue[f];
		queue[f] = null;
		f = (f + 1) % N;
		return temp;
	}
	
	public void enqueue(Patient patient) throws FullQueueException {
		if (size() == N - 1) {
			throw new FullQueueException("A fila está cheia");
		}
		queue[r] = patient;
		r = (r + 1) % N;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < queue.length; i++) {
			if(queue[i] == null) {
				sb.append("  ");
			}
			else {
				sb.append(String.format("%s ", queue[i].toString()));
			}
		}
		
		String finalStr = sb.toString();
		return finalStr;
	}
}
