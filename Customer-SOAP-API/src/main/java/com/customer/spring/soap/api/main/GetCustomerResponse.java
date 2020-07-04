//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilations of the source schema. 
//


package com.customer.spring.soap.api.main;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.customer.spring.soap.api.model.Customer;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}customer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customer",

})

@XmlRootElement(name = "Customer")
public class GetCustomerResponse {

    @XmlElement(required = true)
	private Customer customer;

    
    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link customer }
     *     
     */
	public Customer getCustomer() {
		return customer;
	}

	
    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link customer }
     *     
     */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
