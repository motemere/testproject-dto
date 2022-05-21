package me.motemere.testproject.dto;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@SuppressWarnings("MagicNumber")
class MessageTest {

    @Test
    @DisplayName("Message to json")
    void toJson() {
        Message message = new Message();
        message.setSessionId(1);
        message.setEntryPointTimestamp(1L);
        message.setMiddleProxyTimestamp(2L);
        message.setEndProxyTimestamp(3L);
        message.setFinalTimestamp(4L);

        String json = message.toJson();

        assertNotNull(json);
        assertEquals(
                "{\"sessionId\":1,"
                        + "\"entryPointTimestamp\":1,"
                        + "\"middleProxyTimestamp\":2,"
                        + "\"endProxyTimestamp\":3,"
                        + "\"finalTimestamp\":4}",
                json);
    }
}
