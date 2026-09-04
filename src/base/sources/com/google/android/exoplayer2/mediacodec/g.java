package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.v0;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import ob.u;
import q9.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f17277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f17278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17279c;

    g() {
    }

    private long a(long j10) {
        return this.f17277a + Math.max(0L, ((this.f17278b - 529) * 1000000) / j10);
    }

    public long b(v0 v0Var) {
        return a(v0Var.f18882z);
    }

    public void c() {
        this.f17277a = 0L;
        this.f17278b = 0L;
        this.f17279c = false;
    }

    public long d(v0 v0Var, DecoderInputBuffer decoderInputBuffer) {
        if (this.f17278b == 0) {
            this.f17277a = decoderInputBuffer.f16756e;
        }
        if (this.f17279c) {
            return decoderInputBuffer.f16756e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ob.a.e(decoderInputBuffer.f16754c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        int iM = t.m(i10);
        if (iM != -1) {
            long jA = a(v0Var.f18882z);
            this.f17278b += (long) iM;
            return jA;
        }
        this.f17279c = true;
        this.f17278b = 0L;
        this.f17277a = decoderInputBuffer.f16756e;
        u.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return decoderInputBuffer.f16756e;
    }
}
