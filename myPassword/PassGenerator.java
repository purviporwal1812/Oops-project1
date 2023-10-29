package myPassword;

public class PassGenerator {

    public char randomCharacter() {
        int rand = (int) (Math.random() * 62);
        if (rand <= 9) {
            int ascii = rand + 48;
            return (char) (ascii);
        } else if (rand <= 35) {
            int ascii = rand + 55;
            return (char) (ascii);
        } else {
            int ascii = rand + 61;
            return (char) (ascii);
        }
    }

    public String generator() {
        String randomPassword = "";
        for (int i = 0; i < 8; i++) {
            randomPassword = randomPassword + randomCharacter();
        }
        return randomPassword;
    }

}
