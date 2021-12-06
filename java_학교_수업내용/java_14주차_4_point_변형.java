public class java_14주차_4_point_변형 {
    private int x,y;

    public java_14주차_4_point_변형()
    {
        x = y = 0;
    }
    public java_14주차_4_point_변형(int x,int y)
    {
        this.x = x; this.y = y;
    }
    void setXY(int x, int y){
        this.x = x;
         this.y =y;
    }
    void showXY(){
        System.out.println("(x:"+ x+", y:"+y+")");
    }
}
