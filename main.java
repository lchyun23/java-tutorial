public class main {
    public static void main(String[] args) {
       // Calculator 객체 생성
       Calculator calculator = new Calculator();

       // 메서드 호출
      int sum = calculator.add(5, 3);
      int difference = calculator.subtract(5, 3);

       // 결과 출력
       System.out.println("Sum: " + sum);
       System.out.println("Difference " + difference);
    }
}
// 메서드는 매개변수를 받아 결과를 반환하는 방식으로 동작한다.
