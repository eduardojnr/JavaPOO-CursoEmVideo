package b07b08;

public class MainChampionship {

    public static void main(String[] args) {
        
        Fighter f[] = new Fighter[4];
        
        f[0] = new Fighter("Emerson F.", "Brazil", 30, 150, 60f, 0, 0, 3);
        f[1] = new Fighter("L. Hamilton", "United Kingdom", 34, 170, 60.3f, 110, 0, 0);
        f[2] = new Fighter("Dilma R.", "Brazil", 30, 150, 170f, 1, 5, 7);
        f[3] = new Fighter("Mr. Bean", "Unknown", 30, 150, 50f, 0, 0, 0);
        
        Fight fight1 = new Fight();
        fight1.organizeFight(f[0], f[1]);
        fight1.combat();
    }
}