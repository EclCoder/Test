package ij;

import android.media.MediaCodec;
import gj.c;
import gj.d;
import gj.e;
import java.nio.ByteBuffer;
import ji.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends fj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f41473a = new byte[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f41474b = c.SND_16_BIT;

    public static /* synthetic */ void d(b bVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = c.SND_16_BIT;
        }
        bVar.c(cVar);
    }

    @Override // fj.a
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo info, Function1 callback) {
        s.h(byteBuffer, "byteBuffer");
        s.h(info, "info");
        s.h(callback, "callback");
        ByteBuffer byteBufferK = i.k(byteBuffer, info);
        this.f41473a[0] = (byte) (((byte) (((byte) (e.MONO.g() | ((byte) (this.f41474b.g() << 1)))) | ((byte) (d.SR_5_5K.g() << 2)))) | ((byte) (gj.a.G711_A.g() << 4)));
        int iRemaining = byteBufferK.remaining();
        byte[] bArr = this.f41473a;
        int length = iRemaining + bArr.length;
        byte[] bArr2 = new byte[length];
        byteBufferK.get(bArr2, bArr.length, byteBufferK.remaining());
        byte[] bArr3 = this.f41473a;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        callback.invoke(new fj.b(bArr2, info.presentationTimeUs / ((long) 1000), length, fj.c.AUDIO));
    }

    public final void c(c audioSize) {
        s.h(audioSize, "audioSize");
        this.f41474b = audioSize;
    }

    @Override // fj.a
    public void b(boolean z10) {
    }
}
