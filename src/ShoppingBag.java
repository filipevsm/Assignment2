//When emptying a bag, we start with the item on top then the next until the bag is empty. "IMPLEMENT LIFO"
public class ShoppingBag implements ICollection{
    int numberOfItems = 0;

    public ShoppingBag(){
    }

    public ShoppingBag(int bagSize) throws Exception{
        if (bagSize <= 0) {
            IllegalArgumentException e = new IllegalArgumentException(String.valueOf(bagSize));
        }
        else {
            String[] shoppingList = new String[bagSize];
        }
    }

    @Override
    public boolean add(Object newItem) {
        this.numberOfItems++;

        return false;
    }

    @Override
    public String getNext() {
        return null;
    }
}
