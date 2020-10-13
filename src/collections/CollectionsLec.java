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
        
        // With a class, custom data type
        HashMap<String, Post> postsMap = new HashMap<>();
        
        
        usernames.put("fmendozaro", "Fernando M R");
        usernames.putIfAbsent("fmendozaro", "Fernando Mendoza R");
        usernames.put("zgulde", "Zach Gulde");
        usernames.put("zguldes", "Zach Gulde");
        
        // Custom data type (Class)
        postsMap.putIfAbsent("20201013-546598754", new Post("Titles 1"));
        postsMap.putIfAbsent("20201013-546598755", new Post("Titles 2"));
        postsMap.putIfAbsent("20201013-546598756", new Post("Titles 3"));
        postsMap.putIfAbsent("20201013-546598757", new Post("Titles 4"));

        System.out.println("(usernames.get(\"fmendozaro\") = " + usernames.get("fmendozaro"));
        System.out.println("(usernames.get(\"ryanorsinger\") = " + usernames.get("ryanorsinger")); // -> null
        System.out.println("(usernames.getOrDefault(\"ryanorsinger\") = " + usernames.getOrDefault("ryanorsinger", "N/A"));

        // Trying to find a Key
        if(usernames.containsKey("ryanorsinger")) {
            System.out.println("usernames.get(\"ryanorsinger\") = " + usernames.get("ryanorsinger"));
            System.out.println("Login into the system");
        } else {
            System.out.println("User not found");
            System.out.println("Roll back transaction");
            System.out.println("Ask again");
        }
        
        
        System.out.println("usernames.containsValue(\"Fernando M R\") = " + usernames.containsValue("Fernando M R"));
        System.out.println("usernames.containsValue(\"Fernando M Rs\") = " + usernames.containsValue("Fernando M Rs"));

        //postsMap.clear();

//        System.out.println("postsMap.remove(\"20201013-546598755\") = " + postsMap.remove("20201013-546598755")); // This works

//        System.out.println("postsMap.remove(\"20201013-546598759\") = " + postsMap.remove("20201013-546598759")); // This returns null

        // Using replace method is more intentional
        System.out.println("postsMap.replace(\"20201013-546598756\", new Post(\"New World\")) = " + postsMap.replace("20201013-546598756", new Post("New World")));

        // Looping through Custom data type for hash map
        System.out.println("Hashmap keySet");
        for (String key : postsMap.keySet()) {
            System.out.println("key = " + key);
            postsMap.get(key).printTitleAndAuthor(); // print titles
        }

        System.out.println("Hashmap values");
        for (Post post: postsMap.values()) {
            post.printTitleAndAuthor();
        }
        
    }

//    public static ArrayList<Post> myOwnAdd(String title, ArrayList<String> authors) {
//        ArrayList<Post> posts = new ArrayList<>();
//        posts.add(new Post(title, authors));
//        return posts;
//
//    }
}
