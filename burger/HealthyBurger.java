package Challenge.burger;

public class HealthyBurger extends Hamburger {
    private String HealthyExtra1Name;
    private double HealthyExtra1price;

    private String HealthyExtra2Name;
    private double HealthyExtra2price;


    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.HealthyExtra1Name = name;
        this.HealthyExtra1price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.HealthyExtra2Name = name;
        this.HealthyExtra2price = price;
    }

    @Override
    public double itemizehamburger() {
        double hamburgerPrice =  super.itemizehamburger();
        if (HealthyExtra1Name != null){
            hamburgerPrice += this.HealthyExtra1price;
            System.out.println("Added " + this.HealthyExtra1Name + " for an extra " + this.HealthyExtra1price);
        }

        if(HealthyExtra2Name != null){
            hamburgerPrice += this.HealthyExtra2price;
            System.out.println("Added " + this.HealthyExtra1Name + " for an extra " + this.HealthyExtra2price);
        }
        return hamburgerPrice;

    }
}
