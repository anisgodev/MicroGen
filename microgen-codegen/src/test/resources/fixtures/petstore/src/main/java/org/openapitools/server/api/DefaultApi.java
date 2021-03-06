package org.openapitools.server.api;

import org.openapitools.server.model.Pet;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface DefaultApi {

    /**
     * Add a new default pet to the store
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.POST
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> addDefPet(
            @javax.ws.rs.BeanParam AddDefPetParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;

    class AddDefPetParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public AddDefPetParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public AddDefPetParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }

    /**
     * Update a new Default existing pet
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("defaultpet")
    @javax.ws.rs.Consumes({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> updateDefPet(
            @javax.ws.rs.BeanParam UpdateDefPetParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid Pet pet)
            throws javax.ws.rs.WebApplicationException;

    class UpdateDefPetParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public UpdateDefPetParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public UpdateDefPetParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }
}
