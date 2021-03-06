/**
 * ***************************************************************************** Copyright (c) 2009
 * CollabNet. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * <p>Contributors: CollabNet - initial API and implementation
 * ****************************************************************************
 */
package com.collabnet.subversion.merge;

import org.eclipse.core.runtime.IAdaptable;

public class AdaptableMergeResultsFolder extends MergeResultsFolder implements IAdaptable {

  public Object getAdapter(Class adapter) {
    Object object = new MergeAdapterFactory().getAdapter(this, adapter);
    return object;
  }
}
