/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.services.files.fetchers;

import com.microsoft.services.files.*;
import com.microsoft.services.orc.core.*;

/**
 * The type FilesClient.
 */
public class FilesClient extends BaseOrcContainer {

     /**
     * Instantiates a new FilesClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public FilesClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public FilesClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public FilesClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets Drive.
     *
     * @return the Drive
     */
    public OrcCollectionFetcher<Drive, DriveFetcher, DriveCollectionOperations> getDrives() {
        return new OrcCollectionFetcher<Drive, DriveFetcher, DriveCollectionOperations>("drives", this, Drive.class,DriveCollectionOperations.class);
    }
     /**
     * Gets Item.
     *
     * @return the Item
     */
    public OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations> getFiles() {
        return new OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations>("files", this, Item.class,ItemCollectionOperations.class);
    }
     /**
     * Gets drive.
     *
     * @return the drive
     */
    public DriveFetcher getDrive() {
        return new DriveFetcher("drive", this);
    }
     /**
     * Gets me.
     *
     * @return the me
     */
    public CurrentUserRequestContextFetcher getMe() {
        return new CurrentUserRequestContextFetcher("me", this);
    }
}
