package com.example.Notification;

import com.fasterxml.jackson.databind.JsonSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;

import static com.example.Notification.Constant.DATE_FORMAT;


@Component
public class DateSerializer extends JsonSerializer<Date> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateSerializer.class);

    @Override
    public void serialize(final Date value, final com.fasterxml.jackson.core.JsonGenerator jgen, final com.fasterxml.jackson.databind.SerializerProvider provider) throws IOException {
        try {
            String formattedDate = DATE_FORMAT.format(value);
            jgen.writeString(formattedDate);
        } catch (IOException e) {
            final String msg = "Error while Serializing date: " + value;
            LOGGER.error(msg);
            throw new IOException(msg, e);
        }
    }
}
