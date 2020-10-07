import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String [] adjectives =
                {"deliquent", "charming", "medicated",
                        "violent", "bearded", "insane",
                        "drunken", "deep", "wild", "magical"};

        String [] nouns =
                {"dragon", "programmer", "thinker",
                        "pistol", "fairy", "schmuck",
                        "villain", "hero", "monkey", "player"};

        System.out.printf("Here is your server name: \n%s-%s", randomizer(adjectives), randomizer(nouns));

//        ==== Test ====
//        int [] randomNumbers = {1, 2, 3, 4, 5, 6, 7};
//        getRandom(randomNumbers);

    }

    public static String randomizer(String[] words) {
        Random r = new Random();
        int randomNumber = r.nextInt(words.length);
        return words[randomNumber];
    }

//    public static int getRandom(int[] array) {
//        int rnd = new Random().nextInt(array.length);
//        System.out.println(array[rnd]);
//        return array[rnd];
//    }
}
