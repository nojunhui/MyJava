package ch04_class;

public class MusicMain {

    public static void main(String[] args) {

        // 객체 생성 (생성자 사용)
        Music song1 = new Music("Ditto", "NewJeans", 2023);
        song1.display();

        System.out.println();

        Music song2 = new Music("Dash", "NMIXX", 2024);
        song2.display();

        System.out.println();

        // getter 사용
        System.out.println(song1.getTitle());
        System.out.println(song1.getSinger());
        System.out.println(song1.getYear());
        System.out.println();

        // 기본 생성자로 객체 생성
        Music song3 = new Music();

        // setter로 값 넣기
        song3.setTitle("Love Dive");
        song3.setSinger("IVE");
        song3.setYear(2022);

        song3.display();

        System.out.println();
        System.out.println("노래 배열을 만들어 봅니다.");

        // 배열 생성
        int size = 3;
        Music[] musicList = new Music[size];

        // 배열에 객체 넣기
        musicList[0] = new Music("Hype Boy", "NewJeans", 2022);
        musicList[1] = new Music("Super Shy", "NewJeans", 2023);
        musicList[2] = new Music("Drama", "aespa", 2023);

        // 배열 출력
        for(int i = 0; i < musicList.length; i++){
            System.out.println((i+1) + "번째 노래 정보");
            musicList[i].display();
            System.out.println();
        }

        // 초기화 방식 배열
        Music[] musicArray = {
                new Music("Love Dive","IVE",2022),
                new Music("ETA","NewJeans",2023),
                new Music("Perfect Night","LE SSERAFIM",2023)
        };

        System.out.println("초기화 방식 배열 출력");

        for(int i = 0; i < musicArray.length; i++){
            System.out.println((i+1) + "번째 노래 정보");
            musicArray[i].display();
            System.out.println();
        }
    }
}