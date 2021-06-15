package page;

public class Title {

    private String title;
    private String brand;

    public Title(String title, String brand){
        this.title = title;
        this.brand = brand;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return brand;
    }


} // end Title
