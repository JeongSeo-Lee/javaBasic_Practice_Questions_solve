import java.util.Scanner;

abstract class Player {
 	void play(int pos) {System.out.println("상속받은 클래스에서 이 메소드를 작성하고 실행하면 지금 이 메소드는 덮어 씌워진다.");}
 	abstract void stop ();
}

class AudioPlayer extends Player {
//	void play(int pos) {
//		System.out.println(pos + "의 위치부터 시작합니다.");
//	}
	void stop() {
		System.out.println("stop!");
	}
}	

public class PlayerTest {
	public static void main(String[] args) {
		AudioPlayer ap  = new AudioPlayer();
		ap.play(100);
		ap.play(100);
		ap.stop();
		
		//다형성 
		Player ap2 = new AudioPlayer();
		ap2.play(101);
		ap2.stop();
		Scanner sc = new Scanner(System.in);
		
	}
}
