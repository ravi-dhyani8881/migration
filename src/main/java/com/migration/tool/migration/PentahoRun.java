package com.migration.tool.migration;

public class PentahoRun implements Runnable{
	
	
	String jobname;
	
	

	public PentahoRun(String jobname) {
		super();
		this.jobname = jobname;
	}

	public void run() {
		System.out.println("Calling Run"+jobname);	
		
		
	}
	
	
}
