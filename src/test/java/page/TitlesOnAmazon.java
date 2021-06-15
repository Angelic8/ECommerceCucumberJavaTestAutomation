package page;

import java.util.ArrayList;
import java.util.List;

public class TitlesOnAmazon {

    private List<Title> titleList = new ArrayList<Title>();
    private List<Title> foundList = new ArrayList<Title>();

    public void setTitleList(Title title) {
        titleList.add(title);
    }

    public List<Title> getTitleList(String brand) {

        for (Title title: foundList){
            if (title.getBrand().equals(brand)){
                foundList.add(title);
                continue;
            }
        }

        return foundList;
    }

} // end TitlesOnAmazon
