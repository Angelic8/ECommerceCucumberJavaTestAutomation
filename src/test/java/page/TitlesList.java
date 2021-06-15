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
        testList.add("Title1");
        testList.add("Title2");

        System.out.println("Test all titles Lists " + testList);

        // use foreach loop to hold any individual values in the list
        for (String list: testList) {
            System.out.println("Individual list: " + list);
        }

        System.out.println(testList.size());
    } // end testTitlesList()

    @Test
    public void testTitles2(){
        List<Title> titleList = new ArrayList<Title>();
        Title title = new Title("Title1","Title2");

        titleList.add(title);

        System.out.println("list of titles: " + title.getTitle() + " and " + title.getBrand());

    } // end testTitles()

} // end TitlesList
