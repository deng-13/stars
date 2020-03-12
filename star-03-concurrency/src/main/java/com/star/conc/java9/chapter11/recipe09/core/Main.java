package com.star.conc.java9.chapter11.recipe09.core;

import com.star.conc.java9.chapter11.recipe09.task.Task;
import java.util.concurrent.locks.ReentrantLock;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReentrantLock lock=new ReentrantLock();
		for (int i=0; i<10; i++) {
			Task task=new Task(lock);
			Thread thread=new Thread(task);
			thread.start();
		}
	}

}
