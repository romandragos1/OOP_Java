package StaticVsNonStatic.Exercitiu8;

public class ChromeTab {

    static String history = "";
    String currentSiteName;

    public void changeCurrentSite(String newSite) {
        System.out.println("Am schimbat site-ul");
        currentSiteName = newSite;
        history += " " + newSite + " ";
    }
}
