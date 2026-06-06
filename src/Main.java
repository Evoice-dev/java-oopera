public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Алексей", "Никишин", Genders.MALE, 181);
        Actor actor2 = new Actor("Никита", "Турик", Genders.MALE, 190);
        Actor actor3 = new Actor("Ксения", "Антонюк", Genders.FEMALE, 164);

        Director director1 = new Director("Светлана", "Волкова", Genders.FEMALE, 154);
        Director director2 = new Director("Галина", "Лукоянова", Genders.FEMALE, 168);

        Person choreographer = new Person("Татьяна", "Крымсакова", Genders.FEMALE);
        Person musicAuthor = new Person("Максим", "Шадрин", Genders.MALE);

        Show show = new Show("Первый робинзон", director1, 120);
        Opera opera = new Opera("Одни из нас", director2, 90, musicAuthor, "Здесь должен быть текст, а будет Lorem", 21);
        Ballet ballet = new Ballet("Ходячие глупцы", director1, 45, musicAuthor, "Lorem lorem lorem lorem lorem", choreographer);

        show.addActor(actor2);
        show.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println(show);
        System.out.println(opera);
        System.out.println(ballet);

        opera.changeActor(actor2, actor3);
        System.out.println(opera);

        show.changeActor(actor1, actor3);

        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());

    }
}
