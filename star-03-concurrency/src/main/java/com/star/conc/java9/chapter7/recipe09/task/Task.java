package com.star.conc.java9.chapter7.recipe09.task;

import com.star.conc.java9.chapter7.recipe09.data.Flag;
import java.util.Date;

public class Task implements Runnable {

	private Flag flag;

	public Task(Flag flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		int i = 0;
		while (flag.flag) {
			i++;
		}
		System.out.printf("Task: %d - %s\n", i, new Date());
	}

}
