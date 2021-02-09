/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.SqlPoolMaintenanceWindowOptionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPoolMaintenanceWindowOptions.
 */
public interface SqlPoolMaintenanceWindowOptions extends HasInner<SqlPoolMaintenanceWindowOptionsInner> {
    /**
     * SQL pool's available maintenance windows.
     * Get list of SQL pool's available maintenance windows.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param maintenanceWindowOptionsName Maintenance window options name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MaintenanceWindowOptions> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String maintenanceWindowOptionsName);

}
