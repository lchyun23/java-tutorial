public class Main {
    public static void main(String[] args) {
        // Calculator 객체 생성 
        Calculator calculator = new Calculator();
        
        // 첫 번째 add 메서드 호출 (정수 두 개)
        int sum = calculator.add(3, 4);

        // 두 번째 add 메서드 호출 (정수 세 개)
        int sums = calculator.add(3, 4, 5);

        // 세 번째 add 메서드 호출 (실수 세 개)
        double doubleSums = calculator.add(3.2, 4.3, 5.4);

        // 결과 출력
        System.out.println("Sum : " + sum);
        System.out.println("Sums : " + sums);
        System.out.println("doubleSums : " + doubleSums);
    }
}
