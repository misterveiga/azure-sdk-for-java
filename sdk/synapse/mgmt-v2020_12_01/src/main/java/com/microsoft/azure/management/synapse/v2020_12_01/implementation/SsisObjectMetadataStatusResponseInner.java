/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The status of the operation.
 */
public class SsisObjectMetadataStatusResponseInner {
    /**
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The operation properties.
     */
    @JsonProperty(value = "properties")
    private String properties;

    /**
     * The operation error message.
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * Get the status of the operation.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of the operation.
     *
     * @param status the status value to set
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the operation name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the operation name.
     *
     * @param name the name value to set
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the operation properties.
     *
     * @return the properties value
     */
    public String properties() {
        return this.properties;
    }

    /**
     * Set the operation properties.
     *
     * @param properties the properties value to set
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withProperties(String properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the operation error message.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the operation error message.
     *
     * @param error the error value to set
     * @return the SsisObjectMetadataStatusResponseInner object itself.
     */
    public SsisObjectMetadataStatusResponseInner withError(String error) {
        this.error = error;
        return this;
    }

}
