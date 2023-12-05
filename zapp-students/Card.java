import java.util.*;
   
/**
 * A Card has an id number, name, a luxury rating, number of credits and points.
 * 
 * @Kitti Pinter
 * @1.0 (2023)
 */
public class Card 
{
    // fields,attributes
    private int cardId;
    private String guestName;
    private int luxuryRating;
    private int credits;
    private int points;
    private List<Card> cardlist;

    //contributor
    public Card(int cardId, String guestName, int luxuryRating, int credits)
    {
        this.points = 0;
        this.cardId = cardId;
        this.guestName = guestName;
        this.luxuryRating = luxuryRating;
        this.credits = credits;
    }
    
    //mutator, assessor
    public int getcardId(){
        return cardId;
    }
    public int getluxuryRating(){
        //float number ???????
        if (luxuryRating < 1 || luxuryRating > 10){
            System.out.println("Invalid Rating");
            //return ??????
        }
            //System.out.println( luxuryRating + "Added to card");
            return luxuryRating;
    }
    public int getCredits(){
        return credits;
    }
    public int reduceCredits(int p){
        return credits;
    }
    public void convertPoints(){
        System.out.println("convertPoints called with " + points + " points");
        //points += p;
        if (points < 3) {
            System.out.println("Not enough points to convert (" + points + ")");
        } else if (points % 3 == 0) {
            System.out.println("Credits Before Convert: " + credits);
            credits = credits + (points / 3);
            System.out.println("Enough points to convert (" + points + ")");
            System.out.println("Credits After Convert: " + credits);
        } else {
            int remainder = points % 3;
            System.out.println("Remainder: " + remainder);
            System.out.println("Credits Before Convert: " + credits);
            int converted = points / 3;
            System.out.println("Added " + converted + " credits");
            credits = credits + converted;
            System.out.println("Credits After Convert: " + credits); 
            points = remainder;
            System.out.println("Points After contvert: " + points + "\n");
        }
    }
    /*public void convertPoints(int p){
        System.out.println("convertPoints called with " + p + " points");
        p = points + p;
        if (p < 3) {
            System.out.println("Not enough points to convert (" + p + ")");
            points += p;
            System.out.println(p + " added to points. New points (" + points +")");
        } else if (p % 3 == 0) {
            System.out.println("Credits Before Convert: " + credits);
            credits = credits + (p / 3);
            System.out.println("Enough points to convert (" + p + ")");
            System.out.println("Credits After Convert: " + credits);
        } else {
            int remainder = p % 3;
            points = p - remainder;
            System.out.println("Remainder: " + remainder + "(" + p + " - " + points + ")");
            int converted = points / 3;
            System.out.println("Credits Before Convert: " + credits);
            System.out.println("Added " + converted + " credits");
            credits = credits + converted;
            System.out.println("Credits After Convert: " + credits);
            points = remainder;
            System.out.println("Points After contvert: " + points);
        }
    }*/
    
    public void addCard(Card c)
    {
        cardlist.add(c);
    }
    public int addPoints(int points){
        this.points += points;
        return points;
    }
    //@Override
    public String toString() {
        return "Card Id: " + getcardId() +
                           "\nGuest Name: " + guestName +
                           "\nLuxury Rating: " + getluxuryRating() + 
                           "\nPoints: " + points + "\n";
    }
    
    public void print(){
        System.out.println("Card Id: " + getcardId() +
                           "\nGuest Name: " + guestName +
                           "\nLuxury Rating: " + getluxuryRating() + 
                           "\nPoints: " + points + "\n");
    }
    
    /*public void list(){
        for (Card card : cardlist) {
            card.print();
        }
    }*/
}

