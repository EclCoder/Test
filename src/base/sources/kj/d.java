package kj;

import gl.j;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.s;
import tj.e;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f43427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f43428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f43429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43430d;

    public d(byte[] sps, byte[] pps, byte[] vps) {
        s.h(sps, "sps");
        s.h(pps, "pps");
        s.h(vps, "vps");
        this.f43427a = sps;
        this.f43428b = pps;
        this.f43429c = vps;
        this.f43430d = a(sps, pps, vps);
    }

    private final int a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return bArr3.length + 33 + bArr.length + 5 + bArr2.length;
    }

    private final void d(byte b10, byte[] bArr, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (b10 | 128));
        byteBuffer.putShort((short) 1);
        byteBuffer.putShort((short) bArr.length);
        byteBuffer.put(bArr);
    }

    public final int b() {
        return this.f43430d;
    }

    public final void c(byte[] buffer, int i10) {
        s.h(buffer, "buffer");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(buffer, i10, this.f43430d);
        byteBufferWrap.put((byte) 1);
        a aVar = new a();
        aVar.k(this.f43427a);
        byteBufferWrap.put((byte) ((aVar.h() << 6) | (aVar.i() << 5) | aVar.g()));
        byteBufferWrap.putInt(aVar.f());
        byteBufferWrap.put(j.p0(e.h(aVar.d()), g.m(2, 8)));
        byteBufferWrap.put((byte) aVar.e());
        byteBufferWrap.putShort((short) 61440);
        byteBufferWrap.put((byte) 252);
        byteBufferWrap.put((byte) (252 | aVar.c()));
        byteBufferWrap.put((byte) (aVar.b() | 248));
        byteBufferWrap.put((byte) (aVar.a() | 248));
        byteBufferWrap.putShort((short) 0);
        byteBufferWrap.put((byte) 3);
        byteBufferWrap.put((byte) 3);
        byte[] bArr = this.f43429c;
        s.e(byteBufferWrap);
        d((byte) 32, bArr, byteBufferWrap);
        d((byte) 33, this.f43427a, byteBufferWrap);
        d((byte) 34, this.f43428b, byteBufferWrap);
    }
}
