package kadai43;
import java.util.Arrays;

public class Main {
    public static void main(String... args){
        Image image = new Image("☆");
        System.out.println("Image shows" + image.show());

        Music music = new Music("♪Twinkle tinkle litle star", Arrays.<String>asList("C","C","G","G","A","A","G"));
        System.out.println("Music shows" + music.show());
        System.out.println("Music plays" + music.play());

        Movie movie = new Movie("Twinkle twinkle little star", 
            Arrays.<String>asList("C","C","G","G","G","A","A","G"), 
            Arrays.<String>asList("☆","☆","★","★","☆","☆","★")
        );

        System.out.println("Movie shows" + movie.show());
        System.out.println("Movie plays" + movie.play());

    }
}
