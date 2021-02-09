/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.network.v2020_08_01.implementation.VirtualHubsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualHubs.
 */
public interface VirtualHubs extends SupportsCreating<VirtualHub.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<VirtualHub>, SupportsListingByResourceGroup<VirtualHub>, SupportsListing<VirtualHub>, HasInner<VirtualHubsInner> {
    /**
     * Gets the effective routes configured for the Virtual Hub resource or the specified resource .
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEffectiveVirtualHubRoutesAsync(String resourceGroupName, String virtualHubName);

}
