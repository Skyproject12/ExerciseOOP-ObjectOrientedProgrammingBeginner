
package pbo2;

/**
 *
 * @author Praktikan
 */
public class Pesanan {
    Makanan food;
    Minuman drink;
    float total;

    public Pesanan(Makanan food, Minuman drink) {
        this.food = food;
        this.drink = drink;
    }

    public Makanan getFood() {
        return food;
    }

    public void setFood(Makanan food) {
        this.food = food;
    }

    public Minuman getDrink() {
        return drink;
    }

    public void setDrink(Minuman drink) {
        this.drink = drink;
    }
    
    public float getJumlahBayar(float jmlMakanan, float jmlMinuman) {
        total = ((food.getHarga() * jmlMakanan) + (drink.getHarga() * jmlMinuman));
        return total;
    }
    
    public float total(float total){
        return total;
    }
}
