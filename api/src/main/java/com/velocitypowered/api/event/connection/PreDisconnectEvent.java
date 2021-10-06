/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.connection;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.server.RegisteredServer;

/**
 * This event is fired before disconnecting from the proxy.
 */
public final class PreDisconnectEvent {

  private final Player player;
  private final RegisteredServer server;

  public PreDisconnectEvent(Player player, RegisteredServer server) {
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
    return "PreDisconnectEvent{"
        + "player=" + player
        + ", server=" + server
        + '}';
  }
}
