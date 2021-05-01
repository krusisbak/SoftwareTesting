package oopsConcept;

public class DeliveryApps {
    public static void main (String [] args){
      FoodApps bestFoodApps = new FoodApps();
      bestFoodApps.deliveryWrap();

            UberApps bestUberApps = new UberApps();
            bestUberApps.deliveryPizza();

        JustEatApps bestJustEatApps = new JustEatApps();
        bestJustEatApps.deliveryIceCream();
    }

}
