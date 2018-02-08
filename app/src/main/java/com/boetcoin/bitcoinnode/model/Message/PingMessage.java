package com.boetcoin.bitcoinnode.model.Message;

/**
 * Created by rossbadenhorst on 2018/02/06.
 */

public class PingMessage extends BaseMessage {

    public static final String COMMAND_NAME = "ping";

    public PingMessage() {
        super();

        writePayload();
        writeHeader();
    }

    public PingMessage(byte[] header, byte[] payload) {
        super(header, payload);
    }

    @Override
    public String getCommandName() {
        return COMMAND_NAME;
    }

    @Override
    protected void readPayload() {

    }

    @Override
    protected void writePayload() {
        payload = new byte[outputPayload.size()];
        for (int i = 0; i < payload.length && i < outputPayload.size(); i++) {
            payload[i] = outputPayload.get(i).byteValue();
        }
    }
}
