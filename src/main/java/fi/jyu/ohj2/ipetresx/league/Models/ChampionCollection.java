package fi.jyu.ohj2.ipetresx.league.Models;

import fi.jyu.ohj2.ipetresx.league.persistance.ChampionRepository;
import fi.jyu.ohj2.ipetresx.league.persistance.ItemRepository;
import fi.jyu.ohj2.ipetresx.league.persistance.RepositoryException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.*;

public class ChampionCollection {
    private final ObservableList<Champion> champions = FXCollections.observableArrayList();
    private ChampionRepository repo;

    public void load(ChampionRepository repo){
        try {
            champions.addAll(repo.load());
        }
        catch (RepositoryException e){
            IO.println(e);
        }
    }

    public ObservableList<Champion> getChampions(){
        return champions;
    }

    public void setChampions(List<Champion> champions){
        this.champions.clear();
        if(!champions.isEmpty())
            this.champions.addAll(champions);
    }
}
