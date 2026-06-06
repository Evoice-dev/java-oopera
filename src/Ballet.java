public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(String title, Director director, double duration, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, director, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
