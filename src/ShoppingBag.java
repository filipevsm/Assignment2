/**
 * ShoppingBag class is used to track items in a shopping bag. When an item is placed in an empty
 * bag, it is placed at the bottom of the bag, then we place another item on top of it and so on until
 * the bag is full. When emptying a bag, we start with the item on top then the next until the bag is
 * empty. FILO implementation.
 *
 * The ShoppingBag class keeps the list of items in an array of fixed size, because shopping
 * bags have fixed size.
 *
 * ShoppingBag class implements the ICollection interface.
 */
public class ShoppingBag implements ICollection{
    int numberOfItems = 0;
    String[] shoppingList;

    /**
     * This is the only ShoppingBag constructor and require an input int bagSize with the number of the items
     * accepted by this list. It throws an IllegalArgumentException if bagSize is less/equal to 0.
     *
     * @param bagSize Integer variable to set the list size.
     * @throws IllegalArgumentException Throws an exception if bagSize is less/equal to 0.
     */
    public ShoppingBag(int bagSize) throws IllegalArgumentException{
        if (bagSize <= 0) {
            IllegalArgumentException e = new IllegalArgumentException("Invalid shopping bag size: " + String.valueOf(bagSize));
            throw e;
        }
        else {
            this.shoppingList = new String[bagSize];
        }
    }

    /**
     * This method adds an items to the enf of the list/index. This is a custom implementation of the add method first
     * referenced at the ICollection interface.
     *
     * @param newItem This object represents an item to be added to the list.
     * @return The add method returns true if the item was added to the list successfully or false if not.
     */
    @Override
    public boolean add(Object newItem) {
        int counter = 0;
        while (counter < this.shoppingList.length) {
            if (this.shoppingList[counter] == null) {
                this.shoppingList[counter] = (String) newItem;
                this.numberOfItems++;
                return true;
            }
            else if (this.shoppingList[this.shoppingList.length - 1] != null) {
                return false;
            }
            counter++;
        }
        return false;
    }

    /**
     * This method returns the last item added to the list and removes it from it. This is a custom implementation
     * of the getNext method first referenced at the ICollection interface.
     *
     * @return It returns a String with the item name at last index of the list.
     */
    @Override
    public String getNext() {
        int counter = 0;
        while (counter < shoppingList.length) {
            if (this.shoppingList[this.shoppingList.length - 1 - counter] != null) {
                String lastAddedItem = this.shoppingList[this.shoppingList.length - 1 - counter];
                this.shoppingList[this.shoppingList.length - 1 - counter] = null;
                this.numberOfItems--;
                return lastAddedItem;
            }
            counter++;
        }
        return "Could not remove item.";
    }
}
