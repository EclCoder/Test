package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f extends DecoderInputBuffer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f17274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17276k;

    public f() {
        super(2);
        this.f17276k = 32;
    }

    private boolean s(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!w()) {
            return true;
        }
        if (this.f17275j >= this.f17276k || decoderInputBuffer.f() != f()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f16754c;
        return byteBuffer2 == null || (byteBuffer = this.f16754c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, s9.a
    public void b() {
        super.b();
        this.f17275j = 0;
    }

    public boolean r(DecoderInputBuffer decoderInputBuffer) {
        ob.a.a(!decoderInputBuffer.o());
        ob.a.a(!decoderInputBuffer.e());
        ob.a.a(!decoderInputBuffer.g());
        if (!s(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f17275j;
        this.f17275j = i10 + 1;
        if (i10 == 0) {
            this.f16756e = decoderInputBuffer.f16756e;
            if (decoderInputBuffer.i()) {
                k(1);
            }
        }
        if (decoderInputBuffer.f()) {
            k(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f16754c;
        if (byteBuffer != null) {
            m(byteBuffer.remaining());
            this.f16754c.put(byteBuffer);
        }
        this.f17274i = decoderInputBuffer.f16756e;
        return true;
    }

    public long t() {
        return this.f16756e;
    }

    public long u() {
        return this.f17274i;
    }

    public int v() {
        return this.f17275j;
    }

    public boolean w() {
        return this.f17275j > 0;
    }

    public void x(int i10) {
        ob.a.a(i10 > 0);
        this.f17276k = i10;
    }
}
