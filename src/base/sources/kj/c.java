package kj;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f43424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f43425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43426c;

    public c(byte[] sps, byte[] pps) {
        s.h(sps, "sps");
        s.h(pps, "pps");
        this.f43424a = sps;
        this.f43425b = pps;
        this.f43426c = a(sps, pps);
    }

    private final int a(byte[] bArr, byte[] bArr2) {
        return bArr.length + 11 + bArr2.length;
    }

    public final int b() {
        return this.f43426c;
    }

    public final void c(byte[] buffer, int i10) {
        s.h(buffer, "buffer");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(buffer, i10, this.f43426c);
        byteBufferWrap.put((byte) 1);
        byteBufferWrap.put(this.f43424a[1]);
        byteBufferWrap.put(this.f43424a[2]);
        byteBufferWrap.put(this.f43424a[3]);
        byteBufferWrap.put((byte) -1);
        byteBufferWrap.put((byte) -31);
        byteBufferWrap.putShort((short) this.f43424a.length);
        byteBufferWrap.put(this.f43424a);
        byteBufferWrap.put((byte) 1);
        byteBufferWrap.putShort((short) this.f43425b.length);
        byteBufferWrap.put(this.f43425b);
    }
}
