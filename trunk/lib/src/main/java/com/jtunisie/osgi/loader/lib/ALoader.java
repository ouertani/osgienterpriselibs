package com.jtunisie.osgi.loader.lib;

import java.util.ResourceBundle;

/**
 *
 * @author slim
 */
public abstract  class ALoader {
  public static final ResourceBundle getResourceBundle(String ressource){
        return java.util.ResourceBundle.getBundle(ressource);
    }
    
}
