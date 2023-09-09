package org.example.ToyStoreProject.view;

import org.example.ToyStoreProject.model.PopularToys;
import org.example.ToyStoreProject.model.RareToys;
import org.example.ToyStoreProject.model.Toys;

public class UserView {
    public void printAllToys(Toys toys) {
        System.out.println(toys);
    }

    public void printPopularToys(PopularToys popularToys) {
        System.out.println(popularToys);
    }

    public void printRareToys(RareToys rareToys) {
        System.out.println(rareToys);
    }
}
