import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class MenuItem {

    private String name;
    private float price;
    private String description;
    private String category;
    private Boolean isNew;

    public static LocalDateTime lastUpdate;
    public DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy HH:mm:ss");
    public LocalDateTime now = LocalDateTime.now();

    public MenuItem(String name, float price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.lastUpdate = now;
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

    public static void setLastUpdate(LocalDateTime lastUpdate) {
        MenuItem.lastUpdate = lastUpdate;
    }

    public String getIsNew() {
        String x = "";
        if (isNew) {
            x = this.name + " is a new item!";
        } else {
            x = this.name + " is NOT a new item!";
        }
        return x;
    }

    public static String getLastUpdate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = lastUpdate;

        return dtf.format(now);
    }

    public String toString () {
        return this.name + " (" + this.category + "): " + this.description + " " + "$" + this.price + " " + getIsNew();
    }
}