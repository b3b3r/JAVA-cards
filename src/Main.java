import Card.Card52;
import Game.Game32;
import Game.Game52;

// Vous pourrez regarder également deux patrons de conceptions répandus (par exemple sur wikipedia) :

// MVC qui sépare le code en plusieurs espaces : le modèle (M) d'un côté, les interactions avec l'utilisateur de l'autre (Vue). Et entre les deux, pour communiquer, le contrôleur (C).
// Le singleton qui permet de créer un objet particulier qui serait l'instance unique d'une classe pour le programme.

// 1/ Créer une interface ICarte qui regroupe toutes les particularités liées aux cartes quelle que soit la carte (jeu de 32/52 cartes, jeu de tarot, Dominion, Pokemon, Magic...)
// 2/ Créer une classe abstraite CarteClassique qui couvre les cartes classiques (32, 52 ou tarot)
// 3/ Créer les deux classes concrètes Carte32, Carte52 (modifier sensiblement l'enum Valeur)
// 4/ Créer une classe Paquet32 et une classe Paquet52. Pour l'exercice, ces deux classes respectent le singleton.
public class Main {
  public static void main(String[] args) throws Exception {
    Game52 game = Game52.getInstance();  
    // System.out.println(game.getSize());
    // Card cardOne = game.getCard(0);
    // cardOne.setIsVisible();
    // System.out.println(cardOne.getIsVisible());

    Game32 game32 = Game32.getInstance();
    // System.out.println(game32.getSize());
    // System.out.println(game32.getCards());
    System.out.println(game32.getCard(2).getCard());
  }
}
