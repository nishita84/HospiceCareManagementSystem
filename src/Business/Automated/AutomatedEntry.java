/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Automated;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author architnigam
 */
public class AutomatedEntry {
    
    public boolean AutomatedCreationOfProviders()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File providersXMLFile = new File(projectPath + "/src/Business/Automated/Providers.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(providersXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("provider");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;

                   String restaurantName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String restaurantAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   String type = eElement.getElementsByTagName("type")
                                        .item(0).getTextContent();
                    String manager = eElement.getElementsByTagName("manager")
                                        .item(0).getTextContent();                            
 
                   String username = eElement.getElementsByTagName("username")
                                        .item(0).getTextContent();
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();
                }
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
        return true;
    }
    
    public boolean AutomatedCreationOfPatients()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File patientXMLFile = new File(projectPath + "/src/Business/Automated/Patients.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(patientXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("restaurant");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;

                   String restaurantName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String restaurantAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   String type = eElement.getElementsByTagName("type")
                                        .item(0).getTextContent();
                    String manager = eElement.getElementsByTagName("manager")
                                        .item(0).getTextContent();                            
 
                   String username = eElement.getElementsByTagName("username")
                                        .item(0).getTextContent();
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();                
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
            return true;
    }
    
    public boolean AutomatedCreationOfNurses()
    {
        String projectPath = System.getProperty("user.dir");
        try
             {
                File nursesXMLFile = new File(projectPath + "/src/Business/Automated/Nurses.xml");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(nursesXMLFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("nurse");

            for (int temp = 0; temp < nList.getLength(); temp++) 
            {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;

                   String restaurantName = (eElement.getElementsByTagName("name")
                                        .item(0).getTextContent());
                   String restaurantAddress = eElement.getElementsByTagName("address")
                                        .item(0).getTextContent();
                   String type = eElement.getElementsByTagName("type")
                                        .item(0).getTextContent();
                    String manager = eElement.getElementsByTagName("manager")
                                        .item(0).getTextContent();                            
 
                   String username = eElement.getElementsByTagName("username")
                                        .item(0).getTextContent();
                   String password = eElement.getElementsByTagName("password")
                                        .item(0).getTextContent();                
                }
                
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
            return true;
    }
    
    public boolean AutomatedCreationOfCounsellors()
    {
        return true;
    }
    
    public boolean AutomatedCreationOfDonors()
    {
        return true;
    }
    
    public boolean AutomatedCreationOfPayers()
    {
        return true;
    }
    
    public boolean AutomatedCreationOfVolunteers()
    {
        return true;
    }
    
    public boolean AutomatedCreationOfServices()
    {
        return true;
    }
    
    public boolean AutomatedCreationOfDiagnosis()
    {
        return true;
    }
    
    public boolean AutomatedLoggingOfVitalSigns()
    {
        return true;
    }
}
