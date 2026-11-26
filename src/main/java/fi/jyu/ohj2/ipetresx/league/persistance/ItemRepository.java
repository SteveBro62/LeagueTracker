package fi.jyu.ohj2.ipetresx.league.persistance;

import fi.jyu.ohj2.ipetresx.league.Models.Item;
import java.util.*;

public interface ItemRepository {
    List<Item> load() throws RepositoryException;
}
