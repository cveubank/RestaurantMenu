import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menuList() {
        MenuItem hamburger = new MenuItem("Hamburger", 5,  "Delicious hunk of meat between two sesame buns, served with french fries.",  "Entree", true);
        MenuItem grilledChicken = new MenuItem("Grilled chicken", 8,  "Juicy grilled chicken seared on the grill with a side of veggies and a baked potato.",  "Entree", true);
        MenuItem chocoCake = new MenuItem("Chocolate cake", 7, "Layers of melted, delicious chocolate cake and ganache served with vanilla ice cream.", "Dessert", false);
        MenuItem applePie = new MenuItem("Apple pie", 5, "Cinnamon and apples baked into a crispy crust, served with cinnamon vanilla ice cream.", "Dessert", true);
        MenuItem spinachDip = new MenuItem("Spinach dip", 4, "Creamy, cheesy dip with chunks of artichoke and spinach, served with chips and baguette for dipping.", "Appetizer", false);
        MenuItem pretzelBites = new MenuItem("Pretzel bites", 3, "Tender pretzel bites with flaky sea salt, served with melted cheese and mustard for dipping.", "Appetizer", false);

        ArrayList<Object> wholeMenu = new ArrayList<>();
        wholeMenu.add(hamburger);
        wholeMenu.add(grilledChicken);
        wholeMenu.add(chocoCake);
        wholeMenu.add(applePie);
        wholeMenu.add(spinachDip);
        wholeMenu.add(pretzelBites);

        for(int i = 0; i < wholeMenu.size(); i++){
            System.out.println(wholeMenu.get(i));
        }
    }
//
//    public static void oneItem() {
//
//    }
}
