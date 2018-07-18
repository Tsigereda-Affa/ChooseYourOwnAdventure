import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A. Kitchen
        //C.Open refrigerator
        //E.Drink strange milk
        //F.Eat leftovers
        //D.Open cabinet
        //G.Eat can of beans
        //H.Take a plate
        //B. Upstairs
        //I.Bedroom
        //K.Lay on bed
        //L.Open the drawer
        //J.Bathroom
        //M.Look in mirror
        //N.Use the toilet
        Scanner sca = new Scanner(System.in);
        String userInput;
        System.out.println("You are in a Tsigereda house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?");
        userInput = sca.nextLine();
        if (userInput.contains("Kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere.");
            userInput = sca.nextLine();
            if (userInput.contains("Open refrigerator")) {
                System.out.println("You may open the refrigerator");
                System.out.println("do want to eat or drink");
                userInput = sca.nextLine();
                if (userInput.contains("Drink strange milk")){
                    System.out.println("You are drinking a strange milk");
                }
            }else if (userInput.contains("Eat leftovers"))
                System.out.println("Eat leftovers");
            }else if (userInput.contains("cabinat")) {
                System.out.println("do want to eat or take a plate");
                       userInput = sca.nextLine();

                       if(userInput.contains("Eat can of beans")) {
                           System.out.println("eat beans");
                       }else if (userInput.contains("Take a plate"))
                           System.out.println("Take a plate");
//                System.out.println("you can drink milk");
//            } else if{
//                System.out.println("Eat leftovers");
////            if (userInput.contains("Open refrigerator")) {
////                System.out.println("You may open the \"refrigerator\"");
////                userInput = sca.nextLine();
////                if (userInput.contains("Drink strange milk"))
////                    System.out.println("Drink strange milk");
////                if (userInput.contains("Eat leftovers"))
////                    System.out.println("Eat leftovers");
   } else if (userInput.contains("Upstairs")) {

              System.out.println("Upstairs you see a hallway.");
            System.out.println("would you like to use the bedroom or the bathroom?");
            userInput = sca.nextLine();
            if (userInput.contains("Bedroom")) {
                System.out.println("would like to lay on the bed or open the drawer?");
               // System.out.println("you are in the bed room");
                userInput = sca.nextLine();
                if (userInput.contains("Lay on the bed")){

                    System.out.println("Lay on the bed");
                }
            }else if (userInput.contains("Open the drawer"))
                System.out.println("----Open the drawer----");
        } if (userInput.contains("Bathroom")) {
            System.out.println("do want to look in to the mirror or use the toilet");
            userInput = sca.nextLine();
            if(userInput.contains("Look in mirror")) {
                System.out.println("you look pretty");
            }else if (userInput.contains("Use the toilet"))
            //System.out.println("Use the toilet");
            System.out.println("take your time");

        }
    }

}