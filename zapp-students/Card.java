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
    private ArrayList<Card> cardlist;

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
    public int cardId(){
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
    public void convertPoints(int p){
        if(p < 3) {
            System.out.println("Not enough points to convert (" + p + ")");
        } else if (p % 3 == 0){
            System.out.println("Credits Before Convert: " + credits);
            credits = credits + (p / 3);
            System.out.println("Enough points to convert (" + p + ")");
            System.out.println("Credits After Convert: " + credits);
        } else {
            System.out.println("Points:" + p);
            points = p % 3; //1
            System.out.println("Remainder: " + p % 3 + "(" + p + " - " + (p % 3) + ")");
            points = p - points;
            credits = credits + (points / 3);
        }
    }
    
    public void addCard(Card c)
    {
        cardlist.add(c);
    }

    
    //@Override
    public String toString() {
        return
               "cardId=" + cardId +
               ", guestName='" + guestName + '\'' +
               ", luxuryRating=" + luxuryRating +
               ", credits=" + credits +
               ", points=" + points + "/n";
    }
    public void print(){
        System.out.println("Card Id: " + cardId());
    }
    
    public void list(){
        for(Card c: cardlist){
            c.print();
            System.out.println();
        }
    }
}

