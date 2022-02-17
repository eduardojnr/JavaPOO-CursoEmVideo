package b07;

public class Fighter {
    private String name;
    private String nationality;
    private int age;
    private int height;
    private float weight;
    private String category;
    private int victories;
    private int defeats;
    private int draws;
    
    public void introduce(){
        System.out.println("Fighter: " + this.getName());
        System.out.println("Nationality: " + this.getNationality());
        System.out.println("Age: " + this.getAge());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Category: " + this.getCategory());
        System.out.println("=============");
    }
    
    public void status(){
        System.out.println("Wins: " + this.getVictories());
        System.out.println("Draws: " + this.getDraws());
        System.out.println("Defeats: " + this.getDefeats());
        System.out.println("=============");
    }
    
    public void winFight(){
        this.setVictories(this.getVictories() + 1);
    }
    
    public void loseFight(){
        this.setDefeats(this.getDefeats() + 1);
    }
    
    public void drawFight(){
        this.setDraws(this.getDraws() + 1);
    }
    
    // Constructor
    public Fighter(String name, String nationality, int age, int height, float weight, int victories, int defeats, int draws) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.setWeight(weight);
        this.victories = victories;
        this.defeats = defeats;
        this.draws = draws;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        if (this.weight < 50){
            this.category = "Feather";
        } else if (this.weight >= 50 & this.weight < 70){
            this.category = "Normal";            
        } else {
            this.category = "Monster";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}