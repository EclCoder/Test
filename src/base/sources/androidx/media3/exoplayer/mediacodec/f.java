package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f extends DecoderInputBuffer {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5607l;

    public f() {
        super(2);
        this.f5607l = 32;
    }

    private boolean q(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!u()) {
            return true;
        }
        if (this.f5606k >= this.f5607l) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f4864d;
        return byteBuffer2 == null || (byteBuffer = this.f4864d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, b2.a
    public void b() {
        super.b();
        this.f5606k = 0;
    }

    public boolean p(DecoderInputBuffer decoderInputBuffer) {
        w1.a.a(!decoderInputBuffer.m());
        w1.a.a(!decoderInputBuffer.d());
        w1.a.a(!decoderInputBuffer.e());
        if (!q(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f5606k;
        this.f5606k = i10 + 1;
        if (i10 == 0) {
            this.f4866f = decoderInputBuffer.f4866f;
            if (decoderInputBuffer.g()) {
                i(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f4864d;
        if (byteBuffer != null) {
            k(byteBuffer.remaining());
            this.f4864d.put(byteBuffer);
        }
        this.f5605j = decoderInputBuffer.f4866f;
        return true;
    }

    public long r() {
        return this.f4866f;
    }

    public long s() {
        return this.f5605j;
    }

    public int t() {
        return this.f5606k;
    }

    public boolean u() {
        return this.f5606k > 0;
    }

    public void v(int i10) {
        w1.a.a(i10 > 0);
        this.f5607l = i10;
    }
}
