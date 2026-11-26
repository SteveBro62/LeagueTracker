package fi.jyu.ohj2.ipetresx.league.persistance;

import fi.jyu.ohj2.ipetresx.league.Models.Champion;
import fi.jyu.ohj2.ipetresx.league.Models.Game;
import tools.jackson.core.JacksonException;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.nio.file.Path;
import java.util.List;

public class JsonGameRepository implements GameRepository{
    private final Path path;

    public JsonGameRepository(Path path){
        this.path = path;
    }

    @Override
    public List<Game> load() throws RepositoryException{
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(path, new TypeReference<>() {});
        }
        catch (JacksonException e){
            throw new RepositoryException(e.getMessage());
        }
    }

    @Override
    public void save(List<Game> games) throws RepositoryException {
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(path, new TypeReference<>() {});
        }
        catch (JacksonException e){
            throw new RepositoryException(e.getMessage());
        }
    }
}