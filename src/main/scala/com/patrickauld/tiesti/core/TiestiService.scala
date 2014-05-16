/*
 * Copyright (C) 2007-2014 Birst, Inc. All rights reserved. 
 * BIRST PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.patrickauld.tiesti.core

import com.patrickauld.tiesti.store.PropertyStore
import com.patrickauld.tiesti.Configuration
import com.patrickauld.tiesti.Prop

/**
 * @author <a href="mailto:pauld@birst.com">Patrick Auld</a>
 * May 15, 2014
 */
class TiestiService(val store: PropertyStore) {

  def getProperties(id: String): Configuration = {
    val props = store.getProperties(id)
    val refs = props.values.filter(v => v.root.equals("ref")).map(v => v.value)
    val varables = store.getVariables(refs)
    val derefed = props.mapValues(p => {
      if(p.root equals "ref") {
        new Prop(varables.get(p.value).get, "derefed")
      } else p
    })
    
    new Configuration(derefed)
  }
}