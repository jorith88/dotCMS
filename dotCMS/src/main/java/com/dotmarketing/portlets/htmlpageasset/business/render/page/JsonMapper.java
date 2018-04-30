package com.dotmarketing.portlets.htmlpageasset.business.render.page;

import com.dotmarketing.beans.Host;
import com.dotmarketing.business.Permissionable;
import com.dotmarketing.portlets.containers.model.Container;
import com.dotmarketing.portlets.contentlet.model.Contentlet;
import com.dotmarketing.portlets.htmlpageasset.model.HTMLPageAsset;
import com.dotmarketing.portlets.templates.model.Template;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Provides the appropriate JSON mapping configuration for the JSON representation of an HTML Page.
 *
 * @author Will Ezell
 * @version 4.2
 * @since Oct 9, 2017
 */
class JsonMapper {

    private JsonMapper() {

    }

    static final ObjectMapper mapper = new ObjectMapper()
            .addMixIn(Permissionable.class, PermissionableMixIn.class)
            .addMixIn(Contentlet.class, ContentletMixIn.class)
            .addMixIn(HTMLPageAsset.class, ContentletMixIn.class)
            .addMixIn(Template.class, ContentletMixIn.class)
            .addMixIn(Container.class, ContentletMixIn.class)
            .addMixIn(Host.class, ContentletMixIn.class);

}
