package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

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

        //assertEquals(test_job3.getEmployer(), "ACME");
        //assertEquals("Desert", test_job3.getLocation());
       // assertEquals("Quality control", test_job3.getPositionType());
        //assertEquals("Persistence", test_job3.getCoreCompetency());


    }
 //The text said to use equals and get a false.  Tried writing test_job4.getId() != test_job5.getId() and did not work
    @Test
    public void testJobsForEquality (){
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(test_job4.getId() == test_job5.getId(), true);

        //assertFalse(test_job4.getId(), test_job5.getId());

        //below indicates that the ids are in fact unique despite all the parameters being identical, but how to accurately write the test?
        //assertEquals(test_job4.getId(), test_job5.getId());
    }



}
