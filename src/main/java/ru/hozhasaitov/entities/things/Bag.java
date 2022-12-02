package ru.hozhasaitov.entities.things;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bag {
    private final List<Thing> thingList = new ArrayList<>();
    public void addThing(Thing thing){
        thingList.add(thing);
    }
    public boolean findThing(Thing thing){
       return thingList.stream().anyMatch(t -> t.equals(thing));
    }
    public Optional<Thing> getThing(Thing thing){
        return thingList.stream().filter(t -> t.equals(thing)).findFirst();
    }
}
