package Card;

import Enum.Figure;
import Enum.Suit;

public abstract class ClassicCard extends Card {
  private final Figure figure;
  private final Suit suit;
  
  public ClassicCard(Figure figure, Suit suit, String logo){
    super(logo);
    this.figure = figure;
    this.suit= suit;
  }

  protected String getFace(){
    return this.figure.getLabel() + this.suit.getLabel();
  }

  public Figure getFigure(){
    return this.figure;
  }

  public Suit getSuit(){
    return this.suit;
  }
}
