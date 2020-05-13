package Factory;

public class FastFoodFactory {
    
    public FastFood geFastFood( String type){
        switch( type ){
            case "hamburger": return new Hamburger();
            case "sandwich": return new Sandwich();
            case "hotDog": return new HotDog();
            case "pizza": return new Pizza();
            default: return null;
        }
    }
}