package ch04_class;

// 현민이 오빠 거
public class exProduct01 {
    // 클래스 정의
    // 맴버 변수 선언
    private String movement;
    private int power_reserve;
    String material;

    //메소드 선언
    void Display(){
        System.out.println("무브먼트 : " + movement);
        System.out.println("파워리저브 : " + power_reserve);
        System.out.println("재질 : " + material);
    }

    public void setMovement (String _movement){
        movement = _movement;
    }

    public String getMovement (){
        return movement;
    }

    public void setPower_reserve (int _power_reserve){
        power_reserve = _power_reserve;
    }

    public int getPower_reserve (){
        return power_reserve;
    }

}