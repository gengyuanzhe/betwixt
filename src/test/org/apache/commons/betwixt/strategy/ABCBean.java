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
 
package org.apache.commons.betwixt.strategy;

/**
 * @author <a href='http://commons.apache.org/'>Apache Commons Team</a>
 * @version $Revision: 561314 $
 */
public class ABCBean {
    
    private String a;
    private String b;
    private String c;
    
    public ABCBean() {}
    
    public ABCBean(String a, String b, String c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public void setA(String string) {
        a = string;
    }

    public void setB(String string) {
        b = string;
    }

    public void setC(String string) {
        c = string;
    }

}
