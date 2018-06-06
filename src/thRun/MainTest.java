package thRun;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class MainTest {

	public static void main(String[] args) {
		
		int[] ii=new int[10];
		int[] iii=new int[20];
		ii=iii;
		System.out.println(ii.length);
		
		
		// TODO Auto-generated method stub
		/*for(int i=0;i<5;i++){
			new Thread(new TheRun()).start();
		}
		*/
		ExecutorService exe=Executors.newCachedThreadPool();
		/*for(int i=0;i<3;i++){
			exe.execute(new TheRun());
		}
		exe.shutdown();*/
		FutureTask<String> ft=(FutureTask) exe.submit(new CallRun("我是张三"));
		for(int i=0;i<3;i++){
			new Thread(ft).start();
			try {
				System.out.println(ft.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
