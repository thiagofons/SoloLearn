package Enums;

// Enums are most used on month names, days of the week, deck of cards, etc

enum Rank{
    SOLDIER,
    SERGEANT,
    CAPTAIN
}

public class Program {
    public static void main(String[] args){
        Rank a = Rank.SOLDIER;

        switch(a){
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
    }
}
