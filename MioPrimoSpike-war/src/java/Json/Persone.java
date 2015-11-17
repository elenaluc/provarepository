/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Json;

/**
 *
 * @author giovanna
 */
public class Persone {
    private String NAME;
    private String LOCATION;

    // Getters and setters are not required for this example.
    // GSON sets the fields directly using reflection.

    @Override
    public String toString() {
        return NAME + " - " + LOCATION;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getLOCATION() {
        return LOCATION;
    }

    public void setLOCATION(String LOCATION) {
        this.LOCATION = LOCATION;
    }
}
