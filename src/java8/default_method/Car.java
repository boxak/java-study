package java8.default_method;

public interface Car {
    //전진
    void drive();

    //후진
    default void reverse(){};

    //날기
    default void fly() {
        System.out.println("Fly to the moon");
    }
}
