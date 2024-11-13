package asdf;

public class Child extends Parent {
    int value = 20; // 부모의 value와 동일한 이름

    @Override
    public void display() {
        super.display(); // 부모 클래스의 display() 메서드 호출
        System.out.println("Child display");
    }

    public void printValue() {
        System.out.println("Parent value: " + super.value); // 부모 클래스의 value 변수 접근
        System.out.println("Child value: " + this.value);
    }
}
