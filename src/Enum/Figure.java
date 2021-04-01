package Enum;

public enum Figure {
  ACE("AS"), KING("K"), QUEEN("Q"), VALET("V"), TEN("10"), NINE("9"), EIGHT("8"),
  SEVEN("7"), SIX("6"), FIVE("5"), FOUR("4"), THREE("3"), TWO("2");

  private String label;
  private Figure(String label){
    this.label = label;
  }

  public String getLabel() {
    return this.label;
  }
}
