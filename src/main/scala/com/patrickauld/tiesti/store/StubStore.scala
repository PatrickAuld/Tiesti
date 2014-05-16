/*
 * Copyright (C) 2007-2014 Birst, Inc. All rights reserved. 
 * BIRST PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.patrickauld.tiesti.store

import rx.lang.scala.Observable
import com.patrickauld.tiesti.Prop

/**
 * @author <a href="mailto:pauld@birst.com">Patrick Auld</a>
 * May 15, 2014
 */
class StubStore extends PropertyStore {

  def getProperties(id:String): Map[String,Prop] = {
    return Map("lit"->new Prop("val1", "literal"),
        "ref"->new Prop("ref1", "ref"))
  }
  
  def getVariables(refs:Iterable[String]): Map[String, String] = {
    refs map { r => (r, "deref'd_" + r)} toMap
  }
}