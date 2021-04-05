package Enum;

public enum Figure {
  ACE("AS", 1), KING("K", 2), QUEEN("Q", 3), VALET("V", 4), TEN("10", 5), NINE("9", 6), EIGHT("8", 7),
  SEVEN("7", 8), SIX("6", 9), FIVE("5", 10), FOUR("4", 11), THREE("3", 12), TWO("2", 13);

  private final String label;
  private final int order;
  
  private Figure(String label, int order){
    this.label = label;
    this.order = order;
  }

  public String getLabel() {
    return this.label;
  }

  public int getorder() {
    return this.order;
  }
}
