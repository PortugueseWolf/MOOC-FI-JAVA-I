package exercise_management;

public class Exercise {
    private String exercise;
    private boolean completed;

    public Exercise(String exercise){
        this.exercise = exercise;
        this.completed = false;
    }

    public String getExercise(){
        return exercise;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public boolean isCompleted(){
        return completed;
    }
}
