import java.util.*;
public class Deck {


    public static int number = 8;
    int x = 0;
    int i = 0;
    
    Card card;

    public Deck()    {
    }
    //   Card[] cards = {"", "", "", "", "", "", "", ""}; 
    Card[] cards = new Card[8];

    String[] theFrontSide = {"[Card 1]","[Card 2]", "[Card 3]", "[Card 4]", "[Card 5]",
            "[Card 6]", "[Card 7]", "[Card 8]" };

    String[] theBackSide = {"[Dog]", "[Dog]", "[Bird]", "[Snake]", "[Snake]", 
            "[Bird]", "[Raccoon]", "[Raccoon]" };


    public void createCards() {

        for(i = 0; i < cards.length; i++) {
            card = new Card(theFrontSide[i], theBackSide[i]);
            cards[i] = card;

        }

    }

    // Observera skilnaden mellan showCards och showCard
    public String showCards(){
        String showedCard = "";
        for (int i = 0; i < cards.length; i++) {
            
            showedCard += (cards[i].toString() );
       
            
          //  return showedCard;
        }
        return showedCard.toString();
      //  return cards[i].toString();
        //return cards.toString();
       // return Arrays.toString(cards);
       
    }
    
    
    // Observera skilnaden mellan showCardS och showCard
    public String showCard(int cardNumber) {

        //return cards[cardNumber].showCard(true);
        // cards[cardNumber].toString().setCardSide();

        return cards[cardNumber].toString();

    }

    public void flipCard(int i) {
        if (cards[i].showingBackside == true){
            cards[i].showingBackside = false;
        }   else {
            cards[i].showingBackside = true;
        }

    }
    
        public void removeCard(int i) {
        cards[i].frontside = "      ";
        cards[i].backside = "      ";
    }


    public void shuffleArray() {
        //  String[] copy_of_backside = new String(theBackSide);
        // OBS:::!!! Kopia av theBackSide bör göras

        //   Fisher-yates shuffle
        Random random = new Random();
        for (int i = theBackSide.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Simple swap
            String a = theBackSide[index];
            theBackSide[index] = theBackSide[i];
            theBackSide[i] = a;
        }

    }

}
