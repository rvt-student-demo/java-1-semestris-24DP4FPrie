package rvt.CardPayments;

public class MainProgram {
    public static void main(String[] args) {

        // --- Test PaymentCard ---
        System.out.println("=== Testing PaymentCard ===");
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());


        // --- Test PaymentTerminal ---
        System.out.println("\n=== Testing PaymentTerminal ===");
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change: " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change: " + change);

        System.out.println(unicafeExactum);
    }
}
