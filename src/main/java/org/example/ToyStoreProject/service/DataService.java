package org.example.ToyStoreProject.service;

import org.example.ToyStoreProject.model.PopularToys;
import org.example.ToyStoreProject.model.RareToys;
import org.example.ToyStoreProject.model.Toys;
import org.example.ToyStoreProject.model.Type;

import java.util.List;

public interface DataService {
    void create(Type type, Integer toyId, String toyName, Integer toyQuantity, Double toyWeight);

    List<Toys> readAllToys();

    List<RareToys> readOnlyRareToys();

    List<PopularToys> readOnlyPopularToys();
}
