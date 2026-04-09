package edu.ucsb.cs156.spring.hello;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Chaewon", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubID(){
        assertEquals("Chaehana", Developer.getGithubId());
    }

    @Test 
    public void getTeam_returns_team_with_correct_name(){
        Team t = Developer.getTeam();
        assertEquals("s26-06", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Aiden(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Aiden"), "Team should contain Aiden");
    }

    @Test
    public void getTeam_returns_team_with_Chaewon(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Chaewon"), "Team should contain Chaewon");
    }

    @Test
    public void getTeam_returns_team_with_Dongyi(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Dongyi"), "Team should contain Dongyi");
    }

    @Test
    public void getTeam_returns_team_with_Ethan(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Ethan"), "Team should contain Ethan");
    }

    @Test
    public void getTeam_returns_team_with_Prisha(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Prisha"), "Team should contain Prisha");
    }

    @Test
    public void getTeam_returns_team_with_Roy(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Roy"), "Team should contain Roy");
    }

}
