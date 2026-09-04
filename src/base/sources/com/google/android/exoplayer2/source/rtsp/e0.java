package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e0 extends nb.e implements b, s.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue f17983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f17985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17986h;

    public e0(long j10) {
        super(true);
        this.f17984f = j10;
        this.f17983e = new LinkedBlockingQueue();
        this.f17985g = new byte[0];
        this.f17986h = -1;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public String a() {
        ob.a.g(this.f17986h != -1);
        return r0.D("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f17986h), Integer.valueOf(this.f17986h + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public int c() {
        return this.f17986h;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public boolean e() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.s.b
    public void f(byte[] bArr) {
        this.f17983e.add(bArr);
    }

    @Override // nb.j
    public Uri getUri() {
        return null;
    }

    @Override // nb.j
    public long h(com.google.android.exoplayer2.upstream.a aVar) {
        this.f17986h = aVar.f18779a.getPort();
        return -1L;
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.f17985g.length);
        System.arraycopy(this.f17985g, 0, bArr, i10, iMin);
        byte[] bArr2 = this.f17985g;
        this.f17985g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i11) {
            return iMin;
        }
        try {
            byte[] bArr3 = (byte[]) this.f17983e.poll(this.f17984f, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int iMin2 = Math.min(i11 - iMin, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i10 + iMin, iMin2);
            if (iMin2 < bArr3.length) {
                this.f17985g = Arrays.copyOfRange(bArr3, iMin2, bArr3.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // nb.j
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.b
    public s.b g() {
        return this;
    }
}
