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

/**
 * @author <a href='http://commons.apache.org/'>Apache Commons Team</a>
 * @version $Revision: 561314 $
 */
public class Category {
    
    private String name;
    
    public Category() {}
    
    public Category(String name) {
        setName(name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int hashCode() {
        return 0;
    }
    
    public boolean equals(Object obj) {
        boolean result = false;
        
        if (obj instanceof Category) {
            Category category = (Category) obj;
            result = isEqual(name, category.name);
        }
        
        return result;
    }

    private boolean isEqual(String one, String two) {
        if (one == null) {
            return two == null;
        }
        
        return one.equals(two);
    }
}
