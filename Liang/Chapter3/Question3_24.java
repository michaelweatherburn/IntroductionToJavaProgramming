public class Question3_24 {
	public static void main(String[] args) {
		int positionInDeck = (int) (Math.random() * 52);
		int suit = positionInDeck / 13;
		int rank = positionInDeck % 13;

		String suitString = null, rankString = null;
		switch (suit) {
		case 0:
			suitString = "Clubs";
			break;
		case 1:
			suitString = "Diamonds";
			break;
		case 2:
			suitString = "Hearts";
			break;
		case 3:
			suitString = "Spades";
			break;
		}

		switch (rank) {
		case 0:
			rankString = "Ace";
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			rankString = "" + (rank + 1);
			break;
		case 10:
			rankString = "Jack";
			break;
		case 11:
			rankString = "Queen";
			break;
		case 12:
			rankString = "King";
			break;
		}

		System.out.println("The card you picked is " + rankString + " of " + suitString);
	}
}