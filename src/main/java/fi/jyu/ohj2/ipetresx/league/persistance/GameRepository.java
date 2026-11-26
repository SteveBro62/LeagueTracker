package fi.jyu.ohj2.ipetresx.league.persistance;

import fi.jyu.ohj2.ipetresx.league.Models.Game;

import java.util.List;

public interface GameRepository {
    void save(List<Game> games) throws RepositoryException;
    List<Game> load() throws RepositoryException;
}
