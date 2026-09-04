package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import o9.n;
import s9.a;
import s9.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f16754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f16757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f16758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16759h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16761b;

        public InsufficientCapacityException(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f16760a = i10;
            this.f16761b = i11;
        }
    }

    static {
        n.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    private ByteBuffer l(int i10) {
        int i11 = this.f16758g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f16754c;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static DecoderInputBuffer p() {
        return new DecoderInputBuffer(0);
    }

    @Override // s9.a
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f16754c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f16757f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f16755d = false;
    }

    public void m(int i10) {
        int i11 = i10 + this.f16759h;
        ByteBuffer byteBuffer = this.f16754c;
        if (byteBuffer == null) {
            this.f16754c = l(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f16754c = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i12);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f16754c = byteBufferL;
    }

    public final void n() {
        ByteBuffer byteBuffer = this.f16754c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f16757f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean o() {
        return d(1073741824);
    }

    public void q(int i10) {
        ByteBuffer byteBuffer = this.f16757f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f16757f = ByteBuffer.allocate(i10);
        } else {
            this.f16757f.clear();
        }
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f16753b = new c();
        this.f16758g = i10;
        this.f16759h = i11;
    }
}
