/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.player;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.server.RegisteredServer;

/**
 * This event is fired before disconnecting from their current server.
 */
public final class ServerPreDisconnectEvent {

  private final Player player;
  private final RegisteredServer server;

  public ServerPreDisconnectEvent(Player player, RegisteredServer server) {
    this.player = Preconditions.checkNotNull(player, "player");
    this.server = Preconditions.checkNotNull(server, "server");
  }

  public Player getPlayer() {
    return player;
  }

  public RegisteredServer getServer() {
    return server;
  }

  @Override
  public String toString() {
    return "ServerPreDisconnectEvent{"
        + "player=" + player
        + ", server=" + server
        + '}';
  }
}
