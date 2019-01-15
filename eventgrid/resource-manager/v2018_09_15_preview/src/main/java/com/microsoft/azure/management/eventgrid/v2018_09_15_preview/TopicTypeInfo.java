/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_09_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.implementation.EventGridManager;
import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.implementation.TopicTypeInfoInner;
import java.util.List;

/**
 * Type representing TopicTypeInfo.
 */
public interface TopicTypeInfo extends HasInner<TopicTypeInfoInner>, HasManager<EventGridManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provider value.
     */
    String provider();

    /**
     * @return the provisioningState value.
     */
    TopicTypeProvisioningState provisioningState();

    /**
     * @return the resourceRegionType value.
     */
    ResourceRegionType resourceRegionType();

    /**
     * @return the supportedLocations value.
     */
    List<String> supportedLocations();

    /**
     * @return the type value.
     */
    String type();

}
