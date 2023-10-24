package kadai42;
import java.util.Arrays;

public class Main {
    public static void main(String... args){
        Image image = new Image("hosi");
        System.out.println("Image shows" + image.show());

        Music music = new Music("♪Twinkle twinkle litle star", Arrays.<String>asList("C","C","G","G","A","A","G"));
        System.out.println("Music shows"+ music.show());
        System.out.println("Music plays" + music.play());
    }
}
