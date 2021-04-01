package Game;

import java.util.ArrayList;

import Interface.ICard;

public class Game<T extends ICard> {
  private ArrayList<T> cards;
  
  public Game(){
    this.cards =  new ArrayList<>();
  }

  public void addCard(T card){
    this.cards.add(card);
  }

  public T get(int i) {
    return this.cards.get(i);
  }

  public ArrayList<String> getCards() {
    ArrayList<String> cards = new ArrayList<>();
    for (T card : this.cards) {
      cards.add(card.getCard());
    }
    return cards;
  }

  public int getSize(){
    return this.cards.size();
  }
}
