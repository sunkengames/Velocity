/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.connection;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.Player;

/**
 * This event is fired when a player disconnects from the proxy but before disconnecting from
 * their current server.
 */
public final class PreDisconnectEvent {

  private final Player player;

  public PreDisconnectEvent(Player player) {
    this.player = Preconditions.checkNotNull(player, "player");
  }

  public Player getPlayer() {
    return player;
  }

  @Override
  public String toString() {
    return "PreDisconnectEvent{"
        + "player=" + player
        + '}';
  }
}
