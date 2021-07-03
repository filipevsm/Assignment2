//Usually, the client that walks in first is the first client to be served. "IMPLEMENT FIFO"
public class ClientService implements ICollection {
    String[] clientsList;

    public ClientService(){
    }

    public ClientService(int maxClients) throws Exception{
        if (maxClients <= 0) {
            IllegalArgumentException e = new IllegalArgumentException(String.valueOf(maxClients));
        }
        else {
            this.clientsList = new String[maxClients];
        }
    }

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

    @Override
    public String getNext() {
        String currentClient = this.clientsList[0];

        int counter = 0;
        while (counter <= this.clientsList.length) {
            this.clientsList[counter] = this.clientsList[counter+1];
            counter++;
        }

        return currentClient;
    }
}
