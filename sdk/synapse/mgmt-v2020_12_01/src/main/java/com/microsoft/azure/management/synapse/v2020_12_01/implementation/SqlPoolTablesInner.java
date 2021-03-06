/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

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
 * in SqlPoolTables.
 */
public class SqlPoolTablesInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolTablesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolTablesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolTablesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolTablesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolTables to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolTablesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTables listBySchema" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/schemas/{schemaName}/tables")
        Observable<Response<ResponseBody>> listBySchema(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("schemaName") String schemaName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTables get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/schemas/{schemaName}/tables/{tableName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("schemaName") String schemaName, @Path("tableName") String tableName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.SqlPoolTables listBySchemaNext" })
        @GET
        Observable<Response<ResponseBody>> listBySchemaNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolTableInner&gt; object if successful.
     */
    public PagedList<SqlPoolTableInner> listBySchema(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName) {
        ServiceResponse<Page<SqlPoolTableInner>> response = listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName).toBlocking().single();
        return new PagedList<SqlPoolTableInner>(response.body()) {
            @Override
            public Page<SqlPoolTableInner> nextPage(String nextPageLink) {
                return listBySchemaNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolTableInner>> listBySchemaAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final ListOperationCallback<SqlPoolTableInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(String nextPageLink) {
                    return listBySchemaNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolTableInner&gt; object
     */
    public Observable<Page<SqlPoolTableInner>> listBySchemaAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName) {
        return listBySchemaWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName)
            .map(new Func1<ServiceResponse<Page<SqlPoolTableInner>>, Page<SqlPoolTableInner>>() {
                @Override
                public Page<SqlPoolTableInner> call(ServiceResponse<Page<SqlPoolTableInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolTableInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolTableInner>>> listBySchemaWithServiceResponseAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName) {
        return listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolTableInner>>, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(ServiceResponse<Page<SqlPoolTableInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listBySchemaNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolTableInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolTableInner>>> listBySchemaSinglePageAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (schemaName == null) {
            throw new IllegalArgumentException("Parameter schemaName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.listBySchema(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, schemaName, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolTableInner>> result = listBySchemaDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolTableInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolTableInner&gt; object if successful.
     */
    public PagedList<SqlPoolTableInner> listBySchema(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String filter) {
        ServiceResponse<Page<SqlPoolTableInner>> response = listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter).toBlocking().single();
        return new PagedList<SqlPoolTableInner>(response.body()) {
            @Override
            public Page<SqlPoolTableInner> nextPage(String nextPageLink) {
                return listBySchemaNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolTableInner>> listBySchemaAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String filter, final ListOperationCallback<SqlPoolTableInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(String nextPageLink) {
                    return listBySchemaNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolTableInner&gt; object
     */
    public Observable<Page<SqlPoolTableInner>> listBySchemaAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String filter) {
        return listBySchemaWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter)
            .map(new Func1<ServiceResponse<Page<SqlPoolTableInner>>, Page<SqlPoolTableInner>>() {
                @Override
                public Page<SqlPoolTableInner> call(ServiceResponse<Page<SqlPoolTableInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolTableInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolTableInner>>> listBySchemaWithServiceResponseAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String filter) {
        return listBySchemaSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, filter)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolTableInner>>, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(ServiceResponse<Page<SqlPoolTableInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listBySchemaNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
    ServiceResponse<PageImpl<SqlPoolTableInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<SqlPoolTableInner>> * @param workspaceName The name of the workspace
    ServiceResponse<PageImpl<SqlPoolTableInner>> * @param sqlPoolName SQL pool name
    ServiceResponse<PageImpl<SqlPoolTableInner>> * @param schemaName The name of the schema.
    ServiceResponse<PageImpl<SqlPoolTableInner>> * @param filter An OData filter expression that filters elements in the collection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolTableInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolTableInner>>> listBySchemaSinglePageAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final String schemaName, final String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (schemaName == null) {
            throw new IllegalArgumentException("Parameter schemaName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listBySchema(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, schemaName, this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolTableInner>> result = listBySchemaDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolTableInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SqlPoolTableInner>> listBySchemaDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SqlPoolTableInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SqlPoolTableInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get Sql pool table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SqlPoolTableInner object if successful.
     */
    public SqlPoolTableInner get(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName).toBlocking().single().body();
    }

    /**
     * Get Sql pool table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SqlPoolTableInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName, final ServiceCallback<SqlPoolTableInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName), serviceCallback);
    }

    /**
     * Get Sql pool table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SqlPoolTableInner object
     */
    public Observable<SqlPoolTableInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName).map(new Func1<ServiceResponse<SqlPoolTableInner>, SqlPoolTableInner>() {
            @Override
            public SqlPoolTableInner call(ServiceResponse<SqlPoolTableInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get Sql pool table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @param tableName The name of the table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SqlPoolTableInner object
     */
    public Observable<ServiceResponse<SqlPoolTableInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName, String tableName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (schemaName == null) {
            throw new IllegalArgumentException("Parameter schemaName is required and cannot be null.");
        }
        if (tableName == null) {
            throw new IllegalArgumentException("Parameter tableName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, schemaName, tableName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SqlPoolTableInner>>>() {
                @Override
                public Observable<ServiceResponse<SqlPoolTableInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SqlPoolTableInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SqlPoolTableInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SqlPoolTableInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SqlPoolTableInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolTableInner&gt; object if successful.
     */
    public PagedList<SqlPoolTableInner> listBySchemaNext(final String nextPageLink) {
        ServiceResponse<Page<SqlPoolTableInner>> response = listBySchemaNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SqlPoolTableInner>(response.body()) {
            @Override
            public Page<SqlPoolTableInner> nextPage(String nextPageLink) {
                return listBySchemaNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolTableInner>> listBySchemaNextAsync(final String nextPageLink, final ServiceFuture<List<SqlPoolTableInner>> serviceFuture, final ListOperationCallback<SqlPoolTableInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listBySchemaNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(String nextPageLink) {
                    return listBySchemaNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolTableInner&gt; object
     */
    public Observable<Page<SqlPoolTableInner>> listBySchemaNextAsync(final String nextPageLink) {
        return listBySchemaNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SqlPoolTableInner>>, Page<SqlPoolTableInner>>() {
                @Override
                public Page<SqlPoolTableInner> call(ServiceResponse<Page<SqlPoolTableInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolTableInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolTableInner>>> listBySchemaNextWithServiceResponseAsync(final String nextPageLink) {
        return listBySchemaNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolTableInner>>, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(ServiceResponse<Page<SqlPoolTableInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listBySchemaNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets tables of a given schema in a SQL pool.
     * Gets tables of a given schema in a SQL pool.
     *
    ServiceResponse<PageImpl<SqlPoolTableInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolTableInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolTableInner>>> listBySchemaNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listBySchemaNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolTableInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolTableInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolTableInner>> result = listBySchemaNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolTableInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SqlPoolTableInner>> listBySchemaNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SqlPoolTableInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SqlPoolTableInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
