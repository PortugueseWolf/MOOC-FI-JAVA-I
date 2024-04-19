package exercise_management;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class ExerciseManagementTest 
{
    private ExerciseManagement tester;

    @Before
    public void initialize(){
        tester = new ExerciseManagement();
    }
    @Test
    public void exerciseListEmptyAtBeginning(){
        assertEquals(0, tester.exerciseList().size());
    }
    @Test
    public void exerciseListGrowsByOne(){
        tester.add("Test");
        assertEquals(1, tester.exerciseList().size());
    }

    @Test
    public void addedExerciseInList(){
        tester.add("test");
        assertTrue(tester.exerciseList().contains("test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        tester.add("test");
        tester.markAsCompleted("test");
        assertTrue(tester.isComplete("test"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        tester.add("test");
        tester.markAsCompleted("test");
        assertFalse(tester.isComplete("test1"));
    }
}
