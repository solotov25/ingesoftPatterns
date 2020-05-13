package Factory;

public class Restaurant {
    
    public static void main(final String[] args) {
        final RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        final RestaurantAbstractFactory restaurantAbstractFactory = restaurantFactoryProducer
                .getRestaurantAbstractFactory(1);

        final Drink beer = restaurantAbstractFactory.getDrink("beer");
        
        System.out.println( restaurantAbstractFactory.getDrink("beer"));
    }
}