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
public final class a extends fj.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41463b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f41462a = new byte[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41464c = 44100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41465d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f41466e = c.SND_16_BIT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gj.b f41467f = gj.b.AAC_LC;

    /* JADX INFO: renamed from: ij.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum EnumC0628a {
        SEQUENCE((byte) 0),
        RAW((byte) 1);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ ml.a f41471e = ml.b.a(d());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f41472a;

        EnumC0628a(byte b10) {
            this.f41472a = b10;
        }

        public final byte g() {
            return this.f41472a;
        }
    }

    public static /* synthetic */ void d(a aVar, int i10, boolean z10, c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cVar = c.SND_16_BIT;
        }
        aVar.c(i10, z10, cVar);
    }

    @Override // fj.a
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo info, Function1 callback) {
        d dVar;
        byte[] bArr;
        s.h(byteBuffer, "byteBuffer");
        s.h(info, "info");
        s.h(callback, "callback");
        ByteBuffer byteBufferK = i.k(byteBuffer, info);
        byte bG = (this.f41465d ? e.STEREO : e.MONO).g();
        int i10 = this.f41464c;
        if (i10 == 5500) {
            dVar = d.SR_5_5K;
        } else if (i10 == 11025) {
            dVar = d.SR_11K;
        } else if (i10 != 22050) {
            dVar = i10 != 44100 ? d.SR_44_1K : d.SR_44_1K;
        } else {
            dVar = d.SR_22K;
        }
        this.f41462a[0] = (byte) (((byte) (((byte) (bG | ((byte) (this.f41466e.g() << 1)))) | ((byte) (dVar.g() << 2)))) | ((byte) (gj.a.AAC.g() << 4)));
        if (this.f41463b) {
            this.f41462a[1] = EnumC0628a.RAW.g();
            int iRemaining = byteBufferK.remaining();
            byte[] bArr2 = this.f41462a;
            bArr = new byte[iRemaining + bArr2.length];
            byteBufferK.get(bArr, bArr2.length, byteBufferK.remaining());
        } else {
            hj.a aVar = new hj.a(this.f41467f.g(), this.f41464c, this.f41465d ? 2 : 1);
            int iB = aVar.b();
            byte[] bArr3 = this.f41462a;
            bArr = new byte[iB + bArr3.length];
            bArr3[1] = EnumC0628a.SEQUENCE.g();
            aVar.c(bArr, this.f41462a.length);
            this.f41463b = true;
        }
        byte[] bArr4 = bArr;
        byte[] bArr5 = this.f41462a;
        System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
        callback.invoke(new fj.b(bArr4, info.presentationTimeUs / ((long) 1000), bArr4.length, fj.c.AUDIO));
    }

    @Override // fj.a
    public void b(boolean z10) {
        this.f41463b = false;
    }

    public final void c(int i10, boolean z10, c audioSize) {
        s.h(audioSize, "audioSize");
        this.f41464c = i10;
        this.f41465d = z10;
        this.f41466e = audioSize;
    }
}
