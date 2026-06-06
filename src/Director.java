public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, Genders gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname();
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }
}
