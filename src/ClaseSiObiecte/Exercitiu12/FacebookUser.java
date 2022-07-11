package ClaseSiObiecte.Exercitiu12;

import java.util.ArrayList;

public class FacebookUser {

    String firstName;
    String lastName;
    int birthYear;
    ArrayList<String> posts;

    public FacebookUser(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        posts = new ArrayList<>();
    }

    public void writePost(String postContent) {
        posts.add(postContent);
    }

    public void printAllPosts() {
        for (int i = 0; i < posts.size(); i++) {
            System.out.println(posts.get(i));
        }
    }
}
