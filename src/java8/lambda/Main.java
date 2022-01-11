package java8.lambda;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car() {
            @Override
            public String drive(int driveLevel) {
                return driveLevel == 0 ? "" : "자동차가 " + driveLevel + " 의 속도로 이동합니다.";
            }
        };

        System.out.println(car1.drive(10));

        // 람다 표현식
        Car car2 = (i) -> i == 0 ? "" : "자동차가 " + i + " 의 속도로 이동합니다.";
        System.out.println(car2.drive(10));

        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int big = f.max(5, 3);

        System.out.println(big);

        // 람다식으로 익명 객체를 표현
        MyFunction f2 = (a, b) -> a > b ? a : b;
        int big2 = f2.max(5,3);
        System.out.println(big);
    }
}
