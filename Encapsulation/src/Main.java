public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name="Chaitanya";
        player.health = 100;
        player.weapon = "Katana";

        int damage =25;
        player.loseHealth(damage);
        System.out.println("Remaining Health = "+player.healthRemaining());
    }
}
