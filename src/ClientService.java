/**
 * The ClientService class keeps a list of client names. ClientService class is used to track clients walking into a
 * business like a bank, clinic, pharmacy, etc. Usually, the client that walks in first is the first client to
 * be served. FIFO implementation.
 *
 * ClientService class implements the ICollection interface.
 */
public class ClientService implements ICollection {
    String[] clientsList;

    public ClientService(){
    }

    /**
     * This is the only ClientService constructor and require an input int maxClients with the number of the clients
     * accepted by this list/queue. It throws an IllegalArgumentException if maxClients is less/equal to 0.
     *
     * @param maxClients Integer variable to set the list size.
     * @throws IllegalArgumentException Throws an exception if maxClients is less/equal to 0.
     */
    public ClientService(int maxClients) throws IllegalArgumentException{
        if (maxClients <= 0) {
            IllegalArgumentException e = new IllegalArgumentException("Invalid client queue size: " + String.valueOf(maxClients));
            throw e;
        }
        else {
            this.clientsList = new String[maxClients];
        }
    }

    /**
     * This method adds a client to the end of the list/index. This is a custom implementation of the add method first
     * referenced at the ICollection interface.
     *
     * @param newItem This object represents a client to be added to the list.
     * @return The add method returns true if the client was added to the list successfully or false if not.
     */
    @Override
    public boolean add(Object newItem) {
        int counter = 0;
        while (counter <= this.clientsList.length) {
            if (this.clientsList[counter] == null) {
                this.clientsList[counter] = (String) newItem;
                return true;
            }
            else if (this.clientsList[(this.clientsList.length - 1)] != null)
                return false;
            counter++;
        }
        return false;
    }

    /**
     * This method returns the first client in the list and removes it from the queue. This is a custom implementation
     * of the getNext method first referenced at the ICollection interface.
     *
     * @return It returns a String with the client name at the index 0 of the list.
     */
    @Override
    public String getNext() {
        String currentClient = this.clientsList[0];

        if (this.clientsList[0] == null) {
            return "No clients on queue.";
        }
        else if (this.clientsList[1] == null) {
            this.clientsList[0] = null;
            return currentClient;
        }
        else {
            int counter = 0;
            while (counter < this.clientsList.length) {
                if ((counter + 1) == this.clientsList.length) {
                    this.clientsList[counter] = null;
                    return currentClient;
                }
                else {
                    this.clientsList[counter] = this.clientsList[counter + 1];
                }
                counter++;
            }
        }
        return "false";
    }
}
