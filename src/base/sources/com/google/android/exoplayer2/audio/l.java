package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f16644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f16645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final short f16646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f16648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f16649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f16650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f16651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f16654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f16655t;

    public l() {
        this(150000L, 20000L, (short) 1024);
    }

    private int h(long j10) {
        return (int) ((j10 * ((long) this.f16622b.f16454a)) / 1000000);
    }

    private int i(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f16646k);
        int i10 = this.f16647l;
        return ((iLimit / i10) * i10) + i10;
    }

    private int j(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f16646k) {
                int i10 = this.f16647l;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private void l(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        g(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f16654s = true;
        }
    }

    private void m(byte[] bArr, int i10) {
        g(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f16654s = true;
        }
    }

    private void n(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iJ = j(byteBuffer);
        int iPosition = iJ - byteBuffer.position();
        byte[] bArr = this.f16649n;
        int length = bArr.length;
        int i10 = this.f16652q;
        int i11 = length - i10;
        if (iJ < iLimit && iPosition < i11) {
            m(bArr, i10);
            this.f16652q = 0;
            this.f16651p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f16649n, this.f16652q, iMin);
        int i12 = this.f16652q + iMin;
        this.f16652q = i12;
        byte[] bArr2 = this.f16649n;
        if (i12 == bArr2.length) {
            if (this.f16654s) {
                m(bArr2, this.f16653r);
                this.f16655t += (long) ((this.f16652q - (this.f16653r * 2)) / this.f16647l);
            } else {
                this.f16655t += (long) ((i12 - this.f16653r) / this.f16647l);
            }
            r(byteBuffer, this.f16649n, this.f16652q);
            this.f16652q = 0;
            this.f16651p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void o(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f16649n.length));
        int i10 = i(byteBuffer);
        if (i10 == byteBuffer.position()) {
            this.f16651p = 1;
        } else {
            byteBuffer.limit(i10);
            l(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void p(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iJ = j(byteBuffer);
        byteBuffer.limit(iJ);
        this.f16655t += (long) (byteBuffer.remaining() / this.f16647l);
        r(byteBuffer, this.f16650o, this.f16653r);
        if (iJ < iLimit) {
            m(this.f16650o, this.f16653r);
            this.f16651p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void r(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f16653r);
        int i11 = this.f16653r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f16650o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f16650o, i11, iMin);
    }

    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f16456c == 2) {
            return this.f16648m ? aVar : AudioProcessor.a.f16453e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void d() {
        if (this.f16648m) {
            this.f16647l = this.f16622b.f16457d;
            int iH = h(this.f16644i) * this.f16647l;
            if (this.f16649n.length != iH) {
                this.f16649n = new byte[iH];
            }
            int iH2 = h(this.f16645j) * this.f16647l;
            this.f16653r = iH2;
            if (this.f16650o.length != iH2) {
                this.f16650o = new byte[iH2];
            }
        }
        this.f16651p = 0;
        this.f16655t = 0L;
        this.f16652q = 0;
        this.f16654s = false;
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void e() {
        int i10 = this.f16652q;
        if (i10 > 0) {
            m(this.f16649n, i10);
        }
        if (this.f16654s) {
            return;
        }
        this.f16655t += (long) (this.f16653r / this.f16647l);
    }

    @Override // com.google.android.exoplayer2.audio.h
    protected void f() {
        this.f16648m = false;
        this.f16653r = 0;
        byte[] bArr = r0.f48430f;
        this.f16649n = bArr;
        this.f16650o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.h, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f16648m;
    }

    public long k() {
        return this.f16655t;
    }

    public void q(boolean z10) {
        this.f16648m = z10;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !b()) {
            int i10 = this.f16651p;
            if (i10 == 0) {
                o(byteBuffer);
            } else if (i10 == 1) {
                n(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                p(byteBuffer);
            }
        }
    }

    public l(long j10, long j11, short s10) {
        ob.a.a(j11 <= j10);
        this.f16644i = j10;
        this.f16645j = j11;
        this.f16646k = s10;
        byte[] bArr = r0.f48430f;
        this.f16649n = bArr;
        this.f16650o = bArr;
    }
}
