import java.util.ArrayList;

public class Restaurant {

    public static void main (String[] args){

        MenuItem hamburger = new MenuItem("Hamburger", 5,  "Delicious hunk of meat between two sesame buns, served with french fries.",  "Entree");
        MenuItem grilledChicken = new MenuItem("Grilled chicken", 8,  "Juicy grilled chicken seared on the grill with a side of veggies and a baked potato.",  "Entree");
        MenuItem chocoCake = new MenuItem("Chocolate cake", 7, "Layers of melted, delicious chocolate cake and ganache served with vanilla ice cream.", "Dessert");
        MenuItem applePie = new MenuItem("Apple pie", 5, "Cinnamon and apples baked into a crispy crust, served with cinnamon vanilla ice cream.", "Dessert");
        MenuItem spinachDip = new MenuItem("Spinach dip", 4, "Creamy, cheesy dip with chunks of artichoke and spinach, served with chips and baguette for dipping.", "Appetizer");
        MenuItem pretzelBites = new MenuItem("Pretzel bites", 3, "Tender pretzel bites with flaky sea salt, served with melted cheese and mustard for dipping.", "Appetizer");

        ArrayList<MenuItem> wholeMenu = new ArrayList<MenuItem>();
        wholeMenu.add(hamburger);
        wholeMenu.add(grilledChicken);
        wholeMenu.add(chocoCake);
        wholeMenu.add(applePie);
        wholeMenu.add(spinachDip);
        wholeMenu.add(pretzelBites);

        public static void printWholeMenu() {
            for(int i = 0; i < wholeMenu.size(); i++){
                System.out.println(wholeMenu.get(i));
                System.out.println("\n");
            }
        }

        //System.out.println(MenuItem.hamburger);
//        System.out.println("\n");
//
//        System.out.println(grilledChicken);
//        System.out.println("\n");

//        MenuItem chocoCake = new MenuItem("Chocolate cake", 7, "Layers of melted, delicious chocolate cake and ganache served with vanilla ice cream.", "Dessert");
//        System.out.println(chocoCake);
//        System.out.println("\n");

//        MenuItem applePie = new MenuItem("Apple pie", 5, "Cinnamon and apples baked into a crispy crust, served with cinnamon vanilla ice cream.", "Dessert");
//        System.out.println(applePie);
//        System.out.println("\n");

//        MenuItem spinachDip = new MenuItem("Spinach dip", 4, "Creamy, cheesy dip with chunks of artichoke and spinach, served with chips and baguette for dipping.", "Appetizer");
//        System.out.println(spinachDip);
//        System.out.println("\n");

//        MenuItem pretzelBites = new MenuItem("Pretzel bites", 3, "Tender pretzel bites with flaky sea salt, served with melted cheese and mustard for dipping.", "Appetizer");
//        System.out.println(pretzelBites);







    }



}
