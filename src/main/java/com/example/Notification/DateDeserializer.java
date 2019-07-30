package com.example.Notification;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import static com.example.Notification.Constant.DATE_FORMAT;

public class DateDeserializer extends JsonDeserializer<Date> {

    private static final Logger LOGGER = LoggerFactory.getLogger(DateDeserializer.class);

    @Override
    public Date deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException {
        try {
            return DATE_FORMAT.parse(jp.getValueAsString());
        } catch (ParseException e) {
            final String msg = "Error while deserializing date: " + jp.getValueAsString();
            LOGGER.error(msg);
            throw new IOException(msg, e);
        }
    }
}
