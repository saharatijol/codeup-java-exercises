public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(1, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            if ((bigCount * 5 > goal && smallCount == 0) || (bigCount * 5 < goal) && (smallCount == 0)) {
                return false;
            }

            int totalCount = (5 * bigCount) + smallCount;
            if ((totalCount >= goal) && (smallCount >= (goal % 5))) {
                return true;
            } else {
                return false;
            }
        }
    }
}
