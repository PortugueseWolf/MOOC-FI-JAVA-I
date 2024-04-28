package vehicleregistry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
   private HashMap<LicensePlate, String> plateRegistry;

   public VehicleRegistry() {
      this.plateRegistry = new HashMap<>();
   }

   public boolean add(LicensePlate licensePlate, String owner) {
      if (plateRegistry.containsKey(licensePlate)) {
         return false;
      }
      plateRegistry.put(licensePlate, owner);
      return true;
   }

   public String get(LicensePlate licensePlate) {
      if (plateRegistry.containsKey(licensePlate)) {
         return plateRegistry.get(licensePlate);
      }
      return null;
   }

   public boolean remove(LicensePlate licensePlate) {
      if (plateRegistry.containsKey(licensePlate)) {
         plateRegistry.remove(licensePlate);
         return true;
      }
      return false;
   }

   public void printLicensePlates() {
      for (LicensePlate printer : plateRegistry.keySet()) {
         System.out.println(printer);
      }
   }

   public void printOwners() {
      ArrayList<String> ownerList = new ArrayList<>();

      for (LicensePlate printer : plateRegistry.keySet()) {
         if (ownerList.contains(plateRegistry.get(printer))) {
            continue;
         }
         ownerList.add(plateRegistry.get(printer));
      }
      for(String printer : ownerList) {
         System.out.println(printer);
      }
   }
}
