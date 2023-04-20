package Homework.Callable;

import java.util.concurrent.Callable;

//实现callable接口，其泛型call方法执行完得到的结果类型
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        //计算1-100的数据和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
