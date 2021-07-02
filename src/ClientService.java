//Usually, the client that walks in first is the first client to be served. "IMPLEMENT FIFO"
public class ClientService implements ICollection {

    public ClientService(){
    }

    public ClientService(int maxClients) throws Exception{
        if (maxClients <= 0) {
            IllegalArgumentException e = new IllegalArgumentException(String.valueOf(maxClients));
        }
        else {
            String[] clientsList = new String[maxClients];
        }
    }

    @Override
    public boolean add(Object newItem) {
        return false;
    }

    @Override
    public String getNext() {
        return "test";
    }
}
