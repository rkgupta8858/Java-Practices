package com.rahul.interthreadcomm;

class WriteAndRead {
	private String message;

	public synchronized void writeMessage(String message) {
		System.out.println("Writing the Message ...." + Thread.currentThread().getName());
		this.message = message;
		System.out.println("Message Written....." + Thread.currentThread().getName());
		this.notify();
	}

	public synchronized void readMessage() throws InterruptedException {
		System.out.println("Waiting to read the Message ...." + Thread.currentThread().getName());
		this.wait();
		System.out.println("Message Read : " + message + " " + Thread.currentThread().getName());
	}
}

class ReaderThread extends Thread {
	WriteAndRead writeAndRead;

	public ReaderThread(WriteAndRead writeAndRead) {
		this.writeAndRead = writeAndRead;
	}

	@Override
	public void run() {
		try {
			writeAndRead.readMessage();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class WriterThread extends Thread {
	WriteAndRead writeAndRead;

	public WriterThread(WriteAndRead writeAndRead) {
		this.writeAndRead = writeAndRead;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writeAndRead.writeMessage("This is test Message.....");
	}

}

public class InterThreadCommunicationExample {

	public static void main(String[] args) {
		WriteAndRead writeAndRead = new WriteAndRead();
		ReaderThread readerThread = new ReaderThread(writeAndRead);
		WriterThread writerThread = new WriterThread(writeAndRead);

		readerThread.start();
		writerThread.start();
		
	}

}
