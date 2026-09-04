package x9;

import java.util.Objects;
import u9.l;
import u9.q;
import u9.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends u9.a {

    /* JADX INFO: renamed from: x9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0872b implements u9.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f56790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f56791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q.a f56792c;

        private long c(l lVar) {
            while (lVar.getPeekPosition() < lVar.getLength() - 6 && !q.h(lVar, this.f56790a, this.f56791b, this.f56792c)) {
                lVar.advancePeekPosition(1);
            }
            if (lVar.getPeekPosition() < lVar.getLength() - 6) {
                return this.f56792c.f54306a;
            }
            lVar.advancePeekPosition((int) (lVar.getLength() - lVar.getPeekPosition()));
            return this.f56790a.f54319j;
        }

        @Override // u9.a.f
        public u9.a.e b(l lVar, long j10) {
            long position = lVar.getPosition();
            long jC = c(lVar);
            long peekPosition = lVar.getPeekPosition();
            lVar.advancePeekPosition(Math.max(6, this.f56790a.f54312c));
            long jC2 = c(lVar);
            long peekPosition2 = lVar.getPeekPosition();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? u9.a.e.f(jC2, peekPosition2) : u9.a.e.d(jC, position);
            }
            return u9.a.e.e(peekPosition);
        }

        private C0872b(t tVar, int i10) {
            this.f56790a = tVar;
            this.f56791b = i10;
            this.f56792c = new q.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final t tVar, int i10, long j10, long j11) {
        super(new u9.a.d() { // from class: x9.a
            @Override // u9.a.d
            public final long a(long j12) {
                return tVar.i(j12);
            }
        }, new C0872b(tVar, i10), tVar.f(), 0L, tVar.f54319j, j10, j11, tVar.d(), Math.max(6, tVar.f54312c));
        Objects.requireNonNull(tVar);
    }
}
