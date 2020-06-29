package com.demo;

public class TestThread {

	public static void main(String[] args) {
		
		DownloadThread  d1 = new DownloadThread();
		UploadThread    u1 = new UploadThread();
		
		Thread   t1 = new Thread(d1);
		Thread   t2 = new Thread(u1);
		
		t1.start();
		t2.start();

	}

}
