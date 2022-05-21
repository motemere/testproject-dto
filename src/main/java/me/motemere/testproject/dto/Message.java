package me.motemere.testproject.dto;

/**
 * Message DTO for testproject.
 *
 * @author motemere
 * @version 0.0.1-SNAPSHOT
 */
public class Message {

    private Integer sessionId;
    private Long entryPointTimestamp;
    private Long middleProxyTimestamp;
    private Long endProxyTimestamp;
    private Long finalTimestamp;

    public Message() {
    }

    /**
     * Getter for property 'sessionId'.
     *
     * @return the sessionId
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * Setting sessionId.
     *
     * @param id sessionId
     */
    public void setSessionId(Integer id) {
        this.sessionId = id;
    }

    /**
     * Getter for property 'entryPointTimestamp'.
     *
     * @return the entryPointTimestamp
     */
    public Long getEntryPointTimestamp() {
        return entryPointTimestamp;
    }

    /**
     * Setting entryPointTimestamp.
     *
     * @param timestamp entryPointTimestamp
     */
    public void setEntryPointTimestamp(Long timestamp) {
        this.entryPointTimestamp = timestamp;
    }

    /**
     * Getter for property 'middleProxyTimestamp'.
     *
     * @return the middleProxyTimestamp
     */
    public Long getMiddleProxyTimestamp() {
        return middleProxyTimestamp;
    }

    /**
     * Setting middleProxyTimestamp.
     *
     * @param timestamp middleProxyTimestamp
     */
    public void setMiddleProxyTimestamp(Long timestamp) {
        this.middleProxyTimestamp = timestamp;
    }

    /**
     * Getter for property 'endProxyTimestamp'.
     *
     * @return the endProxyTimestamp
     */
    public Long getEndProxyTimestamp() {
        return endProxyTimestamp;
    }

    /**
     * Setting endProxyTimestamp.
     *
     * @param timestamp endProxyTimestamp
     */
    public void setEndProxyTimestamp(Long timestamp) {
        this.endProxyTimestamp = timestamp;
    }

    /**
     * Getter for property 'finalTimestamp'.
     *
     * @return the finalTimestamp
     */
    public Long getFinalTimestamp() {
        return finalTimestamp;
    }

    /**
     * Setting finalTimestamp.
     *
     * @param timestamp finalTimestamp
     */
    public void setFinalTimestamp(Long timestamp) {
        this.finalTimestamp = timestamp;
    }

    /**
     * Override toString method.
     *
     * @return String representation of this object.
     */
    @Override
    public String toString() {
        return "{"
                + "sessionId=" + sessionId
                + ", entryPointTimestamp=" + entryPointTimestamp
                + ", middleProxyTimestamp=" + middleProxyTimestamp
                + ", endProxyTimestamp=" + endProxyTimestamp
                + ", finalTimestamp=" + finalTimestamp
                + '}';
    }

    /**
     * Make JSON string from this object.
     *
     * @return JSON string.
     */
    public String toJson() {
        return "{"
                + "\"sessionId\":" + sessionId
                + ",\"entryPointTimestamp\":" + entryPointTimestamp
                + ",\"middleProxyTimestamp\":" + middleProxyTimestamp
                + ",\"endProxyTimestamp\":" + endProxyTimestamp
                + ",\"finalTimestamp\":" + finalTimestamp
                + '}';
    }
}

