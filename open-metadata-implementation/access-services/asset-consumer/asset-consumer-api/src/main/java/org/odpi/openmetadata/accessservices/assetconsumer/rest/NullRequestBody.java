/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.assetconsumer.rest;

/**
 * NullRequestBody provides a empty request body object for POST requests that do not need to send
 * additional parameters beyond the path variables.
 */
public class NullRequestBody extends AssetConsumerOMASAPIRequestBody
{
    /**
     * Default constructor
     */
    public NullRequestBody()
    {
    }


    /**
     * Copy/clone constructor
     *
     * @param template object to copy
     */
    public NullRequestBody(AssetConsumerOMASAPIRequestBody template)
    {
        super(template);
    }


    /**
     * JSON-like toString
     *
     * @return string containing the class name
     */
    @Override
    public String toString()
    {
        return "NullRequestBody{}";
    }
}
