package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test 
    public void toString_returns_correct_string(){
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test 
    public void equals_same_object(){
        Team t = new Team();
        assertEquals(true, t.equals(t));
    }

    @Test 
    public void equals_not_team(){
        Team t = new Team();
        assertEquals(false, t.equals(null));
        assertEquals(false, t.equals("Not a team"));

    }
    @Test 
    public void equals_name_members(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(true, t1.equals(t2));

        Team t3 = new Team();
        t3.setName("foo");
        t3.addMember("different");
        assertEquals(false, t1.equals(t3));

        Team t4 = new Team();
        t4.setName("different");
        t4.addMember("bar");
        assertEquals(false, t1.equals(t4));
    }

    @Test 
    public void hashCode_returns_correct_hash(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

}
