package java8.default_method;

public class HorseCar implements Car {
    // reverse가 default가 아니라면 HorseCar에서 불필요한 reverse 메서드를 구현해줘야 한다.
    public void drive() {
        System.out.println("마차가 앞으로 갑니다.");
    }
}
