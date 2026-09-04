package com.mbridge.msdk.playercommon.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface ControlDispatcher {
    boolean dispatchSeekTo(Player player, int i10, long j10);

    boolean dispatchSetPlayWhenReady(Player player, boolean z10);

    boolean dispatchSetRepeatMode(Player player, int i10);

    boolean dispatchSetShuffleModeEnabled(Player player, boolean z10);

    boolean dispatchStop(Player player, boolean z10);
}
