package Card;

import Enum.Figure;
import Enum.Suit;

public abstract class ClassicCard {
  private Figure figure;
  private Suit suit;

  public ClassicCard(Figure figure, Suit suit){
    this.figure = figure;
    this.suit= suit;
  }
  public Figure getFigure(){
    return this.figure;
  }
  public Suit getSuit(){
    return this.suit;
  }
  public String getCard(){
    return this.figure.toString() + " of " + this.suit.toString();
  }
}
