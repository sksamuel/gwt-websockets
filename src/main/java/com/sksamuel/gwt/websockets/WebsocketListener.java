package com.sksamuel.gwt.websockets;

/**
 * @author Stephen K Samuel samspade79@gmail.com 14 Sep 2012 08:58:10
 */
public interface WebsocketListener {

    void onClose();

    void onMessage(String msg);

    void onOpen();
}
