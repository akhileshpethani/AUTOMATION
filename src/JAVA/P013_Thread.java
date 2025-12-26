package JAVA;

public class P013_Thread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		Thread t = new Thread ();
		t.setName("test");
		System.out.println(t);
		long StartTime = System.currentTimeMillis();
		for (int i = 1 ; i < 5; i++ )
		{
			System.out.println( t + " : " + i);
			Thread.sleep(3000);
		}
		long endtime = System.currentTimeMillis();
		System.out.println("total time "+ (endtime - StartTime));
	}

}
