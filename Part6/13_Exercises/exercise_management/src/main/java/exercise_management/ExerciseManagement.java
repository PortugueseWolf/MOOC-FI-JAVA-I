package exercise_management;

import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;

    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
    }
    public ArrayList<String> exerciseList(){
        ArrayList<String> toReturn = new ArrayList<>();
        for(Exercise processor : exercises){
            toReturn.add(processor.getExercise());
        }
        return toReturn;
    }

    public void add(String exercise){
        exercises.add(new Exercise(exercise));
    }

    public void markAsCompleted(String exercise){
        for(Exercise processor : exercises){
            if(processor.getExercise().equals(exercise));
            processor.setCompleted(true);
        }

    }

    public boolean isComplete(String exercise){
        for(Exercise processor : exercises){
            if(processor.getExercise().equals(exercise)){
                return processor.isCompleted();
            }
        }
        return false;
    }
}
