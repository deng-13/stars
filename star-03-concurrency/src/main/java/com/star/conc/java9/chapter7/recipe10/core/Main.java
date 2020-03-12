//package com.star.conc.java9.chapter7.recipe10.core;
//
//import com.star.conc.java9.chapter7.recipe09.data.Account;
//import com.star.conc.java9.chapter7.recipe09.task.Decrementer;
//import com.star.conc.java9.chapter7.recipe09.task.Incrementer;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Account account = new Account();
//
//		Thread threadIncrementer = new Thread(new Incrementer(account));
//		Thread threadDecrementer = new Thread(new Decrementer(account));
//
//		threadIncrementer.start();
//		threadDecrementer.start();
//
//		try {
//			threadIncrementer.join();
//			threadDecrementer.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		System.out.printf("Safe amount: %f\n", account.amount);
//		System.out.printf("Unsafe amount: %f\n", account.unsafeAmount);
//
//	}
//
//}
