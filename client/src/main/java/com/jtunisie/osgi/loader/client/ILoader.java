/*
 * ILoader.java
 * 
 * Copyright (C) 2008 SAGEM Communication  All rights reserved
 * Date    :       Aug 25, 2008
 * Time    :       1:00:12 PM
 * Autor   :       Slim OUERTANI
 * Project :       VDC
 * Revision:       1
 * 
 * This document is the property of Sagem Communication.
 * Source code cannot be reproduced, nor communicated, in whole or in part,
 * without written authorization.
 * 
 * ---------+-------+-----------+-----+-----------------------------------------
 * #        | Autor | Date      | EPT |Info
 * ---------+-------+-----------+-----+-----------------------------------------
 * Creation |  SO   |25/08/2008 |  -  |
 * ---------+-------+-----------+-----+-----------------------------------------
 */
package com.jtunisie.osgi.loader.client;

/**
 *
 * @author slim
 */
public interface ILoader {

    public String getNameFromLib();
    public String getNameFromLocale();
}
