public class LoopsIntro {
    public static void main(String[] args) {
        int count;
        for(count = 0; count != 6; ++count) {
            System.out.println("While Loop >> Count value is " + count);
        }

        for(count = 1; count != 6; ++count) {
            System.out.println("For-Loop >> Count value is " + count);
        }

        for(count = 1; count != 6; ++count) {
            System.out.println("While(true) >> Count value is " + count);
        }

        count = 1;

        do {
            System.out.println("Do-While >> Count value was " + count);
            ++count;
        } while(count != 6);

        System.out.println("===============================");
        count = 6;

        do {
            System.out.println("Do-While2 >> Count value was " + count);
            ++count;
        } while(count <= 100 && count != 6);

        int number = 4;
        int finishNumber = 20;
        int evenCounter = 0;

        while(number <= finishNumber) {
            ++number;
            if (isEvenNumber(number)) {
                System.out.println("Even number " + number);
                ++evenCounter;
                if (evenCounter >= 5) {
                    break;
                }
            }
        }

        System.out.println("Even numbers found: " + evenCounter);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
