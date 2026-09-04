package lj;

import android.media.MediaCodec;
import android.util.Log;
import gl.j;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ji.i;
import kj.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends fj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44628a = "H265Packet";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f44629b = new byte[8];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44630c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f44632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f44633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f44634g;

    private final int c(ByteBuffer byteBuffer) {
        int iD;
        if (byteBuffer.remaining() < 4) {
            return 0;
        }
        byte[] bArr = this.f44632e;
        byte[] bArr2 = this.f44633f;
        byte[] bArr3 = this.f44634g;
        if (bArr == null || bArr2 == null || bArr3 == null || (iD = d(byteBuffer)) == 0) {
            return 0;
        }
        byte[] bArr4 = new byte[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bArr4[i10] = 0;
        }
        bArr4[iD - 1] = 1;
        byte[] bArrY = j.y(j.y(j.y(j.y(j.y(j.y(bArr4, bArr3), bArr4), bArr), bArr4), bArr2), bArr4);
        if (byteBuffer.remaining() >= bArrY.length) {
            int length = bArrY.length;
            byte[] bArr5 = new byte[length];
            byteBuffer.get(bArr5, 0, length);
            if (Arrays.equals(bArrY, bArr5)) {
                return bArrY.length;
            }
        }
        return iD;
    }

    private final int d(ByteBuffer byteBuffer) {
        if (byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        return (byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) ? 3 : 0;
    }

    private final ByteBuffer e(ByteBuffer byteBuffer, int i10) {
        if (i10 == -1) {
            i10 = d(byteBuffer);
        }
        byteBuffer.position(i10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        s.g(byteBufferSlice, "slice(...)");
        return byteBufferSlice;
    }

    static /* synthetic */ ByteBuffer f(c cVar, ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        return cVar.e(byteBuffer, i10);
    }

    private final void h(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >>> 24);
        bArr[i10 + 1] = (byte) (i11 >>> 16);
        bArr[i10 + 2] = (byte) (i11 >>> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    @Override // fj.a
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo info, Function1 callback) {
        s.h(byteBuffer, "byteBuffer");
        s.h(info, "info");
        s.h(callback, "callback");
        ByteBuffer byteBufferK = i.k(byteBuffer, info);
        long j10 = info.presentationTimeUs / ((long) 1000);
        int iG = jj.c.HEVC.g();
        byte[] bArr = this.f44629b;
        bArr[1] = (byte) (iG >> 24);
        bArr[2] = (byte) (iG >> 16);
        bArr[3] = (byte) (iG >> 8);
        bArr[4] = (byte) iG;
        bArr[5] = (byte) 0;
        bArr[6] = (byte) 0;
        bArr[7] = (byte) 0;
        if (!this.f44631d) {
            bArr[0] = (byte) ((jj.b.KEYFRAME.g() << 4) | 128 | jj.a.SEQUENCE_START.g());
            byte[] bArr2 = this.f44632e;
            byte[] bArr3 = this.f44633f;
            byte[] bArr4 = this.f44634g;
            if (bArr2 == null || bArr3 == null || bArr4 == null) {
                Log.e(this.f44628a, "waiting for a valid sps and pps");
                return;
            }
            d dVar = new d(bArr2, bArr3, bArr4);
            int iB = dVar.b();
            byte[] bArr5 = this.f44629b;
            int length = (iB + bArr5.length) - 3;
            byte[] bArr6 = new byte[length];
            dVar.c(bArr6, bArr5.length - 3);
            byte[] bArr7 = this.f44629b;
            System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length - 3);
            callback.invoke(new fj.b(bArr6, j10, length, fj.c.VIDEO));
            this.f44631d = true;
        }
        int iC = c(byteBufferK);
        if (iC == 0) {
            return;
        }
        byteBufferK.rewind();
        ByteBuffer byteBufferE = e(byteBufferK, iC);
        int iRemaining = byteBufferE.remaining();
        int length2 = this.f44629b.length + iRemaining + this.f44630c;
        byte[] bArr8 = new byte[length2];
        int i10 = byteBufferE.get(0) >> 1;
        int iG2 = jj.b.INTER_FRAME.g();
        if (i10 == jj.d.IDR_N_LP.g() || i10 == jj.d.IDR_W_DLP.g() || i.h(info)) {
            iG2 = jj.b.KEYFRAME.g();
        } else if (i10 == jj.d.HEVC_VPS.g() || i10 == jj.d.HEVC_SPS.g() || i10 == jj.d.HEVC_PPS.g()) {
            return;
        }
        this.f44629b[0] = (byte) ((iG2 << 4) | 128 | jj.a.CODED_FRAMES.g());
        h(bArr8, this.f44629b.length, iRemaining);
        byteBufferE.get(bArr8, this.f44629b.length + this.f44630c, iRemaining);
        byte[] bArr9 = this.f44629b;
        System.arraycopy(bArr9, 0, bArr8, 0, bArr9.length);
        callback.invoke(new fj.b(bArr8, j10, length2, fj.c.VIDEO));
    }

    @Override // fj.a
    public void b(boolean z10) {
        if (z10) {
            this.f44632e = null;
            this.f44633f = null;
            this.f44634g = null;
        }
        this.f44631d = false;
    }

    public final void g(ByteBuffer sps, ByteBuffer pps, ByteBuffer vps) {
        s.h(sps, "sps");
        s.h(pps, "pps");
        s.h(vps, "vps");
        ByteBuffer byteBufferF = f(this, sps, 0, 2, null);
        ByteBuffer byteBufferF2 = f(this, pps, 0, 2, null);
        ByteBuffer byteBufferF3 = f(this, vps, 0, 2, null);
        int iRemaining = byteBufferF.remaining();
        byte[] bArr = new byte[iRemaining];
        int iRemaining2 = byteBufferF2.remaining();
        byte[] bArr2 = new byte[iRemaining2];
        int iRemaining3 = byteBufferF3.remaining();
        byte[] bArr3 = new byte[iRemaining3];
        byteBufferF.get(bArr, 0, iRemaining);
        byteBufferF2.get(bArr2, 0, iRemaining2);
        byteBufferF3.get(bArr3, 0, iRemaining3);
        this.f44632e = bArr;
        this.f44633f = bArr2;
        this.f44634g = bArr3;
    }
}
