package com.star.conc.java9.chapter10.recipe01.task;

import java.util.List;
import java.util.concurrent.FutureTask;

/**
 * This class encapsulates a FileSearch object. The objective
 * is execute that task and returns the result that it generates
 * as it was a Callable object 
 *
 */
public class Task extends FutureTask<List<String>> {

	private FileSearch fileSearch;
	
	/**
	 * Constructor of the class
	 * @param runnable FileSearh object that is going to execute
	 * @param result Object to return as result. We are going to ignore this structure
	 */
	public Task(Runnable runnable, List<String> result) {
		super(runnable, result);
		this.fileSearch=(FileSearch)runnable;
	}

	/**
	 * Override the set method. As we are going to execute a Runnable object, this
	 * method establish the null value as result. We change this behavior returning
	 * the result list generated by the FileSearch task
	 */
	@Override
	protected void set(List<String> v) {
		v=fileSearch.getResults();
		super.set(v);
	}
}
