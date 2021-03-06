/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
 
package org.apache.commons.betwixt;

import java.util.Map;
import java.util.TreeMap;

/** <p><code>MapBean</code> is a sample bean used for testing maps.</p>
  *
  * @author <a href="mailto:rdonkin@apache.org">Robert Burrell Donkin</a>
  * @version $Revision: 438373 $
  */
public class MapBean {
    
    private String title = "**UNSET**";
    
    private Map addresses = new TreeMap();
    
    public MapBean() {}
    
    public MapBean(String title) {
        setTitle(title);
    }	
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }	
    
    public Map getAddresses() {
        return addresses;
    }	
    
    public void addAddress(String name, AddressBean address) {
        addresses.put(name, address);
    }
}
