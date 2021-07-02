public class ClientService implements ICollection {
    public ClientService(){
    }

    public ClientService(int maxClients) throws Exception{
        if (maxClients <= 0) {
            IllegalArgumentException e = new IllegalArgumentException(String.valueOf(maxClients));
        }
    }

    @Override
    public boolean add(Object newItem) {
        return false;
    }

    public String getNext() {
        return "test";
    }
}
