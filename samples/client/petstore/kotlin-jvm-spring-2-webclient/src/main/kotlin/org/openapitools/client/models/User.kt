/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.fasterxml.jackson.annotation.JsonEnumDefaultValue
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A User who is purchasing from the pet store
 *
 * @param id 
 * @param username 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param password 
 * @param phone 
 * @param userStatus User Status
 */


data class User (

    @get:JsonProperty("id")
    val id: kotlin.Long? = null,

    @get:JsonProperty("username")
    val username: kotlin.String? = null,

    @get:JsonProperty("firstName")
    val firstName: kotlin.String? = null,

    @get:JsonProperty("lastName")
    val lastName: kotlin.String? = null,

    @get:JsonProperty("email")
    val email: kotlin.String? = null,

    @get:JsonProperty("password")
    val password: kotlin.String? = null,

    @get:JsonProperty("phone")
    val phone: kotlin.String? = null,

    /* User Status */
    @get:JsonProperty("userStatus")
    val userStatus: kotlin.Int? = null

) {


}

