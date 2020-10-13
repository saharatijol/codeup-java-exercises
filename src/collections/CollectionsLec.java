package collections;

import oopLecture.Post;

import java.util.ArrayList;

public class CollectionsLec {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Using Array list with Classes
        ArrayList<Post> posts = new ArrayList<>();

        System.out.println(names.size());
        names.add("Sahara");
        System.out.println(names.size());

        names.add("Daniel");
        names.add("Kenneth");

        // Adding items in array using classes
        posts.add(new Post("Stevie's weekend", "Sara"));
        posts.add(new Post("Jerry's weekend", "Bill"));
        posts.add(new Post("Jimi's weekend", "Yvette"));

        // To access indices within an Array List, you will need to use methods for that
        System.out.println("names.get(0) = " + names.get(0));
        //System.out.println("names.get(1) = " + names.get(1)); // there is space but there is no value occupying that space =>> Index out of bounds error
        System.out.println("names.indexOf(\"Kenneth\") = " + names.indexOf("Kenneth")); // -> will return an integer

        if (names.contains("Sahara")) {
            System.out.println("names.get(2) = " + names.get(2).toUpperCase());
        }

        // Using remove method
        Post deletedPost = posts.remove(1); // -> store to variable to create a backup
        deletedPost.printTitleAndAuthor();
        System.out.println("posts.lastIndexOf(deletedPost) = " + posts.lastIndexOf(deletedPost));

        // Print Post example
        if(!posts.isEmpty()) {
            for(Post post : posts) {
                post.printTitleAndAuthor();
            }
        }
    }

//    public static ArrayList<Post> myOwnAdd(String title, ArrayList<String> authors) {
//        ArrayList<Post> posts = new ArrayList<>();
//        posts.add(new Post(title, authors));
//        return posts;
//
//    }
}
