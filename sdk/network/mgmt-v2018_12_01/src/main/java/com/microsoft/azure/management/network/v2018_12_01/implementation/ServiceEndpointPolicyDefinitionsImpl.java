/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2018_12_01.ServiceEndpointPolicyDefinitions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2018_12_01.ServiceEndpointPolicyDefinition;

class ServiceEndpointPolicyDefinitionsImpl extends WrapperImpl<ServiceEndpointPolicyDefinitionsInner> implements ServiceEndpointPolicyDefinitions {
    private final NetworkManager manager;

    ServiceEndpointPolicyDefinitionsImpl(NetworkManager manager) {
        super(manager.inner().serviceEndpointPolicyDefinitions());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public ServiceEndpointPolicyDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    private ServiceEndpointPolicyDefinitionImpl wrapModel(ServiceEndpointPolicyDefinitionInner inner) {
        return  new ServiceEndpointPolicyDefinitionImpl(inner, manager());
    }

    private ServiceEndpointPolicyDefinitionImpl wrapModel(String name) {
        return new ServiceEndpointPolicyDefinitionImpl(name, this.manager());
    }

    @Override
    public Observable<ServiceEndpointPolicyDefinition> listByResourceGroupAsync(final String resourceGroupName, final String serviceEndpointPolicyName) {
        ServiceEndpointPolicyDefinitionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName, serviceEndpointPolicyName)
        .flatMapIterable(new Func1<Page<ServiceEndpointPolicyDefinitionInner>, Iterable<ServiceEndpointPolicyDefinitionInner>>() {
            @Override
            public Iterable<ServiceEndpointPolicyDefinitionInner> call(Page<ServiceEndpointPolicyDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceEndpointPolicyDefinitionInner, ServiceEndpointPolicyDefinition>() {
            @Override
            public ServiceEndpointPolicyDefinition call(ServiceEndpointPolicyDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ServiceEndpointPolicyDefinition> getAsync(String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        ServiceEndpointPolicyDefinitionsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName)
        .map(new Func1<ServiceEndpointPolicyDefinitionInner, ServiceEndpointPolicyDefinition>() {
            @Override
            public ServiceEndpointPolicyDefinition call(ServiceEndpointPolicyDefinitionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        ServiceEndpointPolicyDefinitionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName).toCompletable();
    }

}
