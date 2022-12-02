package ru.hozhasaitov.entities;

import ru.hozhasaitov.entities.npc.Dealer;
import ru.hozhasaitov.entities.things.PotionHP;
import ru.hozhasaitov.entities.things.Thing;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Magazine {
    private final Dealer dealer;
    private final Map<Thing, Integer> things = new HashMap<>();
    public Magazine(Dealer dealer) {
        this.dealer = dealer;
        things.put(new PotionHP(), 5);
    }

    public Map<Thing, Integer> getMapThings() {
        return things;
    }
    public Set<Thing> getSetThings(){
        return  things.keySet();
    }
    public Integer getPrice(Thing thing){
        return things.get(thing);
    }
}
