package java8.lambda;

import java.util.Arrays;

public class LambdaExpression {
    public static void main(String[] args) {
        //익명 클래스로 Runnable 구현
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start to new thread!");
            }
        });

        thread1.start();
        ////

        // 람다 표현식으로 단순하게 표현
        Thread thread2 = new Thread(() -> System.out.println("Start to new thread!"));
        thread2.start();
        //
        int[] arr = new int[5];
        Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1);

        for (int i : arr) {
            System.out.println(i);//
        }
    }
}
