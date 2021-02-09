/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_08_01.implementation.HubRouteTableInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_08_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing HubRouteTable.
 */
public interface HubRouteTable extends HasInner<HubRouteTableInner>, Indexable, Refreshable<HubRouteTable>, Updatable<HubRouteTable.Update>, HasManager<NetworkManager> {
    /**
     * @return the associatedConnections value.
     */
    List<String> associatedConnections();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the labels value.
     */
    List<String> labels();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the propagatingConnections value.
     */
    List<String> propagatingConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routes value.
     */
    List<HubRoute> routes();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the HubRouteTable definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualHub, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of HubRouteTable definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a HubRouteTable definition.
         */
        interface Blank extends WithVirtualHub {
        }

        /**
         * The stage of the hubroutetable definition allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
           /**
            * Specifies resourceGroupName, virtualHubName.
            * @param resourceGroupName The resource group name of the VirtualHub
            * @param virtualHubName The name of the VirtualHub
            * @return the next definition stage
            */
            WithCreate withExistingVirtualHub(String resourceGroupName, String virtualHubName);
        }

        /**
         * The stage of the hubroutetable definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the hubroutetable definition allowing to specify Labels.
         */
        interface WithLabels {
            /**
             * Specifies labels.
             * @param labels List of labels associated with this route table
             * @return the next definition stage
             */
            WithCreate withLabels(List<String> labels);
        }

        /**
         * The stage of the hubroutetable definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the hubroutetable definition allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             * @param routes List of all routes
             * @return the next definition stage
             */
            WithCreate withRoutes(List<HubRoute> routes);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<HubRouteTable>, DefinitionStages.WithId, DefinitionStages.WithLabels, DefinitionStages.WithName, DefinitionStages.WithRoutes {
        }
    }
    /**
     * The template for a HubRouteTable update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<HubRouteTable>, UpdateStages.WithId, UpdateStages.WithLabels, UpdateStages.WithName, UpdateStages.WithRoutes {
    }

    /**
     * Grouping of HubRouteTable update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the hubroutetable update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the hubroutetable update allowing to specify Labels.
         */
        interface WithLabels {
            /**
             * Specifies labels.
             * @param labels List of labels associated with this route table
             * @return the next update stage
             */
            Update withLabels(List<String> labels);
        }

        /**
         * The stage of the hubroutetable update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the hubroutetable update allowing to specify Routes.
         */
        interface WithRoutes {
            /**
             * Specifies routes.
             * @param routes List of all routes
             * @return the next update stage
             */
            Update withRoutes(List<HubRoute> routes);
        }

    }
}
