public class Main {
    public static void main(String[] args) {
        // สร้าง character instance
        Character hero = new Character(100, 50);
        // เรียก swingSword
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();
        hero.swingSword();

        // เรียก takeDamage
        hero.takeDamage(20);
        hero.takeDamage(30);
        hero.takeDamage(10);
        hero.takeDamage(20);
        hero.takeDamage(20);

        // เรียก rest
        hero.rest();

        // เรียก Print state
        System.out.println("Character's health: " + hero.getHealth() + ", stamina: " + hero.getStamina() + ".");
    }
}