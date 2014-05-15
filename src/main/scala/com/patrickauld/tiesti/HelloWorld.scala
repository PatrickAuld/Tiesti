/*
 * Copyright (C) 2007-2014 Birst, Inc. All rights reserved. 
 * BIRST PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.patrickauld.tiesti

import javax.ws.rs.Path
import javax.ws.rs.GET

/**
 * @author <a href="mailto:pauld@birst.com">Patrick Auld</a>
 * May 14, 2014
 */
@Path("/")
class HelloWorld {

  @GET
  def hello(): String = {
    return "Hello World!"
  }
}