package com.bme.syx.threadteset;


/**
 *
 * 调用 run方法时，只有主线程一条路径，先执行run，后执行main
 * 调用start方法时，多条路径，并行交替执行
 */
public class TestThread1  extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100 ; i++) {
            System.out.println("我是线程thread----"+i);
        }
    }
    public static  void  main(String[] args){
        TestThread1 testThread1 = new TestThread1();
        testThread1.start();
        for (int i = 0; i <100; i++) {
            System.out.println("我是主线程main----"+i);
        }
    }
}
