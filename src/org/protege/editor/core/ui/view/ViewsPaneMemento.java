package org.protege.editor.core.ui.view;

import org.protege.editor.core.ui.workspace.WorkspaceTab;

import java.net.URL;
/*
 * Copyright (C) 2007, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group<br>
 * Date: 02-Mar-2007<br><br>
 */
public class ViewsPaneMemento {

    private URL initialCongigFileURL;

    private String viewPaneId;

    private boolean forceReset;


    public ViewsPaneMemento(URL initialConfigFileURL, String viewPaneId) {
        this.initialCongigFileURL = initialConfigFileURL;
        this.viewPaneId = viewPaneId;
    }


    public ViewsPaneMemento(URL initialCongigFileURL, String viewPaneId, boolean forceReset) {
        this.initialCongigFileURL = initialCongigFileURL;
        this.viewPaneId = viewPaneId;
        this.forceReset = forceReset;
    }


    public ViewsPaneMemento(WorkspaceTab workspaceTab) {
        initialCongigFileURL = workspaceTab.getDefaultViewConfigurationFile();
        viewPaneId = workspaceTab.getId();
    }


    public URL getInitialCongigFileURL() {
        return initialCongigFileURL;
    }


    public String getViewPaneId() {
        return viewPaneId;
    }


    public boolean isForceReset() {
        return forceReset;
    }


    public void setForceReset(boolean forceReset) {
        this.forceReset = forceReset;
    }
}
