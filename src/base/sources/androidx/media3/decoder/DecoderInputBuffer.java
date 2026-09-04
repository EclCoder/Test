package androidx.media3.decoder;

import b2.a;
import b2.c;
import java.nio.ByteBuffer;
import t1.o;
import t1.s;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f4862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f4863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f4864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f4867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f4868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f4869i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4871b;

        public InsufficientCapacityException(int i10, int i11) {
            super(CIdIVqKnNZ.mdg + i10 + " < " + i11 + ")");
            this.f4870a = i10;
            this.f4871b = i11;
        }
    }

    static {
        s.a("media3.decoder");
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    private ByteBuffer j(int i10) {
        int i11 = this.f4868h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f4864d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static DecoderInputBuffer n() {
        return new DecoderInputBuffer(0);
    }

    @Override // b2.a
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f4864d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f4867g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f4865e = false;
    }

    public void k(int i10) {
        int i11 = i10 + this.f4869i;
        ByteBuffer byteBuffer = this.f4864d;
        if (byteBuffer == null) {
            this.f4864d = j(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f4864d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferJ = j(i12);
        byteBufferJ.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferJ.put(byteBuffer);
        }
        this.f4864d = byteBufferJ;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f4864d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f4867g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean m() {
        return c(1073741824);
    }

    public void o(int i10) {
        ByteBuffer byteBuffer = this.f4867g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f4867g = ByteBuffer.allocate(i10);
        } else {
            this.f4867g.clear();
        }
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f4863c = new c();
        this.f4868h = i10;
        this.f4869i = i11;
    }
}
