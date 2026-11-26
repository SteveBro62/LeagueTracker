package fi.jyu.ohj2.ipetresx.league.Models;

import fi.jyu.ohj2.ipetresx.league.persistance.ItemRepository;
import fi.jyu.ohj2.ipetresx.league.persistance.RepositoryException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import java.util.*;

public class ItemCollection {
    private final ObservableList<Item> items = FXCollections.observableArrayList();
    private ItemRepository repo;

    public void load(ItemRepository repo){
        try {
            items.addAll(repo.load());
        }
        catch (RepositoryException e){
            IO.println(e);
        }
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public ObservableList<Item> getItems(){
        return items;
    }

    public void setItems(List<Item> items){
        this.items.clear();
        if(!items.isEmpty())
            this.items.addAll(items);
    }
}
