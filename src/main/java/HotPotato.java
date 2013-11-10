import Potato;
import java.util.Random;

public class HotPotato extends Potato {

    public HotPotato() {
        System.out.println("[HotPotato]has started! Out that burns, throw it!");
    }

    public static void main(String[] args) {
        HotPotato HotPotato = new HotPotato();
        while(true) {
            Person person = new Person();
            if(new Random().nextInt(10) == 5) {
                person.throwFar();
            } else {
                person.chuck();
            } 
        }
    }

    public boolean isHot() {
        return true; //of course it's hot, it's a hot potato you idiot!
    }

    private static class Person {
        private int catch() {
            int r = new Random().nextInt(1000);
            System.out.println("Person #" + r + " has caught the potato! OW! It's hot, get ready to catch it!");
            return r;
        }

        public void chuck() {
            int r = catch();
            if(r == 69) {
                System.out.println("Person #" + r + " bombed! He has failed to catch the potato. Play again!");
                System.exit(0);
            }
            System.out.println("Person #" + r + " has chucked the potato! Catch it quick!");
        }

        public void chuckFar() {
            int r = catch();
            if(r == 69) {
                System.out.println("Person #" + r + " bombed! He has failed to catch the potato. Play again!");
                System.exit(0);
            }
            System.out.println("Person #" + r + " caught the potato! He's throwing it far!");
        }
    }
}
