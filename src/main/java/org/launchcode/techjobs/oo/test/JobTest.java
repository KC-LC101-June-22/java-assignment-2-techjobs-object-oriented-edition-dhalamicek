package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.text.CharacterIterator;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job("Test1name");
        Job test_job2 = new Job("Test2name");
        assertNotEquals(test_job1.getId() == test_job2.getId(), false);
    }

Job test_job3;

    @Test
    public void testJobConstructorSetsAllFields (){
        Job test_job3 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job3.getName() instanceof String);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", test_job3.getName());

        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality (){
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job4.equals(test_job5));

    }

@Test
    public void  testToStringStartsAndEndsWithNewLine () {


    Job test_job6 = new Job("Quality Assurance Tech", new Employer("Rover"), new Location("Remote"), new PositionType("Web development"), new CoreCompetency("HTML"));

    String charsOfJob = test_job6.toString();
    Character firstChar = charsOfJob.charAt(0);

    int lengthOfJob = charsOfJob.length();
    Character lastChar = charsOfJob.charAt(lengthOfJob-1);
    Character newLine = '\n';
    assertEquals(newLine, firstChar);
    assertEquals(newLine, lastChar);
    }
            //When passed a Job object, it should return a string that contains a blank line before and after the job information.




@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job test_job7 = new Job("Quality Assurance Manager", new Employer("Garmin"), new Location("Olathe"), new PositionType("Product development"), new CoreCompetency("Java"));
    String stringOfJob = test_job7.toString();
    String expectedOutput = '\n' + "ID: "+ test_job7.getId()+ '\n'+"Name: "+ test_job7.getName() + '\n'+"Employer: "+ test_job7.getEmployer()+'\n'+"Location: " + test_job7.getLocation() +'\n'+ "Position Type: " + test_job7.getPositionType()+'\n'+"Core Competency: "+ test_job7.getCoreCompetency()+'\n';
    assertEquals(expectedOutput, stringOfJob);
    //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
}

@Test
    public void testToStringHandlesEmptyField(){
    Job test_job8 = new Job("Quality Assurance Tech", new Employer(""), new Location("Kansas City"), new PositionType("Web development"), new CoreCompetency("HTML"));
    String stringOfJob8 = test_job8.toString();
    String expectedJob8 = '\n' + "ID: "+ test_job8.getId()+ '\n'+"Name: "+ test_job8.getName() + '\n'+"Employer: Data not available"+ '\n'+"Location: "+test_job8.getLocation()+ '\n'+ "Position Type: " + test_job8.getPositionType()+'\n'+"Core Competency: "+ test_job8.getCoreCompetency()+'\n';
assertEquals(expectedJob8, stringOfJob8);

Job test_job9 = new Job("Developer", new Employer("Garmin"), new Location(""), new PositionType(""), new CoreCompetency("Java"));
    String stringOfJob9 = test_job9.toString();
    String expectedJob9 = '\n' + "ID: "+ test_job9.getId()+ '\n'+"Name: "+ test_job9.getName() + '\n'+"Employer: "+ test_job9.getEmployer()+'\n'+"Location: Data not available"+ '\n'+ "Position Type: " + test_job9.getPositionType()+'\n'+"Core Competency: "+ test_job9.getCoreCompetency()+'\n';
    assertEquals(expectedJob8, stringOfJob8);

//If a field is empty, the method should add, “Data not available” after the label.
}

//bonus test If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
}
