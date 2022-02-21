package b07b08;

import java.util.Random;

public class Fight {
    
    private Fighter challenger;
    private Fighter challenged;
    private int rounds;
    private boolean status;
    
    public void organizeFight(Fighter f1, Fighter f2){
        if (f1.getCategory().equals(f2.getCategory())
            && (f1 != f2)){
            this.setStatus(true);
            this.setChallenged(f1);
            this.setChallenger(f2);
        } else {
            this.setStatus(false);
            this.setChallenged(null);
            this.setChallenger(null);
        }
    }
    
    public void combat(){
        if (this.isStatus()){
            System.out.println("Challenger: ");
            challenger.introduce();
            System.out.println("Challenged: ");
            challenged.introduce();
            
            Random randomWinner =  new Random();
            int winner = randomWinner.nextInt(3);
            
            switch (winner){
                case 0: // Challenger wins
                    System.out.println("The winner is: " + this.challenger.getName());
                    this.challenger.winFight();
                    this.challenged.loseFight();
                    break;
                case 1: // Challenged wins
                    System.out.println("The winner is: " + this.challenged.getName());
                    this.challenger.loseFight();
                    this.challenged.winFight();
                    break;
                case 2: // Draw
                    System.out.println("No winners");
                    this.challenger.drawFight();
                    this.challenged.drawFight();
                    break;
            }
        } else {
            System.out.println("The fight will not happen");
        }
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}