/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icttec.chatapplication.server;

import com.icttec.chatapplication.service.Chat;

/**
 *
 * @author KA VI YA
 */
public interface ServerDAO {
    public void startServer(int groupID);
    public void stopServer();
}
