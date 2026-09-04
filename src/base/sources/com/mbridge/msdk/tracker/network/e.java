package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f33774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33776d;

    public e() {
        this(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f33774b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f33773a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f33775c;
    }

    public e(int i10, int i11) {
        this(i10, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f33775c + 1;
        this.f33775c = i10;
        return i10 <= this.f33776d;
    }

    public e(int i10, long j10, int i11) {
        this.f33774b = j10;
        this.f33773a = i10;
        this.f33776d = i11;
    }
}
