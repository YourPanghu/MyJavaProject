package ThreadPool_Test;

import java.util.concurrent.Callable;

public class MySum implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=0; i<=100; i++){
			sum+=i;
		}
		
		return sum;
	}
}