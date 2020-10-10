import java.util.Random;

public class ServerNameGenerator {
    public static String [] adjectives =
                    {"deliquent",
                    "charming",
                    "medicated",
                    "violent",
                    "bearded",
                    "insane",
                    "drunken",
                    "deep",
                    "wild",
                    "magical"};

    public static String [] nouns =
                    {"dragon",
                    "programmer",
                    "thinker",
                    "pistol",
                    "fairy",
                    "schmuck",
                    "villain",
                    "hero",
                    "monkey",
                    "player"};


    public static void main(String[] args) {

        System.out.printf("Here is your server name: \n%s-%s", randomizer(adjectives), randomizer(nouns));

    }

    public static String randomizer(String[] words) {
        Random r = new Random();
        int randomNumber = r.nextInt(words.length);
        return words[randomNumber];
    }
}
