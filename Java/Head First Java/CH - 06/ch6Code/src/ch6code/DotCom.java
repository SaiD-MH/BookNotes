
package ch6code;

import java.util.ArrayList;

public class DotCom {

    private String name;
    private ArrayList<String> locationCells;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    String checkYourSelf(String UserG) {

        String result = "miss";

        int idx = locationCells.indexOf(UserG);
        if (idx >= 0) {
            locationCells.remove(idx);
            
            
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " : ( ");
            } else {
                result = "hit";
            }
        }

       
        return result;

    }
}
