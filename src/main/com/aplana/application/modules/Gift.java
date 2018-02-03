package com.aplana.application.modules;

/**
 * Gift (Composing a gift box)
 *
 * @author Artem Tugushev
 */
public class Gift {
    private String name;
    private int id;
    private float weight;
    private float price;

    public Gift(String name, int id, float weight, float price) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static Gift[] makeGiftBox(Gift... gifts) {
        float totalPrice = 0;
        float totalWeight = 0;

        for (Gift gift : gifts) {
            totalPrice += gift.getPrice();
            totalWeight += gift.getWeight();

            System.out.printf("Sweetness: %s, id: %d, weight: %.2f, price: %.2f \n",
                    gift.getName(), gift.getId(), gift.getWeight(), gift.getPrice());
        }

        System.out.printf("Total price of the Box: %.2f. Total weight of the Box: %.2f. \n", totalPrice, totalWeight);

        return gifts;
    }
}
