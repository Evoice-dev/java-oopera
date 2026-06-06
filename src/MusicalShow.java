import java.util.ArrayList;

public class MusicalShow extends Show{
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, Director director, double duration, Person musicAuthor, String librettoText) {
        super(title, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText(){
        return librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }
}
