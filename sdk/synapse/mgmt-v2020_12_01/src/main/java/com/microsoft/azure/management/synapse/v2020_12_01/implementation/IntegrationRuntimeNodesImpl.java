/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2020_12_01.IntegrationRuntimeNodes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.synapse.v2020_12_01.SelfHostedIntegrationRuntimeNode;

class IntegrationRuntimeNodesImpl extends WrapperImpl<IntegrationRuntimeNodesInner> implements IntegrationRuntimeNodes {
    private final SynapseManager manager;

    IntegrationRuntimeNodesImpl(SynapseManager manager) {
        super(manager.inner().integrationRuntimeNodes());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private SelfHostedIntegrationRuntimeNodeImpl wrapModel(SelfHostedIntegrationRuntimeNodeInner inner) {
        return  new SelfHostedIntegrationRuntimeNodeImpl(inner, manager());
    }

    @Override
    public Observable<SelfHostedIntegrationRuntimeNode> updateAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        IntegrationRuntimeNodesInner client = this.inner();
        return client.updateAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName)
        .map(new Func1<SelfHostedIntegrationRuntimeNodeInner, SelfHostedIntegrationRuntimeNode>() {
            @Override
            public SelfHostedIntegrationRuntimeNode call(SelfHostedIntegrationRuntimeNodeInner inner) {
                return new SelfHostedIntegrationRuntimeNodeImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SelfHostedIntegrationRuntimeNode> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        IntegrationRuntimeNodesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName)
        .flatMap(new Func1<SelfHostedIntegrationRuntimeNodeInner, Observable<SelfHostedIntegrationRuntimeNode>>() {
            @Override
            public Observable<SelfHostedIntegrationRuntimeNode> call(SelfHostedIntegrationRuntimeNodeInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SelfHostedIntegrationRuntimeNode)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName) {
        IntegrationRuntimeNodesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, integrationRuntimeName, nodeName).toCompletable();
    }

}
