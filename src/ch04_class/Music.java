package ch04_class;

public class Music {

    // 멤버 변수
    private String title;   // 노래 제목
    private String singer;  // 가수
    private int year;       // 발매년도

    // 기본 생성자
    public Music(){
        System.out.println("음악 객체가 생성되었습니다.");
    }

    // 생성자 (오버로딩)
    public Music(String title, String singer, int year){
        this.title = title;
        this.singer = singer;
        this.year = year;
    }

    // 정보 출력 메소드
    void display(){
        System.out.println("노래 제목 : " + title);
        System.out.println("가수 : " + singer);
        System.out.println("발매년도 : " + year);
    }

    // setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setSinger(String singer){
        this.singer = singer;
    }

    public void setYear(int year){
        this.year = year;
    }

    // getter
    public String getTitle(){
        return title;
    }

    public String getSinger(){
        return singer;
    }

    public int getYear(){
        return year;
    }
}