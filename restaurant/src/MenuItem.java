import java.util.ArrayList;
import java.util.HashMap;

public class MenuItem {

    private String name;
    private float price;
    private String description;
    private String category;

    public MenuItem(String name, float price, String description, String category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
      return this.name + " (" + this.category + "): " + this.description + " " + "$" + this.price;
    }

    //need ENTIRE MENU

//    MenuItem hamburger = new MenuItem("Hamburger", 5,  "Delicious hunk of meat between two sesame buns, served with french fries.",  "Entree");
//    MenuItem grilledChicken = new MenuItem("Grilled chicken", 8,  "Juicy grilled chicken seared on the grill with a side of veggies and a baked potato.",  "Entree");
//    MenuItem chocoCake = new MenuItem("Chocolate cake", 7, "Layers of melted, delicious chocolate cake and ganache served with vanilla ice cream.", "Dessert");
//    MenuItem applePie = new MenuItem("Apple pie", 5, "Cinnamon and apples baked into a crispy crust, served with cinnamon vanilla ice cream.", "Dessert");
//    MenuItem spinachDip = new MenuItem("Spinach dip", 4, "Creamy, cheesy dip with chunks of artichoke and spinach, served with chips and baguette for dipping.", "Appetizer");
//    MenuItem pretzelBites = new MenuItem("Pretzel bites", 3, "Tender pretzel bites with flaky sea salt, served with melted cheese and mustard for dipping.", "Appetizer");
//
//    ArrayList<MenuItem> wholeMenu = new ArrayList<MenuItem>();
//    wholeMenu.add(MenuItem(hamburger));
//    wholeMenu.add(grilledChicken);
//    wholeMenu.add(chocoCake);
//    wholeMenu.add(applePie);
//    wholeMenu.add(spinachDip);
//    wholeMenu.add(pretzelBites);

    //method to delete an item, then re-print the menu -- remove, then loop again?
    // new or not
    // when was it last updated


}
