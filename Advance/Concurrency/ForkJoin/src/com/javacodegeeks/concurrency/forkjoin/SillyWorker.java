package com.javacodegeeks.concurrency.forkjoin;

import org.perf4j.StopWatch;

public class SillyWorker {
	
	public static void main(String[] args) throws Exception {
		          System.out.println("Hello");
		int n = 50;
		
		StopWatch stopWatch = new StopWatch();
		FibonacciProblem bigProblem = new FibonacciProblem(n);	
		
		long result = bigProblem.solve();			
		stopWatch.stop();
		
		System.out.println("Computing Fib number: " + n);
		System.out.println("Computed Result: " + result);
		System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
		
	}

}
