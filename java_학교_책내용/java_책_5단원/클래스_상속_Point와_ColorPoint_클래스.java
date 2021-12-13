package java_책_5단원;

class Point{
    private int x, y; // 한 점을 구성하는 x , y 좌표
    public void set(int x, int y)
    {
        this.x = x; this.y = y;
    }
    public void showPoint() // 점의 좌표 출력
    {
        System.out.println("("+ x +","+ y+")");
    }
}
class ColorPoint extends Point{ // Point를 상속받은 ColorPoint 선언

    private String color; // 점의 색
    public  void setColor(String color)
    {
        this.color = color;
    }
    public void ShowColorPoint() // 컬러 점의 좌표 출력
    {
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 출력
    }
}
public class 클래스_상속_Point와_ColorPoint_클래스 {
    
    public static void main(String[] args) {
        Point p = new Point(); // Point 객체 생성
        p.set(1, 2); // Point 클래스의 set() 호출
        p.showPoint();

        ColorPoint cp = new ColorPoint(); // Color 객체 생성
        cp.set(3, 4); // Point 클래스의 set() 호출
        cp.setColor("red"); // ColorPoint 클래스의 setColor() 호출
        cp.ShowColorPoint(); // 컬러와 좌표 출력
    }
}
