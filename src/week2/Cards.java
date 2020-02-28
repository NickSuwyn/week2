package week2;

public class Cards {
	
	public static void main(String[] args) {
		
		System.out.println("My Name is Nick".substring(3, 6));
		
		for (int suit = 0; suit < 4; suit++) {
			for (int value = 2; value < 15; value++) {
				String card = "";
				
				switch (value) {
					case 11:
						card += "Jack";
						break;
					case 12:
						card += "Queen";
						break;
					case 13:
						card += "King";
						break;
					case 14:
						card += "Ace";
						break;
					default:
						card += value;
				}
				
				card += " of ";
				
				switch (suit) {
					case 0:
						card += "Hearts";
						break;
					case 1:
						card += "Spades";
						break;
					case 2:
						card += "Clubs";
						break;
					case 3:
						card += "Diamonds";
				}
				System.out.println(card);
			}
		}
		
	}

}
