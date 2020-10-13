package collections;

import oopLecture.Post;

import java.util.ArrayList;
import java.util.HashMap;

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

        // Hash Map Example Call
        hashMapsPractice();

    }

    public static void hashMapsPractice(){
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("fmendozaro", "Fernando M R");
        usernames.putIfAbsent("fmendozaro", "Fernando Mendoza R");
        usernames.put("zgulde", "Zach Gulde");
        usernames.put("zguldes", "Zach Gulde");

        System.out.println("(usernames.get(\"fmendozaro\") = " + usernames.get("fmendozaro"));
        System.out.println("(usernames.get(\"ryanorsinger\") = " + usernames.get("ryanorsinger")); // -> null
        System.out.println("(usernames.getOrDefault(\"ryanorsinger\") = " + usernames.getOrDefault("ryanorsinger", "N/A"));
    }

//    public static ArrayList<Post> myOwnAdd(String title, ArrayList<String> authors) {
//        ArrayList<Post> posts = new ArrayList<>();
//        posts.add(new Post(title, authors));
//        return posts;
//
//    }
}
