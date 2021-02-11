//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.30 at 12:49:43 PM PST
//

package org.application.tableauBindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for tableauCredentialsType complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="tableauCredentialsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="site" type="{http://tableau.com/api}siteType"/>
 *         &lt;element name="user" type="{http://tableau.com/api}userType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="token" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tableauCredentialsType", propOrder = { "site", "user" })
public class TableauCredentialsType {

    @XmlElement(required = true)
    protected SiteType site;
    protected UserType user;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "token")
    protected String token;

    /**
     * Gets the value of the site property.
     *
     * @return possible object is {@link SiteType }
     *
     */
    public SiteType getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     *
     * @param value
     *            allowed object is {@link SiteType }
     *
     */
    public void setSite(SiteType value) {
        this.site = value;
    }

    /**
     * Gets the value of the user property.
     *
     * @return possible object is {@link UserType }
     *
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value
     *            allowed object is {@link UserType }
     *
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the token property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value
     *            allowed object is {@link String }
     *
     */
    public void setToken(String value) {
        this.token = value;
    }

}
