/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The top level data export resource container.
 */
@JsonFlatten
public class DataExportInner extends ProxyResource {
    /**
     * The data export rule ID.
     */
    @JsonProperty(value = "properties.dataExportId")
    private String dataExportId;

    /**
     * An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     */
    @JsonProperty(value = "properties.tableNames", required = true)
    private List<String> tableNames;

    /**
     * The destination resource ID. This can be copied from the Properties
     * entry of the destination resource in Azure.
     */
    @JsonProperty(value = "properties.destination.resourceId", required = true)
    private String resourceId;

    /**
     * The type of the destination resource. Possible values include:
     * 'StorageAccount', 'EventHub'.
     */
    @JsonProperty(value = "properties.destination.type", access = JsonProperty.Access.WRITE_ONLY)
    private Type dataExportType;

    /**
     * Optional. Allows to define an Event Hub name. Not applicable when
     * destination is Storage Account.
     */
    @JsonProperty(value = "properties.destination.metaData.eventHubName")
    private String eventHubName;

    /**
     * Active when enabled.
     */
    @JsonProperty(value = "properties.enable")
    private Boolean enable;

    /**
     * The latest data export rule modification time.
     */
    @JsonProperty(value = "properties.createdDate")
    private String createdDate;

    /**
     * Date and time when the export was last modified.
     */
    @JsonProperty(value = "properties.lastModifiedDate")
    private String lastModifiedDate;

    /**
     * Get the data export rule ID.
     *
     * @return the dataExportId value
     */
    public String dataExportId() {
        return this.dataExportId;
    }

    /**
     * Set the data export rule ID.
     *
     * @param dataExportId the dataExportId value to set
     * @return the DataExportInner object itself.
     */
    public DataExportInner withDataExportId(String dataExportId) {
        this.dataExportId = dataExportId;
        return this;
    }

    /**
     * Get an array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     *
     * @return the tableNames value
     */
    public List<String> tableNames() {
        return this.tableNames;
    }

    /**
     * Set an array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     *
     * @param tableNames the tableNames value to set
     * @return the DataExportInner object itself.
     */
    public DataExportInner withTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    /**
     * Get the destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     *
     * @param resourceId the resourceId value to set
     * @return the DataExportInner object itself.
     */
    public DataExportInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the type of the destination resource. Possible values include: 'StorageAccount', 'EventHub'.
     *
     * @return the dataExportType value
     */
    public Type dataExportType() {
        return this.dataExportType;
    }

    /**
     * Get optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     *
     * @return the eventHubName value
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     *
     * @param eventHubName the eventHubName value to set
     * @return the DataExportInner object itself.
     */
    public DataExportInner withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Get active when enabled.
     *
     * @return the enable value
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set active when enabled.
     *
     * @param enable the enable value to set
     * @return the DataExportInner object itself.
     */
    public DataExportInner withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get the latest data export rule modification time.
     *
     * @return the createdDate value
     */
    public String createdDate() {
        return this.createdDate;
    }

    /**
     * Set the latest data export rule modification time.
     *
     * @param createdDate the createdDate value to set
     * @return the DataExportInner object itself.
     */
    public DataExportInner withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get date and time when the export was last modified.
     *
     * @return the lastModifiedDate value
     */
    public String lastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Set date and time when the export was last modified.
     *
     * @param lastModifiedDate the lastModifiedDate value to set
     * @return the DataExportInner object itself.
     */
    public DataExportInner withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

}
