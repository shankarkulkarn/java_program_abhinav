package com.demo;

public class UploadThread implements Runnable  {

	public void run()
	{
		System.out.println(" Upload started ");
		for(int i=0;i<10;i++)
		{
			System.out.println("uploading bytes i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("upload completed ");
	}
}
