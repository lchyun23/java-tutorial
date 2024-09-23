public class Calculator {
    // 메서드 오버로딩 - 첫 번째 메서드: 두 개의 정수를 더하는 메서드 작성
    public int add(int a, int b) {
        return  a + b;
    }

    // 두 번째 메서드: 세 개의 정수를 더하는 메서드 작성
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 세 번째 메서드: 두 개의 실수(double)을 더하는 메서드 작성
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
