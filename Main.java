import java.util.*;
public class Main
{
    public static void main(String[] args) {

        String input;
        String inputX;
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        deck.createCards();

        // Card card = new Card("[Front side]", "[Info backside]");

        MemoryPlayer player1 = new MemoryPlayer();
        player1.setName();

        System.out.println("Hello " + player1.getName());

        // System.out.println("" + deck.cards[1]);

        /*System.out.println("Which side of the card do you wanna see?");
        System.out.println("Front/back");
        input = scanner.nextLine() ;
        inputX = input.toUpperCase();
        if (inputX.equals("FRONT")){
        card.showingBackside = false;
        }
        else if(inputX.equals("BACK")){
        card.showingBackside = true;
        }

        System.out.println(card.showCard()); */

        /* System.out.println("Wanna show cards?");
        input = scanner.nextLine() ;
        inputX = "";
        inputX = input.toUpperCase();   */

        // if(inputX.equals("YES")) {
        deck.shuffleArray();
        deck.createCards();
        boolean gameCompleted = false;
        int cardNumber;
        int cardCount = 0;
        int cardNumber2 = 0;
        int cardNumber3 = 0;
        int numberOfPairs = 0;
       // int playerPoints = 0;         // Denna är flyttad till klassen MemoryPlayer

        while(gameCompleted == false) {

            System.out.println(deck.showCards());

            System.out.println("Vilket kort vill du vända på, "+  player1.getName() + "? (#)");
            input = scanner.nextLine();
            if (input.equals("")){
                 input = "0";
            }
            
            cardNumber = Integer.parseInt(input) - 1;
            
            if (cardNumber >= 8){
                cardNumber = 0;
            }

            // Integer.parseInt(input);

            if(cardNumber < 0 || cardNumber > 8 ){
                System.out.println("Du kan bara välja mellan talen 1 och 8");

            } else  {
                //deck.cards[cardNumber].
                deck.flipCard(cardNumber);
                cardCount++;
                //System.out.println("" + deck.showCard(cardNumber));   
            }

            if(cardCount == 2){

                // Kolla om korten som visas har samma baksida
                System.out.println(deck.showCards());

                if (deck.showCard(cardNumber).equals(deck.showCard(cardNumber2))){                    
                    deck.removeCard(cardNumber);
                    deck.removeCard(cardNumber2);
                    numberOfPairs++;
                   player1.addPoint();
                    System.out.println("Bra jobbat " + player1.getName() + "!");
                    System.out.println("Du har " + player1.getPoints() + " poäng.");
                    
                }

                deck.flipCard(cardNumber);
                deck.flipCard(cardNumber2);
                
                cardNumber = 0;
                cardNumber2 = 0;
                cardCount = 0;
                
                input = scanner.nextLine();
                
            }

            cardNumber2 = cardNumber;
            if (numberOfPairs == 4){
                gameCompleted = true;
            }
            
             for(int i = 0; i < 150; i++) {
                System.out.println("");
            }

        }
        

        
        System.out.println(deck.showCards());

        System.out.println("The end! Your points: " + player1.getPoints());
    }

}
