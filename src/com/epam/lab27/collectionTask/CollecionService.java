package com.epam.lab27.collectionTask;

import java.util.ArrayList;
import java.util.HashMap;

public class CollecionService {
    ArrayList<Client> clientList = new ArrayList<Client>();
    ArrayList<Goods> goodsList = new ArrayList<>();

    HashMap<ArrayList<Client>, ArrayList<Goods>> generalMap = new HashMap<>();

    {
        clientList.add(new Client(1, "Vasyliy Petrov"));
        clientList.add(new Client(2, "Petr Alekseev"));
    }

    {
        goodsList.add(new Goods(1, "Bread", 95.00, 3));
        goodsList.add(new Goods(2, "Milk", 150.00, 2));
    }

    {

        generalMap.put(clientList, goodsList);
    }

    public void getBill() {
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println("Client " + clientList.get(i).getName() + " bought " + " goods: " + goodsList.get(i).getNameOfGood() + " price: " + goodsList.get(i).getPrice() + " quantity: "
                    + goodsList.get(i).getQuantity() + " purchase: "
                    + goodsList.get(i).getPurchase());
        }
    }
}

