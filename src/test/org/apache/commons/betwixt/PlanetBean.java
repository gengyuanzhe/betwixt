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

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href='http://commons.apache.org'>Apache Commons Team</a>, <a href='http://www.apache.org'>Apache Software Foundation</a>
 */
public class PlanetBean {
    
    protected String name;
    protected List moons = new ArrayList();

    /**
     * @param name
     */
    public PlanetBean(String name) {
        super();
        this.name = name;
    }
    
    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }
    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return Returns the moons.
     */
    public List getMoons() {
        return moons;
    }
    
    public void addMoon(MoonBean moon) {
        this.moons.add(moon);
    }
}
