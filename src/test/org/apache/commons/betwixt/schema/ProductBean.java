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


package org.apache.commons.betwixt.schema;

/**
 * @author <a href='http://commons.apache.org/'>Apache Commons Team</a>
 * @version $Revision: 561314 $
 */
public class ProductBean {
    private String barcode;
    private String code;
    private String name;
    private String displayName;
    
    public ProductBean() {}
    public ProductBean(String barcode, String code, String name, String displayName) {
        setBarcode(barcode);
        setCode(code);
        setName(name);
        setDisplayName(displayName);
    }
    
    public String getBarcode() {
        return barcode;
    }

    public String getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public void setBarcode(String string) {
        barcode = string;
    }

    public void setCode(String string) {
        code = string;
    }

    public void setDisplayName(String string) {
        displayName = string;
    }

    public void setName(String string) {
        name = string;
    }
}
