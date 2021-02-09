/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application gateway BackendHealthHttp settings.
 */
public class ApplicationGatewayBackendHealthHttpSettings {
    /**
     * Reference to an ApplicationGatewayBackendHttpSettings resource.
     */
    @JsonProperty(value = "backendHttpSettings")
    private ApplicationGatewayBackendHttpSettings backendHttpSettings;

    /**
     * List of ApplicationGatewayBackendHealthServer resources.
     */
    @JsonProperty(value = "servers")
    private List<ApplicationGatewayBackendHealthServer> servers;

    /**
     * Get reference to an ApplicationGatewayBackendHttpSettings resource.
     *
     * @return the backendHttpSettings value
     */
    public ApplicationGatewayBackendHttpSettings backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set reference to an ApplicationGatewayBackendHttpSettings resource.
     *
     * @param backendHttpSettings the backendHttpSettings value to set
     * @return the ApplicationGatewayBackendHealthHttpSettings object itself.
     */
    public ApplicationGatewayBackendHealthHttpSettings withBackendHttpSettings(ApplicationGatewayBackendHttpSettings backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get list of ApplicationGatewayBackendHealthServer resources.
     *
     * @return the servers value
     */
    public List<ApplicationGatewayBackendHealthServer> servers() {
        return this.servers;
    }

    /**
     * Set list of ApplicationGatewayBackendHealthServer resources.
     *
     * @param servers the servers value to set
     * @return the ApplicationGatewayBackendHealthHttpSettings object itself.
     */
    public ApplicationGatewayBackendHealthHttpSettings withServers(List<ApplicationGatewayBackendHealthServer> servers) {
        this.servers = servers;
        return this;
    }

}
