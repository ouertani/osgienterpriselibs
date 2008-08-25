
  
package com.jtunisie.osgi.loader.client.impl;

import com.jtunisie.osgi.loader.client.ILoader;
import com.jtunisie.osgi.loader.lib.ALoader;


/**
 *
 * @author slim
 */
public class LibCustomer extends ALoader implements ILoader {

    @Override
    public String getNameFromLib() {
        return getResourceBundle("loader").getString("contry");
    }
    @Override
     public String getNameFromLocale() {
        return java.util.ResourceBundle.getBundle("loader").getString("contry");
    }
    
    
    
    public void init(){
        System.out.println("local contry name : "+ getNameFromLocale());
        System.out.println("lib contry name : "+getNameFromLib());
    }

}
