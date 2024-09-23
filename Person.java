// 클래스는 객체를 생성하기 위한 템플릿이다.
class Person {
    // 클래스 필드(변수)
    String name;
    int age;

    // 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 클래스 메서드 : 사람의 이름을 출력하는 간단한 메서드
    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

