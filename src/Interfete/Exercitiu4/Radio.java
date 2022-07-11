package Interfete.Exercitiu4;

public class Radio implements Startable, Stopable, Changeable {

    String currentPost;

    public Radio(String currentPost) {
        this.currentPost = currentPost;
    }

    @Override
    public void changePost(String newPost) {
        System.out.println("Am schimbat postul radio pe " + newPost);
        currentPost = newPost;
    }

    @Override
    public void start() {
        System.out.println("Am pornit radio-ul");
    }

    @Override
    public void stop() {
        System.out.println("Am oprit radio-ul");
    }
}
