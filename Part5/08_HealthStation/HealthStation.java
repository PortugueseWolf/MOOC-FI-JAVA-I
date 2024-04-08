
public class HealthStation {

    private int countOfWeighings;

    public HealthStation () {
        countOfWeighings = 0;
    }

    public int weigh(Person person) {
        int weight = person.getWeight();
        countOfWeighings ++;
        return weight;
    }

    public void feed (Person person) {
        int weight = person.getWeight() + 1;
        person.setWeight(weight);
    }

    public int weighings () {
        return countOfWeighings;
    }
}