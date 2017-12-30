package com.creactiviti.jiccup;

import java.io.IOException;
import java.io.OutputStream;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;

public class JiccupHttpMessageConverter extends AbstractHttpMessageConverter<Html> {

  public JiccupHttpMessageConverter() {
    super(MediaType.TEXT_HTML);
  }
  
  @Override
  protected boolean supports(Class<?> aClazz) {
    return Html.class.isAssignableFrom(aClazz);
  }

  @Override
  protected Html readInternal (Class<? extends Html> aClazz, HttpInputMessage aInputMessage) {
    return null;
  }

  @Override
  protected void writeInternal (Html aHtml, HttpOutputMessage aOutputMessage) throws IOException {
    try (OutputStream outputStream = aOutputMessage.getBody()) {
      String body = aHtml.render();
      outputStream.write(body.getBytes());
      outputStream.close();
    }
  }

}
