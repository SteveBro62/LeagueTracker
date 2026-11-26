package fi.jyu.ohj2.ipetresx.league.persistance;

import fi.jyu.ohj2.ipetresx.league.Models.Champion;

import java.util.List;

public interface ChampionRepository {
    List<Champion> load() throws RepositoryException;
}
