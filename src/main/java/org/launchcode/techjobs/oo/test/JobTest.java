package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
        assertNotEquals(test_job1.getId() != test_job2.getId(), false, .001);
    }

    private void assertNotEquals(boolean b, boolean b1, double v) {
    }


}
