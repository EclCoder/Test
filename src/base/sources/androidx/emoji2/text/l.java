package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class l {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f3907a;

        a(ByteBuffer byteBuffer) {
            this.f3907a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public int a() {
            return this.f3907a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long b() {
            return l.c(this.f3907a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f3907a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.f3907a.getShort());
        }

        @Override // androidx.emoji2.text.l.c
        public void skip(int i10) {
            ByteBuffer byteBuffer = this.f3907a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f3908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f3909b;

        b(long j10, long j11) {
            this.f3908a = j10;
            this.f3909b = j11;
        }

        long a() {
            return this.f3908a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        int a();

        long b();

        long getPosition();

        int readUnsignedShort();

        void skip(int i10);
    }

    private static b a(c cVar) throws IOException {
        long jB;
        cVar.skip(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.skip(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jB = -1;
                break;
            }
            int iA = cVar.a();
            cVar.skip(4);
            jB = cVar.b();
            cVar.skip(4);
            if (1835365473 == iA) {
                break;
            }
            i10++;
        }
        if (jB != -1) {
            cVar.skip((int) (jB - cVar.getPosition()));
            cVar.skip(12);
            long jB2 = cVar.b();
            for (int i11 = 0; i11 < jB2; i11++) {
                int iA2 = cVar.a();
                long jB3 = cVar.b();
                long jB4 = cVar.b();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new b(jB3 + jB, jB4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static g1.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return g1.b.h(byteBufferDuplicate);
    }

    static long c(int i10) {
        return ((long) i10) & 4294967295L;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
