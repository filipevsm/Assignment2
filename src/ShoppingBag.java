public class ShoppingBag implements ICollection{

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
        return false;
    }

    @Override
    public String getNext() {
        return null;
    }
}
