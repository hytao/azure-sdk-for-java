/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NetworkInterfaceIPConfigurations.
 */
public class NetworkInterfaceIPConfigurationsInner {
    /** The Retrofit service to perform REST calls. */
    private NetworkInterfaceIPConfigurationsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of NetworkInterfaceIPConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NetworkInterfaceIPConfigurationsInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(NetworkInterfaceIPConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkInterfaceIPConfigurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkInterfaceIPConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.NetworkInterfaceIPConfigurations list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}/ipConfigurations")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("networkInterfaceName") String networkInterfaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.NetworkInterfaceIPConfigurations get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/networkInterfaces/{networkInterfaceName}/ipConfigurations/{ipConfigurationName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("networkInterfaceName") String networkInterfaceName, @Path("ipConfigurationName") String ipConfigurationName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.NetworkInterfaceIPConfigurations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object if successful.
     */
    public PagedList<NetworkInterfaceIPConfigurationInner> list(final String resourceGroupName, final String networkInterfaceName) {
        ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>> response = listSinglePageAsync(resourceGroupName, networkInterfaceName).toBlocking().single();
        return new PagedList<NetworkInterfaceIPConfigurationInner>(response.body()) {
            @Override
            public Page<NetworkInterfaceIPConfigurationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NetworkInterfaceIPConfigurationInner>> listAsync(final String resourceGroupName, final String networkInterfaceName, final ListOperationCallback<NetworkInterfaceIPConfigurationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, networkInterfaceName),
            new Func1<String, Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object
     */
    public Observable<Page<NetworkInterfaceIPConfigurationInner>> listAsync(final String resourceGroupName, final String networkInterfaceName) {
        return listWithServiceResponseAsync(resourceGroupName, networkInterfaceName)
            .map(new Func1<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>, Page<NetworkInterfaceIPConfigurationInner>>() {
                @Override
                public Page<NetworkInterfaceIPConfigurationInner> call(ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String networkInterfaceName) {
        return listSinglePageAsync(resourceGroupName, networkInterfaceName)
            .concatMap(new Func1<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>, Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> call(ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get all ip configurations in a network interface.
     *
    ServiceResponse<PageImpl<NetworkInterfaceIPConfigurationInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<NetworkInterfaceIPConfigurationInner>> * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> listSinglePageAsync(final String resourceGroupName, final String networkInterfaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (networkInterfaceName == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01";
        return service.list(resourceGroupName, networkInterfaceName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NetworkInterfaceIPConfigurationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NetworkInterfaceIPConfigurationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NetworkInterfaceIPConfigurationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NetworkInterfaceIPConfigurationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NetworkInterfaceIPConfigurationInner object if successful.
     */
    public NetworkInterfaceIPConfigurationInner get(String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        return getWithServiceResponseAsync(resourceGroupName, networkInterfaceName, ipConfigurationName).toBlocking().single().body();
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NetworkInterfaceIPConfigurationInner> getAsync(String resourceGroupName, String networkInterfaceName, String ipConfigurationName, final ServiceCallback<NetworkInterfaceIPConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, networkInterfaceName, ipConfigurationName), serviceCallback);
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceIPConfigurationInner object
     */
    public Observable<NetworkInterfaceIPConfigurationInner> getAsync(String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        return getWithServiceResponseAsync(resourceGroupName, networkInterfaceName, ipConfigurationName).map(new Func1<ServiceResponse<NetworkInterfaceIPConfigurationInner>, NetworkInterfaceIPConfigurationInner>() {
            @Override
            public NetworkInterfaceIPConfigurationInner call(ServiceResponse<NetworkInterfaceIPConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified network interface ip configuration.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NetworkInterfaceIPConfigurationInner object
     */
    public Observable<ServiceResponse<NetworkInterfaceIPConfigurationInner>> getWithServiceResponseAsync(String resourceGroupName, String networkInterfaceName, String ipConfigurationName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (networkInterfaceName == null) {
            throw new IllegalArgumentException("Parameter networkInterfaceName is required and cannot be null.");
        }
        if (ipConfigurationName == null) {
            throw new IllegalArgumentException("Parameter ipConfigurationName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01";
        return service.get(resourceGroupName, networkInterfaceName, ipConfigurationName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NetworkInterfaceIPConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<NetworkInterfaceIPConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NetworkInterfaceIPConfigurationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NetworkInterfaceIPConfigurationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NetworkInterfaceIPConfigurationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NetworkInterfaceIPConfigurationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object if successful.
     */
    public PagedList<NetworkInterfaceIPConfigurationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<NetworkInterfaceIPConfigurationInner>(response.body()) {
            @Override
            public Page<NetworkInterfaceIPConfigurationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<NetworkInterfaceIPConfigurationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<NetworkInterfaceIPConfigurationInner>> serviceFuture, final ListOperationCallback<NetworkInterfaceIPConfigurationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object
     */
    public Observable<Page<NetworkInterfaceIPConfigurationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>, Page<NetworkInterfaceIPConfigurationInner>>() {
                @Override
                public Page<NetworkInterfaceIPConfigurationInner> call(ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get all ip configurations in a network interface.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>, Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> call(ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get all ip configurations in a network interface.
     *
    ServiceResponse<PageImpl<NetworkInterfaceIPConfigurationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;NetworkInterfaceIPConfigurationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<NetworkInterfaceIPConfigurationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<NetworkInterfaceIPConfigurationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<NetworkInterfaceIPConfigurationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<NetworkInterfaceIPConfigurationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<NetworkInterfaceIPConfigurationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
