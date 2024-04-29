package storage;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        facility.putIfAbsent(unit, new ArrayList<String>());
        facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!(facility.containsKey(storageUnit))) {
            return new ArrayList<>();
        }
        return facility.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        facility.get(storageUnit).remove(item);
        if (facility.get(storageUnit).isEmpty()) {
            facility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String processor : facility.keySet()) {
            units.add(processor);
        }
        return units;
    }
}
