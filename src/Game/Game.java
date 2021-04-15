package Game;

import java.util.ArrayList;

import Interface.ICard;

public abstract class Game<T extends ICard> {
  protected ArrayList<T> cards = new ArrayList<>();
  
  public Game(){
    this.generateGame();
  }

  public void addCard(T card){
    this.cards.add(card);
  }

  public T getCard(int index){
    return this.cards.get(index);
  }

  public int getSize(){
    return this.cards.size();
  }
  
  protected abstract void generateGame();
  
  public abstract ArrayList<String> getCards();

}
