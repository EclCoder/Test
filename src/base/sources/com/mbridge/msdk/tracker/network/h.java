package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h<T> extends t<T> {
    protected static final String B = "h";
    private boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f33785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map<String, String> f33786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Map<String, String> f33787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x f33788z;

    public h(int i10, String str, int i11, String str2, long j10) {
        super(i10, str, i11, str2);
        this.A = false;
        if (j10 > 0) {
            this.f33785w = j10;
        } else {
            this.f33785w = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f33786x == null) {
            this.f33786x = new HashMap();
        }
        try {
            this.f33786x.putAll(map);
        } catch (Exception e10) {
            q0.b(B, "addParams error: " + e10.getMessage());
        }
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f33787y == null) {
            this.f33787y = new HashMap();
        }
        try {
            this.f33787y.put(str, str2);
        } catch (Exception e10) {
            q0.b(B, "addHeader error: " + e10.getMessage());
        }
    }

    public void d(boolean z10) {
        this.A = z10;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        if (this.f33787y == null) {
            this.f33787y = new HashMap();
        }
        this.f33787y.put("Charset", C.UTF8_NAME);
        return this.f33787y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    protected Map<String, String> i() {
        if (this.f33786x == null) {
            this.f33786x = new HashMap();
        }
        return this.f33786x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public x o() {
        if (this.f33788z == null) {
            this.f33788z = new e(30000, this.f33785w, 3);
        }
        return this.f33788z;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return this.A && com.mbridge.msdk.foundation.same.d.a(p(), t());
    }
}
