public class Question3_24
{
  public static void main(String[] args)
  {
    byte rank, suit;
    String rankString = "", suitString = "";

    rank = (byte)(Math.random() * 13 + 1);

    /*
    Math.random() generates 0 <= number < 1
    Math.random() * 12 + 1 generates
    0 + 1 <= number < 13 + 1
    => 1 <= number < 14
    explicitly type casted to floor integers
    */

    suit = (byte)(Math.random() * 4 + 1);

    switch(rank)
    {
      case 1: rankString = "Ace";
      break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10: rankString = rankString + rank;
      /* could have used an if-else construct with two booleans fused with an && for shorter code, but I used a fallthrough because I felt like it */
      break;
      case 11: rankString = "Jack";
      break;
      case 12: rankString = "Queen";
      break;
      case 13: rankString = "King";
      break;
    }

    switch(suit)
    {
      case 1: suitString = "Clubs";
      break;
      case 2: suitString = "Diamonds";
      break;
      case 3: suitString = "Hearts";
      break;
      case 4: suitString = "Spades";
      break;
    }

    System.out.println("The card you picked is the " + rankString + " of " + suitString);
  }
}
