package com.example.ws.logicalhandler.server;

import java.util.Set;
import java.util.Collections;
import javax.xml.namespace.QName;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.LogicalMessage;
import javax.xml.transform.Source;
 public class Handler1 implements LogicalHandler<LogicalMessageContext>
{
  public Set<QName> getHeaders()
  {
    return Collections.emptySet();
  }

  public boolean handleMessage(LogicalMessageContext messageContext)
  {
     Boolean outboundProperty = (Boolean)
         messageContext.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);
     if (outboundProperty.booleanValue()) {
            System.out.println("\nOutbound message:");
     } else {
            System.out.println("\nInbound message:");
     }

    System.out.println("** Response: "+messageContext.getMessage().toString());
    return true;
  }

  public boolean handleFault(LogicalMessageContext messageContext)
  {
    return true;
  }

  public void close(MessageContext messageContext)
  {
  }
}