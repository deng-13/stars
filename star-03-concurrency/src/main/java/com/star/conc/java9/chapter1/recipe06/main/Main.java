package com.star.conc.java9.chapter1.recipe06.main;

import com.star.conc.java9.chapter1.recipe06.event.Event;
import com.star.conc.java9.chapter1.recipe06.task.CleanerTask;
import com.star.conc.java9.chapter1.recipe06.task.WriterTask;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Main class of the example. Creates three WriterTaks and a CleanerTask
 *
 */
public class Main {

	/**
	 * Main method of the example. Creates three WriterTasks and a CleanerTask
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creates the Event data structure
		Deque<Event> deque = new ConcurrentLinkedDeque<>();

		// Creates the three WriterTask and starts them
		WriterTask writer = new WriterTask(deque);
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
			Thread thread = new Thread(writer);
			thread.start();
		}

		// Creates a cleaner task and starts them
		CleanerTask cleaner = new CleanerTask(deque);
		cleaner.start();

	}

}
