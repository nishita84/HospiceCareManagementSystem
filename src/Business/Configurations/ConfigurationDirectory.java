/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configurations;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class ConfigurationDirectory {
    private ArrayList<Configurations> listOfConfigurations;
    
    public ConfigurationDirectory()
    {
        listOfConfigurations = new ArrayList<Configurations>();
    }

    public ArrayList<Configurations> getListOfConfigurations() {
        return listOfConfigurations;
    }

    public void setListOfConfigurations(ArrayList<Configurations> listOfConfigurations) {
        this.listOfConfigurations = listOfConfigurations;
    }
    
    public Configurations createNewConfigurations(boolean hasAutomatedSetupBeenRun)
    {
        Configurations config = new Configurations();
        config.setHasAutomatedSetupBeenRun(hasAutomatedSetupBeenRun);
        listOfConfigurations.add(config);
        return config;
    }
}
