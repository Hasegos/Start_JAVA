import java.util.*;
public class while_문을_이용하여_입력된_정수의_평균구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0 , n = 0;
        double sum = 0; // 합

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
        while((n = scanner.nextInt()) != 0)
        {
            sum += n;
            count ++;
        }        
        System.out.print("수의개수는"+count+"개이며");
        System.out.println("평균은"+sum/count+"입니다");
        scanner.close();
    }
}
