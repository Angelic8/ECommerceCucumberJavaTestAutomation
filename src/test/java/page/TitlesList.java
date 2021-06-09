package page;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TitlesList {
    // This is to understand how list works

    // arraylist will be stored in testList
    List<String> testList = new ArrayList<String>();

    @Test
    public void testTitlesList(){
        testList.add("movie1");
        testList.add("movie2");

        System.out.println("Test all titles Lists " + testList);

        // use foreach loop to hold any individual values in the list
        for (String list: testList) {
            System.out.println("Individual list: " + list);
        }
        
    } // end testTitlesList()
} // end TitlesList
