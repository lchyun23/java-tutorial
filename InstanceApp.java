import java.io.IOException;
import java.io.PrintWriter;

// class를 복제한 인스턴스를 만드는 경우: 일회용이 아니라 계속해서 사용해야 하는 경우이다.
public class InstanceApp {
    public static void main(String[] args) throws  IOException{
        
        PrintWriter p1 = new PrintWriter("result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();
        p2.toString();
        
    }
}
