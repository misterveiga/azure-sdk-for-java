/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.VpnSiteLinkConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VpnSiteLinkConnections.
 */
public interface VpnSiteLinkConnections extends HasInner<VpnSiteLinkConnectionsInner> {
    /**
     * Retrieves the details of a vpn site link connection.
     *
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VpnConnectionVpnGatewayVpnSiteLinkConnection> getAsync(String resourceGroupName, String gatewayName, String connectionName, String linkConnectionName);

}
