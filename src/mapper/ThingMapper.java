package mapper;

import domain.Location;
import domain.Thing;

import java.util.List;

public interface ThingMapper {
    void insertThing(Thing thing);
    List<Location> getLocation();
    List<String>getTags();
}
