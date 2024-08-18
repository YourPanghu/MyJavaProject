/*
    需求：创建两个线程任务，一个线程任务完成1-100的和，一个线程任务返回一个字符串
 */

package ThreadPool_Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01{
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		//创建线程池对象
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<String> f1 = es.submit(new MyString());
		Future<Integer> f2 = es.submit(new MySum());
		System.out.println(f1.get());
		System.out.println(f2.get());
	}
}
