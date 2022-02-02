import java.util.*; 

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();

        sc.close();
    }
}

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    
    public void getWinner(){
        int maior = 0;
        for(int i: players.values()){
            if(i > maior)
                maior = i;
        }
        for(String i: players.keySet()){
            if(players.get(i) == maior){
                System.out.println(i);
                return;
            }
        }     
    }
}
