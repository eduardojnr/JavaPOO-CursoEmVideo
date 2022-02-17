package b07;

public class MainChampionship {

    public static void main(String[] args) {
        
        Fighter f1 = new Fighter("Emerson F.", "Brazil", 30, 150, 49.9f, 0, 0, 3);
        Fighter f2 = new Fighter("L. Hamilton", "United Kingdom", 34, 170, 60.3f, 110, 0, 0);
        Fighter f3 = new Fighter("Dilma R.", "Brazil", 30, 150, 170f, 1, 5, 7);
        Fighter f4 = new Fighter("Mr. Bean", "Unknown", 30, 150, 50f, 0, 0, 0);
        
        f1.introduce();
        f2.introduce();
        f3.introduce();
        f4.introduce();
        
    }
    
}