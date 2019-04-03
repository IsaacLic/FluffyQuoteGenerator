//Isaac Lichter
package yogigenerator;

import java.util.Scanner;

public class YogiGenerator {

    public static void main(String[] args) {
        YogiGenerator generator = new YogiGenerator();
        Scanner input = new Scanner(System.in);
        System.out.println("Type 'q' to see a quote. ");

        while (true) {
            input.next();
            generator.generate();
        }
    }

    String[] str1 = {"The world", "Your soul", "Every smile", "The real teacher",
        "The greatest education man has to learn", "Learning to let go",
        "Trusting the world", "The one who travels into oneself",
        "The body", "The song of love", "The spirit", "The true doer",
        "The voice of your soul", "Every day", "Intuition", "Your heart"};

    String[] str2 = {" is", " is", " is", " is", " is", " is", " is", " gives", " teaches", " beholds", " echoes"};

    String[] str5 = {" yourself", " breath", " a temple", " love", " everything",
        " the whole world", " the science of self", " universality"};

    String[] str3 = {" everlasting", " love", " love", " happiness", " inspiration", " kindness",
        " hope", " truth", " thought", " compassion", " caring", " forgiveness", " joy", " greatness",
        " friendship", (" the ultimate law of" + str5[(int) (Math.random() * 8)])};
    
    String str4 = " and";

    private void generate() {
        String quote = this.generateSentence();
        if ((int) (Math.random() * 3) < 2) {
            quote += ". " + this.generateSentence() + ".";
        } else {
            quote += str4;

            String addition = str5[(int) (Math.random() * 8)] + ".";
            quote += addition;
        }
        System.out.println(quote);
    }

    private String generateSentence() {
        String quote = str1[(int) (Math.random() * 16)];
        quote += str2[(int) (Math.random() * 11)];
        quote += str3[(int) (Math.random() * 16)];
        return quote;
    }
}
