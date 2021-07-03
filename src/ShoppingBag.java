//When emptying a bag, we start with the item on top then the next until the bag is empty. "IMPLEMENT LIFO"
public class ShoppingBag implements ICollection{
    int numberOfItems = 0;
    String[] shoppingList;

    public ShoppingBag(){
    }

    public ShoppingBag(int bagSize) throws Exception{
        if (bagSize <= 0) {
            IllegalArgumentException e = new IllegalArgumentException(String.valueOf(bagSize));
        }
        else {
            this.shoppingList = new String[bagSize];
        }
    }

    @Override
    public boolean add(Object newItem) {
        int counter = 0;
        while (counter <= this.shoppingList.length) {
            if (this.shoppingList[this.shoppingList.length - 1] == null) {
                this.shoppingList[this.shoppingList.length - 1] = (String) newItem;
                this.numberOfItems++;
                return true;
            }
            else if (this.shoppingList[0] != null)
                return false;
            counter++;
        }
        return false;
    }

    @Override
    public String getNext() {
        int counter = 0;
        while (counter <= shoppingList.length) {
            if (this.shoppingList[this.shoppingList.length - 1 - counter] != null) {
                String lastAddedItem = this.shoppingList[this.shoppingList.length - 1 - counter];
                this.shoppingList[this.shoppingList.length - 1 - counter] = null;
                this.numberOfItems--;
                return lastAddedItem;
            }
            counter++;
        }
        return null;
    }
}
