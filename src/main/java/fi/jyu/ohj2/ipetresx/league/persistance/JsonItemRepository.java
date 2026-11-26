package fi.jyu.ohj2.ipetresx.league.persistance;

import fi.jyu.ohj2.ipetresx.league.Models.Item;
import java.util.*;
import java.nio.file.Path;
import tools.jackson.core.*;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class JsonItemRepository implements ItemRepository{
    private final Path path;

    public JsonItemRepository(Path path){
        this.path = path;
    }

    @Override
    public List<Item> load() throws RepositoryException{
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(path, new TypeReference<>() {});
        }
        catch (JacksonException e){
            throw new RepositoryException(e.getMessage());
        }
    }
}
