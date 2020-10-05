package oopLecture;
import java.util.Date;

public class Post {
    // Always ask yourself: Will it be static or instance?

    // blog views
    public static int blogViews;

    // name of blog
    public static String nameOfBlog = "Justin's Blog";

    // title
    public String title;

    // author
    public String authorName;

    // datePosted
    public Date datePosted;

    // content
    public String content;

    // dateEdited
    public Date dateEdited;

    // display title and authorName
    public void printTitleAndAuthor() {
        System.out.println("The title: " + this.title);
        System.out.println("The author is: " + this.authorName);
    }

    // method to return the longer title of two blog posts...
    public static String returnLongerPostTitle(Post p1, Post p2) {
        if (p1.title.length() > p2.title.length()) {
            return p1.title;
        } else {
            return p2.title;
        }
    }

    public static void main(String[] args) {
        Post p = new Post();
        p.title = "A Day in the Life";
        p.content = "I am what I am";
        p.datePosted = new Date();
        p.dateEdited = new Date();
        p.authorName = "Max Smith";

        p.printTitleAndAuthor();
    }
}
