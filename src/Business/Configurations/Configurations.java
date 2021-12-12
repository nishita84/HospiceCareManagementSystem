/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configurations;

/**
 *
 * @author architnigam
 */
public class Configurations {
    private boolean hasAutomatedSetupBeenRun;
    private boolean hasVitalSignsDataBeenLoaded;

    public boolean isHasAutomatedSetupBeenRun() {
        return hasAutomatedSetupBeenRun;
    }

    public void setHasAutomatedSetupBeenRun(boolean hasAutomatedSetupBeenRun) {
        this.hasAutomatedSetupBeenRun = hasAutomatedSetupBeenRun;
    }

    public boolean isHasVitalSignsDataBeenLoaded() {
        return hasVitalSignsDataBeenLoaded;
    }

    public void setHasVitalSignsDataBeenLoaded(boolean hasVitalSignsDataBeenLoaded) {
        this.hasVitalSignsDataBeenLoaded = hasVitalSignsDataBeenLoaded;
    }

}
