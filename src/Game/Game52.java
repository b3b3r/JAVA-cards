package Game;

import java.util.ArrayList;

import Card.Card52;
import Enum.Figure;
import Enum.Suit;

public final class Game52 {
  private final static Game52 instance = new Game52();
  public final static Game52 getInstance() { return instance; }
  private ArrayList<Card52> cards;
  
  private Game52(){
    this.cards = generateGame();
  }

  private ArrayList<Card52> generateGame(){
    ArrayList<Card52> cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Figure figure : Figure.values()) {
        Card52 card = new Card52(figure, suit);
        cards.add(card);
      } 
    }
    return cards;
  }
  
  public ArrayList<Card52> getCards() {
    return this.cards;
  }

  public Card52 getCard(int index){
    return this.cards.get(index);
  }

  public int getSize(){
    return this.cards.size();
  }
}
