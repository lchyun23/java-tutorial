public class main {
    public static void main(String[] args) {
        // Rectangle 객체 생성 및 초기화
        Rectangle rectangle = new Rectangle();
        rectangle.length = 5;
        rectangle.width = 3;

        // 메서드 호출 및 반환값 저장
        int area = rectangle.calculateArea();

        // 반환값 면적 출력
        System.out.println("Area of rectangle: " + area);
    }
}
