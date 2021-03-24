package Bridge;

public class Card implements Comparable<Card>{
	private int rank;
	private int suit;
	
	public Card(int r,int s) {
		this.rank=r;
		this.suit=s;
	}
	
	public int getRank() {
		return rank;
	}
	public int getSuit() {
		return suit;
	}
	public String getRankAsString() {
		if(rank==11) return "Jack";
		else if(rank==12) return "Queen";
		else if(rank==13) return "King";
		else return ""+rank;
	}
	public String getSuitAsString() {
		if(suit==0) return "Clubs";
		else if(suit==1) return "Diamonds";
		else if(suit==2) return "Heats";
		else return "Spades";
	}
	public String toString() {
		return this.getRankAsString()+" of "+this.getSuitAsString();
	}
	
	public int compareTo(Card other) {
		if(this.rank==other.rank)
			return this.suit-other.suit;
		else
			return this.rank-other.rank;
	}

}
