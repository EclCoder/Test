package tj;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f53429d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f53430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53432c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ByteBuffer a(ByteBuffer buffer, int i10) {
            s.h(buffer, "buffer");
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(buffer.remaining());
            List listA = e.a(buffer, new byte[]{0, 0, 3});
            s.e(byteBufferAllocateDirect);
            e.b(byteBufferAllocateDirect, buffer, 0, i10);
            int iPosition = buffer.position();
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                e.b(byteBufferAllocateDirect, buffer, iPosition, (iIntValue + 2) - iPosition);
                iPosition = iIntValue + 3;
            }
            e.b(byteBufferAllocateDirect, buffer, iPosition, buffer.limit() - iPosition);
            byteBufferAllocateDirect.limit(byteBufferAllocateDirect.position());
            byteBufferAllocateDirect.rewind();
            return byteBufferAllocateDirect;
        }

        private a() {
        }
    }

    public b(ByteBuffer buffer) {
        s.h(buffer, "buffer");
        this.f53430a = buffer;
        this.f53431b = buffer.position() * 8;
        this.f53432c = buffer.limit() * 8;
    }

    public final byte a(int i10) {
        return (byte) f(i10);
    }

    public final int b() {
        return (this.f53432c - this.f53431b) + 1;
    }

    public final boolean c() {
        return e(1) == 1;
    }

    public final boolean d() {
        return b() > 0;
    }

    public final int e(int i10) {
        return (int) f(i10);
    }

    public final long f(int i10) {
        long jF;
        if (!d()) {
            throw new IllegalStateException("No more bits to read");
        }
        int i11 = this.f53430a.get(this.f53431b / 8);
        if (i11 < 0) {
            i11 += 256;
        }
        int i12 = this.f53431b;
        int i13 = 8 - (i12 % 8);
        if (i10 <= i13) {
            jF = ((i11 << (i12 % 8)) & 255) >> ((i12 % 8) + (i13 - i10));
            this.f53431b = i12 + i10;
        } else {
            int i14 = i10 - i13;
            jF = f(i14) + (f(i13) << i14);
        }
        this.f53430a.position((int) Math.ceil(((double) this.f53431b) / ((double) 8)));
        return jF;
    }

    public final short g(int i10) {
        return (short) f(i10);
    }

    public final int h() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        if (i10 > 0) {
            return ((1 << i10) - 1) + e(i10);
        }
        return 0;
    }
}
