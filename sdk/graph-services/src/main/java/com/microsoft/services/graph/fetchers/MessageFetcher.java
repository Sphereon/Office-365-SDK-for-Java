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
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  MessageFetcher.
 */
public class MessageFetcher extends OrcEntityFetcher<Message,MessageOperations> 
                                     implements Readable<Message> {

     /**
     * Instantiates a new MessageFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public MessageFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Message.class, MessageOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public MessageFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public MessageFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    public EventMessageFetcher asEventMessage(){
        return new EventMessageFetcher(this.urlComponent, this.parent);
    }   
    
     /**
     * Gets attachments.
     *
     * @return the attachments
     */
    public OrcCollectionFetcher<Attachment, AttachmentFetcher, AttachmentCollectionOperations> getAttachments() {
        return new OrcCollectionFetcher<Attachment, AttachmentFetcher, AttachmentCollectionOperations>("Attachments", this, Attachment.class, AttachmentCollectionOperations.class);
    }

    /**
     * Gets attachment.
     *
     * @return the attachment
     */
    public AttachmentFetcher getAttachment(String id){
         return new OrcCollectionFetcher<Attachment, AttachmentFetcher, AttachmentCollectionOperations>("Attachments", this, Attachment.class, AttachmentCollectionOperations.class).getById(id);
    }

}
