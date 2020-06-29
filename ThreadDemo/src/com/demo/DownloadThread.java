package com.demo;

public class DownloadThread implements Runnable{
	
	
	
	public void run()
	{
		System.out.println(" Download started ");
		for(int i=0;i<10;i++)
		{
			System.out.println("downloading bytes i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(" Download completed ");
	}

}
