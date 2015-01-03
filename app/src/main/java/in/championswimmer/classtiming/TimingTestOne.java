package in.championswimmer.classtiming;

/**
 * Created by championswimmer on 3/1/15.
 */
public class TimingTestOne {

    int someFunction1 ( int one ) {
        int two = 2 * one;
        return two;
    }
    int someFunction2 ( int one ) {
        int two = 2 * one;
        return two;
    }
    int someFunction3 ( int one ) {
        int two = 2 * one;
        return two;
    }
    int someFunction4 ( int one ) {
        int two = 2 * one;
        return two;
    }
    int someFunction5 ( int one ) {
        int two = 2 * one;
        return two;
    }
    int someFunction6 ( int one ) {
        int two = 2 * one;
        return two;
    }
    String someFunction1 ( String one ) {
        String two = 2 + one;
        return two;
    }
    String someFunction2 ( String one ) {
        String two = 2 + one;
        return two;
    }
    String someFunction3 ( String one ) {
        String two = 2 + one;
        return two;
    }
    String someFunction4 ( String one ) {
        String two = 2 + one;
        return two;
    }
    String someFunction5 ( String one ) {
        String two = 2 + one;
        return two;
    }
    String someFunction6 ( String one ) {
        String two = 2 + one;
        return two;
    }
    public static void doDisplay(String[] args) {
        display();
    }

    static void display() {
        System.out.println("Java is my favorite programming language.");
    }
    public static void showRanks(String[] args) {
        methodRankPoints(255.7);
    }

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        }
        else if (points >= 122.4) {
            System.out.println("Rank:A2");
        }
        else {
            System.out.println("Rank:A3");
        }
    }
}
