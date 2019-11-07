package lesson10.labs.prob6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
	
	private static Executor exec = Executors.newCachedThreadPool();
	static int number = 1;
	public static void main(String[] args) {
		
		SynchronizedQueue queue = new SynchronizedQueue();
		
		Runnable add = () -> {			
			queue.add(number++);
		};
		
		Runnable remove = () -> {
			System.out.println(queue.remove());
		};
		
		for(int k = 0; k < 10; k++) {
			Thread t = new Thread(add);
			t.start();
		}
		for(int j = 0; j < 10; j++) {
			Thread t = new Thread(remove);
			t.start();
		}
	}
}