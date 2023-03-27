package tpsit.thread;



public class Campane extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		Campane thr0 = new Campane();
		/*M1*/System.out.println("Prima dell'invocazione dei Thread");
		thr0.start();
		//thr0.join();
		System.out.println("Dopo l'invocazione dei Thread");
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" din");
		System.out.println(Thread.currentThread().getName()+" don");
		System.out.println(Thread.currentThread().getName()+" dan");
	}
}
