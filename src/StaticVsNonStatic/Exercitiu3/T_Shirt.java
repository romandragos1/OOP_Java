package StaticVsNonStatic.Exercitiu3;

public class T_Shirt {

    String color;
    String size;

    static String brand="Converse";

    public T_Shirt(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public static void changeBrandName (String newBrandName){
        brand = newBrandName;
    }

    @Override
    public String toString() {
        return "T_Shirt{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", brand=" + brand +
                '}';
    }
}
