package lj;

import android.media.MediaCodec;
import android.util.Log;
import java.nio.ByteBuffer;
import ji.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends fj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44611a = "AV1Packet";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ki.a f44612b = new ki.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f44613c = new byte[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f44615e;

    @Override // fj.a
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo info, Function1 callback) {
        s.h(byteBuffer, "byteBuffer");
        s.h(info, "info");
        s.h(callback, "callback");
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        s.g(byteBufferDuplicate, "duplicate(...)");
        ByteBuffer byteBufferK = i.k(byteBufferDuplicate, info);
        long j10 = info.presentationTimeUs / ((long) 1000);
        int iG = jj.c.AV1.g();
        byte[] bArr = this.f44613c;
        bArr[1] = (byte) (iG >> 24);
        bArr[2] = (byte) (iG >> 16);
        bArr[3] = (byte) (iG >> 8);
        bArr[4] = (byte) iG;
        if (!this.f44614d) {
            bArr[0] = (byte) ((jj.b.KEYFRAME.g() << 4) | 128 | jj.a.SEQUENCE_START.g());
            byte[] bArr2 = this.f44615e;
            if (bArr2 == null) {
                Log.e(this.f44611a, "waiting for a valid av1ConfigurationRecord");
                return;
            }
            kj.b bVar = new kj.b(bArr2);
            int iA = bVar.a();
            byte[] bArr3 = this.f44613c;
            int length = iA + bArr3.length;
            byte[] bArr4 = new byte[length];
            bVar.c(bArr4, bArr3.length);
            byte[] bArr5 = this.f44613c;
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            callback.invoke(new fj.b(bArr4, j10, length, fj.c.VIDEO));
            this.f44614d = true;
        }
        if (this.f44612b.a(byteBufferK.get(0)) == ki.c.TEMPORAL_DELIMITER) {
            byteBufferK.position(2);
            byteBufferK = byteBufferK.slice();
        }
        byteBufferK.rewind();
        int iRemaining = byteBufferK.remaining();
        int length2 = this.f44613c.length + iRemaining;
        byte[] bArr6 = new byte[length2];
        this.f44613c[0] = (byte) (((i.h(info) ? jj.b.KEYFRAME : jj.b.INTER_FRAME).g() << 4) | 128 | jj.a.CODED_FRAMES.g());
        byteBufferK.get(bArr6, this.f44613c.length, iRemaining);
        byte[] bArr7 = this.f44613c;
        System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
        callback.invoke(new fj.b(bArr6, j10, length2, fj.c.VIDEO));
    }

    @Override // fj.a
    public void b(boolean z10) {
        if (z10) {
            this.f44615e = null;
        }
        this.f44614d = false;
    }

    public final void c(ByteBuffer obuSequence) {
        s.h(obuSequence, "obuSequence");
        this.f44615e = i.o(obuSequence);
    }
}
