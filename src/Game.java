import java.util.Scanner;

public class Game {
    private Deck deck;
    private Hand hand;

    public Game() {
        deck = new Deck();
        deck.rndDeck();
        hand = new Hand(5);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            hand.addCard(deck.drawCard());
        }

        System.out.println("Ваши карты");
        hand.showHand();


        System.out.println("Предложить игроку заменить карты обязательно (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Введите позицию которую вы хотите заменить (если несколько можно пробелами, 1 3 5):");
            String positionsInput = scanner.nextLine();
            String[] positions = positionsInput.split(" ");

            for (String position : positions) {
                int pos = Integer.parseInt(position);
                if (pos >= 1 && pos <= 5) {
                    Card newCard = deck.drawCard();
                    hand.replaceCard(pos, newCard);
                } else {
                    System.out.println("Неверная позиция: " + pos);
                }
            }
            System.out.println("\nОкончательная колода карт:");
            hand.showHand();
        } else {
            System.out.println("нет изменений ваша рука также остается");
            hand.showHand();
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }}
