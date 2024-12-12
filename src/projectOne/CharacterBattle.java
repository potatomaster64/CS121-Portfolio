package projectOne;
import java.util.Scanner;
import java.util.Random;

class Character {
    String name;
    int hitPoints;
    String move;
    int movePower;
    int attackSpeed;

    public Character(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }
}

class Battle {
    private int player1Score = 0;
    private int player2Score = 0;

    public void playRound(Character char1, Character char2) {
        System.out.println("\nPlayer 1's character " + char1.name + " vs Player 2's character " + char2.name);

        while (char1.hitPoints > 0 && char2.hitPoints > 0) {
            if (char1.attackSpeed > char2.attackSpeed) {
                char2.hitPoints -= char1.movePower;
                System.out.println(char1.name + " attacks! " + char2.name + " has " + char2.hitPoints + " HP left.");
                if (char2.hitPoints <= 0) {
                    System.out.println("Player 1 wins the round!");
                    player1Score++;
                    return;
                }

                char1.hitPoints -= char2.movePower;
                System.out.println(char2.name + " attacks! " + char1.name + " has " + char1.hitPoints + " HP left.");
                if (char1.hitPoints <= 0) {
                    System.out.println("Player 2 wins the round!");
                    player2Score++;
                    return;
                }
            } else if (char2.attackSpeed > char1.attackSpeed) {
                char1.hitPoints -= char2.movePower;
                System.out.println(char2.name + " attacks! " + char1.name + " has " + char1.hitPoints + " HP left.");
                if (char1.hitPoints <= 0) {
                    System.out.println("Player 2 wins the round!");
                    player2Score++;
                    return;
                }

                char2.hitPoints -= char1.movePower;
                System.out.println(char1.name + " attacks! " + char2.name + " has " + char2.hitPoints + " HP left.");
                if (char2.hitPoints <= 0) {
                    System.out.println("Player 1 wins the round!");
                    player1Score++;
                    return;
                }
            } else {
                Random rand = new Random();
                if (rand.nextInt(2) == 0) {
                    char2.hitPoints -= char1.movePower;
                    System.out.println("Speeds tied! " + char1.name + " attacks first! " + char2.name + " has " + char2.hitPoints + " HP left.");
                    if (char2.hitPoints <= 0) {
                        System.out.println("Player 1 wins the round!");
                        player1Score++;
                        return;
                    }

                    char1.hitPoints -= char2.movePower;
                    System.out.println(char2.name + " attacks! " + char1.name + " has " + char1.hitPoints + " HP left.");
                    if (char1.hitPoints <= 0) {
                        System.out.println("Player 2 wins the round!");
                        player2Score++;
                        return;
                    }
                } else {
                    char1.hitPoints -= char2.movePower;
                    System.out.println("Speeds tied! " + char2.name + " attacks first! " + char1.name + " has " + char1.hitPoints + " HP left.");
                    if (char1.hitPoints <= 0) {
                        System.out.println("Player 2 wins the round!");
                        player2Score++;
                        return;
                    }

                    char2.hitPoints -= char1.movePower;
                    System.out.println(char1.name + " attacks! " + char2.name + " has " + char2.hitPoints + " HP left.");
                    if (char2.hitPoints <= 0) {
                        System.out.println("Player 1 wins the round!");
                        player1Score++;
                        return;
                    }
                }
            }
        }
    }

    public void determineWinner() {
        if (player1Score > player2Score) {
            System.out.println("\nPlayer 1 wins the battle with " + player1Score + " rounds won!");
        } else if (player2Score > player1Score) {
            System.out.println("\nPlayer 2 wins the battle with " + player2Score + " rounds won!");
        } else {
            System.out.println("\nThe battle ends in a draw! Both players won " + player1Score + " rounds.");
        }
    }
}

public class CharacterBattle {

    public static Character getCharacterInput(int playerNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player " + playerNumber + ", enter your character's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter " + name + "'s hit points: ");
        int hitPoints = scanner.nextInt();

        System.out.println("Enter " + name + "'s move name: ");
        scanner.nextLine();  // Consume newline
        String move = scanner.nextLine();

        System.out.println("Enter " + name + "'s move power: ");
        int movePower = scanner.nextInt();

        System.out.println("Enter " + name + "'s attack speed: ");
        int attackSpeed = scanner.nextInt();

        return new Character(name, hitPoints, move, movePower, attackSpeed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Battle battle = new Battle();

        System.out.println("Welcome to Character Battle!");

        System.out.println("Enter an odd number of rounds: ");
        int rounds = scanner.nextInt();
        while (rounds % 2 == 0) {
            System.out.println("Please enter an odd number of rounds: ");
            rounds = scanner.nextInt();
        }

        for (int i = 0; i < rounds; i++) {
            Character char1 = getCharacterInput(1);
            Character char2 = getCharacterInput(2);
            battle.playRound(char1, char2);
        }

        battle.determineWinner();
    }
}