/*
 * Copyright (C) 2007-2014 Birst, Inc. All rights reserved. 
 * BIRST PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.patrickauld.tiesti

import javax.ws.rs.Path
import javax.ws.rs.GET
import com.patrickauld.tiesti.store.StubStore
import com.patrickauld.tiesti.core.TiestiService
import org.json4s._
import org.json4s.JsonDSL.WithBigDecimal._
import org.json4s.jackson.JsonMethods._
import org.json4s.jackson.Serialization.{read, write}
import org.json4s.Serialization
import org.json4s.jackson.Serialization


/**
 * @author <a href="mailto:pauld@birst.com">Patrick Auld</a>
 * May 14, 2014
 */
@Path("/")
class HelloWorld {

  private val service = new TiestiService(new StubStore())
  
  @GET
  def hello(): String = {
    implicit val formats = Serialization.formats(NoTypeHints)
    write(service.getProperties("a"))
  }
}