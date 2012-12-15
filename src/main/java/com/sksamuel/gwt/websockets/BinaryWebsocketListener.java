package com.sksamuel.gwt.websockets;

/**
 * @author Stephen Samuel
 */
public interface BinaryWebsocketListener extends WebsocketListener {

    void onMessage(byte[] bytes);
}
