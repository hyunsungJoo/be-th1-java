package day15_thread.syncronized;

public class SimpleThread {   // Outer class
	
	 static void threadMessage(String message) {
		 String threadName = Thread.currentThread().getName();
		 System.out.printf("%s : %s \n\n", threadName, message);
	 }
	 
	 static class MessageLoop implements Runnable {  // Inner class
		 	
		@Override
		public void run() {
			String[] importantInfo = { "aa aa", "bb b", "cc c", "dd d" };
			
			try {
				for (int i = 0; i < importantInfo.length; i++) {
					Thread.sleep(4000);  // 4초
					threadMessage("I wasn't  done!!!!");
				} // end for
			} catch (Exception e) {
				e.printStackTrace();
			}  // try end
			
		}  // run() end
		 
	 } // end MessageLoop  - inner class
	 
	 public static void main(String[] args) throws InterruptedException {
		long parience = 1000 * 60 * 60;
		
		if( args.length > 0 ) {
			try {
				parience = Long.parseLong(args[0]) * 1000;
				
			} catch (Exception e) {
				System.out.println("argument integer input ");
				System.exit(1);   // 강제 종료
			}  // try end 
		} // end if
		
		threadMessage("Start MessageLoop thread test ");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		while( t.isAlive() ) { // isAlive() 메서드는 특정 스레드가 현재 실행 중인지 여부를 확인
			threadMessage("still waitting...................................");
			t.join(1000); // join() 메서드는 특정 스레드가 종료될 때까지 다른 스레드를 대기시키는 역할
			
			if( ( ( System.currentTimeMillis() - startTime ) > parience  ) && t.isAlive()  ) {
				
				threadMessage("Tired of watting............................");
				t.interrupt(); // interrupt() 메소드는 스레드가 일시 정지 상태에 있을 때 InterruptedException 예외를 발생시키는 역할
				t.join(); 
				
			} // if end
		} // end while
		
		threadMessage("Finally..........................................................");
	}
}  // end SimpleThread  - outer class
