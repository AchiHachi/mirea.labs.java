package task2.mirea;

public class Human {
    public static void main(String[] args) {
        Hand hands = new Hand(true);
        Leg legs = new Leg(43);
        Head head = new Head("Blonde");

        System.out.println("Hands");
        System.out.println("Tattoo on hands: " + hands.getTattoo() + "\nFingers: " + hands.getFingers());

        System.out.println("Legs");
        System.out.println("Foot size: " + legs.getSize());

        System.out.println("Head");
        System.out.println("Hair color: " + head.getHair());

        System.out.println("\nToo thousand years later...\n");

        //----------------------------//
        hands.setFingers(56);
        hands.setTattoo(false);
        legs.setSize(45);
        head.setHair("Brunette");
        //----------------------------//

        System.out.println("Hands");
        System.out.println("Tattoo on hands: " + hands.getTattoo() + "\nFingers: " + hands.getFingers());

        System.out.println("Legs");
        System.out.println("Foot size: " + legs.getSize());

        System.out.println("Head");
        System.out.println("Hair color: " + head.getHair());
    }
}
