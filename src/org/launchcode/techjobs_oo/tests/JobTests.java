package org.launchcode.techjobs_oo.tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTests {

    Job idjob1;
    Job idjob2;

    @Before
    public void createjobobject(){
        idjob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        idjob2 = new Job((""), new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));



    }


    @Test
    public void fixMistake(){
        assertSame(idjob1.getId(),idjob2.getId()-1);
    }


    @Test
    public void testSettingJob(){
        assertEquals(1,idjob2.getId()- idjob1.getId());
    }

    @Test
    public void fullConstructJob(){
            assertEquals("Product tester",idjob1.getName());
    }

    @Test
    public void fullConstructJob2(){
        assertEquals("ACME",idjob1.getEmployer().getValue());
    }

    @Test
        public void fullConstructJob3(){
        assertEquals("Desert",idjob1.getLocation().getValue());
    }

    @Test
    public void fullConstructJob4(){
        assertEquals("Quality control",idjob1.getPositionType().getValue());
    }
    @Test
    public void fullConstructJob5(){
        assertEquals("Persistence",idjob1.getCoreCompetency().getValue());
    }
     @Test
    public void stringTest1(){
        int lastIndex = idjob1.toString().length()-1;
        assertEquals('\n',idjob1.toString().charAt(0));
        assertEquals('\n',idjob1.toString().charAt(lastIndex));
     }
    @Test
    public void fullstring(){
        assertEquals("\n" +
                "id:" + idjob1.getId() +'\n'+
                "name:" + idjob1.getName() + '\n' +
                "employer:" + idjob1.getEmployer() +"\n"+
                "location:" + idjob1.getLocation().getValue() +"\n"+
                "positionType:" + idjob1.getPositionType().getValue() +"\n"+
                "coreCompetency:" + idjob1.getCoreCompetency().getValue()+"\n",idjob1.toString());
    }
    @Test
    public void emptyField1(){
        assertEquals('\n'+"id:" + idjob2.getId() +'\n'+
                "name:" +"Data not available" + '\n' +
                "employer:" +"Data not available" +"\n"+
                "location:" + "Data not available" +"\n"+
                "positionType:" + "Data not available" +"\n"+
                "coreCompetency:" + "Data not available" +"\n",idjob2.toString());
    }
}
