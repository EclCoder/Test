package lj;

import android.media.MediaCodec;
import android.util.Log;
import c1.pGX.geAgcEazw;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import gl.j;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ji.i;
import jj.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends fj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44616a = "H264Packet";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f44617b = new byte[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f44618c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f44620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f44621f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public enum a {
        SEQUENCE((byte) 0),
        NALU((byte) 1),
        EO_SEQ((byte) 2);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ ml.a f44626f = ml.b.a(d());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f44627a;

        a(byte b10) {
            this.f44627a = b10;
        }

        public final byte g() {
            return this.f44627a;
        }
    }

    private final int c(ByteBuffer byteBuffer) {
        int iD;
        if (byteBuffer.remaining() < 4) {
            return 0;
        }
        byte[] bArr = this.f44620e;
        byte[] bArr2 = this.f44621f;
        if (bArr == null || bArr2 == null || (iD = d(byteBuffer)) == 0) {
            return 0;
        }
        byte[] bArr3 = new byte[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bArr3[i10] = 0;
        }
        bArr3[iD - 1] = 1;
        byte[] bArrY = j.y(j.y(j.y(j.y(bArr3, bArr), bArr3), bArr2), bArr3);
        if (byteBuffer.remaining() >= bArrY.length) {
            int length = bArrY.length;
            byte[] bArr4 = new byte[length];
            byteBuffer.get(bArr4, 0, length);
            if (Arrays.equals(bArrY, bArr4)) {
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

    static /* synthetic */ ByteBuffer f(b bVar, ByteBuffer byteBuffer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = -1;
        }
        return bVar.e(byteBuffer, i10);
    }

    private final void h(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >>> 24);
        bArr[i10 + 1] = (byte) (i11 >>> 16);
        bArr[i10 + 2] = (byte) (i11 >>> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    @Override // fj.a
    public void b(boolean z10) {
        if (z10) {
            this.f44620e = null;
            this.f44621f = null;
        }
        this.f44619d = false;
    }

    @Override // fj.a
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo info, Function1 callback) {
        s.h(byteBuffer, obFGmWgqyy.wus);
        s.h(info, "info");
        s.h(callback, "callback");
        ByteBuffer byteBufferK = i.k(byteBuffer, info);
        long j10 = info.presentationTimeUs / ((long) 1000);
        byte[] bArr = this.f44617b;
        bArr[2] = (byte) 0;
        bArr[3] = (byte) 0;
        bArr[4] = (byte) 0;
        if (!this.f44619d) {
            bArr[0] = (byte) ((jj.b.KEYFRAME.g() << 4) | jj.c.AVC.g());
            this.f44617b[1] = a.SEQUENCE.g();
            byte[] bArr2 = this.f44620e;
            byte[] bArr3 = this.f44621f;
            if (bArr2 == null || bArr3 == null) {
                Log.e(this.f44616a, NhHRaDJCHtCTJR.DfApgEFj);
                return;
            }
            kj.c cVar = new kj.c(bArr2, bArr3);
            int iB = cVar.b();
            byte[] bArr4 = this.f44617b;
            int length = iB + bArr4.length;
            byte[] bArr5 = new byte[length];
            cVar.c(bArr5, bArr4.length);
            byte[] bArr6 = this.f44617b;
            System.arraycopy(bArr6, 0, bArr5, 0, bArr6.length);
            callback.invoke(new fj.b(bArr5, j10, length, fj.c.VIDEO));
            this.f44619d = true;
        }
        int iC = c(byteBufferK);
        if (iC == 0) {
            return;
        }
        byteBufferK.rewind();
        ByteBuffer byteBufferE = e(byteBufferK, iC);
        int iRemaining = byteBufferE.remaining();
        int length2 = this.f44617b.length + iRemaining + this.f44618c;
        byte[] bArr7 = new byte[length2];
        byte b10 = (byte) (byteBufferE.get(0) & 31);
        int iG = jj.b.INTER_FRAME.g();
        if (b10 == d.IDR.g() || i.h(info)) {
            iG = jj.b.KEYFRAME.g();
        } else if (b10 == d.SPS.g() || b10 == d.PPS.g()) {
            return;
        }
        this.f44617b[0] = (byte) ((iG << 4) | jj.c.AVC.g());
        this.f44617b[1] = a.NALU.g();
        h(bArr7, this.f44617b.length, iRemaining);
        byteBufferE.get(bArr7, this.f44617b.length + this.f44618c, iRemaining);
        byte[] bArr8 = this.f44617b;
        System.arraycopy(bArr8, 0, bArr7, 0, bArr8.length);
        callback.invoke(new fj.b(bArr7, j10, length2, fj.c.VIDEO));
    }

    public final void g(ByteBuffer byteBuffer, ByteBuffer pps) {
        s.h(byteBuffer, geAgcEazw.gLZeCrFzcGBoHs);
        s.h(pps, "pps");
        ByteBuffer byteBufferF = f(this, byteBuffer, 0, 2, null);
        ByteBuffer byteBufferF2 = f(this, pps, 0, 2, null);
        int iRemaining = byteBufferF.remaining();
        byte[] bArr = new byte[iRemaining];
        int iRemaining2 = byteBufferF2.remaining();
        byte[] bArr2 = new byte[iRemaining2];
        byteBufferF.get(bArr, 0, iRemaining);
        byteBufferF2.get(bArr2, 0, iRemaining2);
        this.f44620e = bArr;
        this.f44621f = bArr2;
    }
}
