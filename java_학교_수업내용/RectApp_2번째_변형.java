import java.util.*;
public class RectApp_2번째_변형 {    

    private static String name; // 어쩔수없이 다른 파일에서는 못쓰게끔 만든 변수 name 선언
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RectApp_2번째_변형.name  = "korea"; // Rect_2번째_변형에 Static String name; 
                                           // 이라고 선언을해줘도 파일을 못찾는다.?? 

        Rect_2번째_변형 data = new Rect_2번째_변형(); //  객체 생성
        data.name = "ulsan";
        System.out.print("높이:");
        data.setWidth(scanner.nextInt()); // 입력 함수에 입력해주기
        System.out.print("넓이:");
        data.setHeight(scanner.nextInt());
        System.out.println("이름:"+data.name+" 높이:"+data.getHeight()+
        "==>면적: "+data.getArea()); // 출력 함수들 출력


        Rect_2번째_변형 data2 = new Rect_2번째_변형(); //  객체 생성
        data2.name = "seoul";
        System.out.print("높이:");
        data2.setWidth(scanner.nextInt());
        System.out.print("넓이:");
        data2.setHeight(scanner.nextInt());
        System.out.println("이름:"+data2.name+" 높이:"+data2.getHeight()+
        "==>면적: "+data2.getArea());

        System.out.println(data.name);        

        scanner.close();
        
    }
    
}
