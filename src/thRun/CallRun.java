package thRun;

import java.util.concurrent.Callable;

public class CallRun implements Callable<String> {

	private String st;
	public CallRun(String st){
		this.st=st;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return st;
	}

}
