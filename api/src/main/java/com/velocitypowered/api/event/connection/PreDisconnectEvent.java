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
