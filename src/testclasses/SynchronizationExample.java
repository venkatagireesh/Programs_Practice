package testclasses;

class MessagePrinter{
	
	//synchronizing the method
	//public synchronized void display(String msg) {
	public void display(String msg) {
		
		System.out.print("<" + msg);		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(">");
	}
}

class PrinterThread extends Thread {
	
	private String message;
	private MessagePrinter mpObject;
	
	public PrinterThread(MessagePrinter mp, String str) {
		mpObject = mp;
		message = str;		
	}
	
	public void run() {
		
		//mpObject.display(message);
		//synchronizing the block
		synchronized (mpObject) {
			mpObject.display(message);
		}
		
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {

		MessagePrinter mp = new MessagePrinter();
		PrinterThread pt1 = new PrinterThread(mp, "Welcome");
		pt1.start();
		
		PrinterThread pt2 = new PrinterThread(mp, "Java");
		pt2.start();
		
		PrinterThread pt3 = new PrinterThread(mp, "Programmer");
		pt3.start();		
		
	}

}
