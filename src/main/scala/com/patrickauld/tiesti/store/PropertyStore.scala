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
trait PropertyStore {

  def getProperties(id: String): Map[String, Prop]
  
  def getVariables(refs:Iterable[String]): Map[String, String]
}