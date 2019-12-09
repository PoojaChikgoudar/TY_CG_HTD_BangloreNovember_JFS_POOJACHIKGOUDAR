package com.capgemini.dsa.algorithms;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {

	public static void main(String[] args) {
	 countingDuration();
	 countingDuration2();
	 long num=9999999L;
	 System.out.println(addUpto(num));
	 System.out.println(addUptoQuick(num));

	}
	public static long addUpto(Long num) {
		long total=0L;
		for(long i=0;i<=num;i++) {
			total=total+i;
			
		}
		return total;
	}
public static long addUptoQuick(long num) {
	return num*(num+1)/2;
}
public static void countingDuration() {
	long number=999999999999L;
	Instant start=Instant.now();
	System.out.println("addUpto: "+addUpto(number));
	Instant end=Instant.now();
	long duration=Duration.between(start, end).toMillis();
	double seconds=duration/1000;
	System.out.println("addUpto: "+seconds+"seconds");
	
}
public static void countingDuration2() {
	long number=999999999999L;
	Instant start=Instant.now();
	System.out.println("addUpto: "+addUpto(number));
	Instant end=Instant.now();
	long duration=Duration.between(start, end).toMillis();
	double seconds=duration/1000;
	System.out.println("addUpto: "+seconds+"seconds");
	
}
}
