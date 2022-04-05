public class Item {
    private String name;
    private Float price;

    public Item(String givenName, Float givenPrice){
        name = givenName;
        price = givenPrice;
    };

    public String getName() {
        return this.name;
    };

    public Float getPrice(){
        return this.price;
    }
}
