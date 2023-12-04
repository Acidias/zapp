import java.util.*;
/**
 * A Area is part of a ZAPP resort.Each area has a name,  a luxury rating
 * and a capacity which represents the maximum number of people(cards) who can be on the  
 * area at any one time. Each area must maintain a list of all people (cards)
 * currently on the area. These lists are updated whenever cards enter or leave 
 * an area,so that it is always possible to say how many people (cards) are in the area 
 * and who they are.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Area 
{
  private int referenceNumber;
  private String areaName;
  private int rating;
  private int capacity;
  
  public Area (int referenceNumber, String areaName, int rating, int capacity){
      this.referenceNumber = referenceNumber;
      this.areaName = areaName;
      this.rating = rating;
      this.capacity = capacity;
  }
}
