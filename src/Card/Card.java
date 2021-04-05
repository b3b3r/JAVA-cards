package Card;

import Interface.ICard;

public abstract class Card implements ICard{
  private Boolean isVisible = false;
  private final String logo;

  public Card(String logo){
    this.logo = logo;
  }

  @Override
  public String getLogo(){
    return this.logo;
  }
  
  @Override
  public Boolean getIsVisible(){
    return this.isVisible;
  }
  
  @Override
  public void setIsVisible(){
    this.isVisible = !this.isVisible;
  }
  
  public String getCard(){
    String card;
    if (this.isVisible) {
      card = this.getFace();
    } else {
      card = this.logo;
    }
    return card;
  };

  protected abstract String getFace();
}
