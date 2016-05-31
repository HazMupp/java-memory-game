public class Card
{
    String frontside;       // Med frontside menas den sidan av koritet där ingen relevant info finns
    String backside;        // Med backside menas där infon man ska komma ihåg finns
    boolean showingBackside;    // Visas sidan med infon man ska komma ihåg?
    
    public Card(String theFront, String theBack){
        frontside = theFront;
        backside = theBack;
        showingBackside = false;
        
    }
    
    public String showCard() {
        if (showingBackside == true) {
            return this.backside.toString();
        }   else {
            return this.frontside.toString();
        }
        
    }
    

    
    public void setCardSide() {
        if (showingBackside == true){
            showingBackside = false;
        }   else {
            showingBackside = true;
        }
    
    }
    
    
    public String toString(){
        //this.setCardSide();
        return this.showCard();
        //return this.frontside.toString(); // + " " + this.backside.toString();
    }
    
    

      
    
  
    
}
