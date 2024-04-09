import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room(){
        this.people = new ArrayList<>();
    }

    public void add(Person person){
        people.add(person);
    }

    public boolean isEmpty(){
        if(people.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        if(people.isEmpty()){
            return null;
        }
        return people;
    }

    public Person shortest(){
        if(people.isEmpty()){
            return null;
        }
        int height = people.get(0).getHeight();
        int index = 0;
        for(int i = 0; i < people.size(); i++){
            if(people.get(i).getHeight() <  height){
                height = people.get(i).getHeight();
                index = i;
            }
        }
        return people.get(index);
    }

    public Person take(){
        if(people.isEmpty()){
            return null;
        }
        Person remover = new Person(shortest().getName(), shortest().getHeight());
        people.remove(remover);
        return remover;
    }
}
