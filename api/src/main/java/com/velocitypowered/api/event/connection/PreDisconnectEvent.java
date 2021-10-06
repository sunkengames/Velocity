/*
 * Copyright (C) 2021 Sunken Games
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.connection;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.Player;

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
