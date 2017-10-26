package com.test;

import java.util.Timer;
import java.util.TimerTask;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		        public void run() {
		            System.out.println("11232");
		        }
		}, 1000 , 1000);
		
	}

}
