package strategyPattern.models;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private double wallet;
    private List<Client> clients;

    public Client(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        clients = new ArrayList<>();
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public void removeClient(Client client){
        clients.remove(client);
    }

    public int getQuantityClients(){
        return clients.size();
    }

//    public Client getAllClients(){
//        int findAll = getClient();
//        if(findAll != 0){
//            for (Client c : clients){
//                clients.add(c);
//                System.out.println("Client: " + c);
//            }
//        }
//        return null;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
