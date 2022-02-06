public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        hamburger.addHamburgerAddition1("tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",1.10);
        hamburger.addHamburgerAddition3("Cheese",1.12);
        System.out.println("Total Price of your Hamburger is $"+hamburger.itemizeHamburger());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg",5.43);
        healthyBurger.addHealthAddition2("Lentils",3.46);
        healthyBurger.itemizeHamburger();
        System.out.println("Total Price of your Hamburger is $"+healthyBurger.itemizeHamburger());

        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("SAD", 24.234);
    }
}
