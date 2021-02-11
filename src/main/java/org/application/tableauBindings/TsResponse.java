//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.30 at 12:49:43 PM PST
//


package org.application.tableauBindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://tableau.com/api}paginatedResponseGroup"/>
 *         &lt;element name="connection" type="{http://tableau.com/api}connectionType"/>
 *         &lt;element name="connections" type="{http://tableau.com/api}connectionListType"/>
 *         &lt;element name="credentials" type="{http://tableau.com/api}tableauCredentialsType"/>
 *         &lt;element name="datasource" type="{http://tableau.com/api}dataSourceType"/>
 *         &lt;element name="error" type="{http://tableau.com/api}errorType"/>
 *         &lt;element name="favorites" type="{http://tableau.com/api}favoriteListType"/>
 *         &lt;element name="fileUpload" type="{http://tableau.com/api}fileUploadType"/>
 *         &lt;element name="group" type="{http://tableau.com/api}groupType"/>
 *         &lt;element name="job" type="{http://tableau.com/api}jobType"/>
 *         &lt;element name="permissions" type="{http://tableau.com/api}permissionsType"/>
 *         &lt;element name="project" type="{http://tableau.com/api}projectType"/>
 *         &lt;element name="site" type="{http://tableau.com/api}siteType"/>
 *         &lt;element name="tags" type="{http://tableau.com/api}tagListType"/>
 *         &lt;element name="user" type="{http://tableau.com/api}userType"/>
 *         &lt;element name="views" type="{http://tableau.com/api}viewListType"/>
 *         &lt;element name="workbook" type="{http://tableau.com/api}workbookType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pagination",
    "groups",
    "projects",
    "sites",
    "workbooks",
    "credentials",
    "error",
    "fileUpload",
    "group",
    "permissions",
    "workbook"
})
@XmlRootElement(name = "tsResponse")
public class TsResponse {

    protected PaginationType pagination;
    protected GroupListType groups;
    protected ProjectListType projects;
    protected SiteListType sites;
    protected WorkbookListType workbooks;
    protected TableauCredentialsType credentials;
    protected ErrorType error;
    protected FileUploadType fileUpload;
    protected GroupType group;
    protected PermissionsType permissions;
    protected WorkbookType workbook;

    /**
     * Gets the value of the pagination property.
     *
     * @return
     *     possible object is
     *     {@link PaginationType }
     *
     */
    public PaginationType getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     *
     * @param value
     *     allowed object is
     *     {@link PaginationType }
     *
     */
    public void setPagination(PaginationType value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the groups property.
     *
     * @return
     *     possible object is
     *     {@link GroupListType }
     *
     */
    public GroupListType getGroups() {
        return groups;
    }

    /**
     * Sets the value of the groups property.
     *
     * @param value
     *     allowed object is
     *     {@link GroupListType }
     *
     */
    public void setGroups(GroupListType value) {
        this.groups = value;
    }

    /**
     * Gets the value of the projects property.
     *
     * @return
     *     possible object is
     *     {@link ProjectListType }
     *
     */
    public ProjectListType getProjects() {
        return projects;
    }

    /**
     * Sets the value of the projects property.
     *
     * @param value
     *     allowed object is
     *     {@link ProjectListType }
     *
     */
    public void setProjects(ProjectListType value) {
        this.projects = value;
    }

    /**
     * Gets the value of the sites property.
     *
     * @return
     *     possible object is
     *     {@link SiteListType }
     *
     */
    public SiteListType getSites() {
        return sites;
    }

    /**
     * Sets the value of the sites property.
     *
     * @param value
     *     allowed object is
     *     {@link SiteListType }
     *
     */
    public void setSites(SiteListType value) {
        this.sites = value;
    }

    /**
     * Gets the value of the workbooks property.
     *
     * @return
     *     possible object is
     *     {@link WorkbookListType }
     *
     */
    public WorkbookListType getWorkbooks() {
        return workbooks;
    }

    /**
     * Sets the value of the workbooks property.
     *
     * @param value
     *     allowed object is
     *     {@link WorkbookListType }
     *
     */
    public void setWorkbooks(WorkbookListType value) {
        this.workbooks = value;
    }

    /**
     * Gets the value of the credentials property.
     *
     * @return
     *     possible object is
     *     {@link TableauCredentialsType }
     *
     */
    public TableauCredentialsType getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     *
     * @param value
     *     allowed object is
     *     {@link TableauCredentialsType }
     *
     */
    public void setCredentials(TableauCredentialsType value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return
     *     possible object is
     *     {@link ErrorType }
     *
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

    /**
     * Gets the value of the fileUpload property.
     *
     * @return
     *     possible object is
     *     {@link FileUploadType }
     *
     */
    public FileUploadType getFileUpload() {
        return fileUpload;
    }

    /**
     * Sets the value of the fileUpload property.
     *
     * @param value
     *     allowed object is
     *     {@link FileUploadType }
     *
     */
    public void setFileUpload(FileUploadType value) {
        this.fileUpload = value;
    }

    /**
     * Gets the value of the group property.
     *
     * @return
     *     possible object is
     *     {@link GroupType }
     *
     */
    public GroupType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     *
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *
     */
    public void setGroup(GroupType value) {
        this.group = value;
    }

    /**
     * Gets the value of the permissions property.
     *
     * @return
     *     possible object is
     *     {@link PermissionsType }
     *
     */
    public PermissionsType getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     *
     * @param value
     *     allowed object is
     *     {@link PermissionsType }
     *
     */
    public void setPermissions(PermissionsType value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the workbook property.
     *
     * @return
     *     possible object is
     *     {@link WorkbookType }
     *
     */
    public WorkbookType getWorkbook() {
        return workbook;
    }

    /**
     * Sets the value of the workbook property.
     *
     * @param value
     *     allowed object is
     *     {@link WorkbookType }
     *
     */
    public void setWorkbook(WorkbookType value) {
        this.workbook = value;
    }

}
