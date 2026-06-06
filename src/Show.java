import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, Director director, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public void addActor(Actor newActor){
        if(!listOfActors.contains(newActor)){
            listOfActors.add(newActor);
        }else{
        }
    }

    public void changeActor(Actor oldActor, Actor newActor){
        for(int i = 0; i < listOfActors.size(); i++){
            if(listOfActors.get(i).equals(oldActor)){
                listOfActors.set(i, newActor);
            }
        }
    }

    @Override
    public String toString() {
        String result = "-------\n" + title + "\n-------\n";
        for(Actor actor : listOfActors){
            result += actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")\n";
        }

        return result;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }
}
