package practiseone;

public class practiseone extends Thread{
	
		private String who;
	
		public void run() {
			System.out.println(who+":"+this.getName());	
		}
		
		public practiseone(String who){
			super();
			this.who=who;
		}
		
		public practiseone(String who, String name){
			super(name);
			this.who=who;
		}
		
		public static void methor() {
			
			practiseone thread1 = new practiseone("thread1","my thread1");
			practiseone thread2 = new practiseone("thread2");
			practiseone thread3 = new practiseone("thread3");
			
//			practiseone.setName("my thread2");
			
			thread1.start();
			thread2.start();
			thread3.start();
			
			
		}
		
	}

