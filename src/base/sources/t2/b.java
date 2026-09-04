package t2;

import java.util.Objects;
import o2.e;
import o2.q;
import o2.v;
import o2.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b extends e {

    /* JADX INFO: renamed from: t2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0807b implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f53057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v.a f53059c;

        private long c(q qVar) {
            while (qVar.getPeekPosition() < qVar.getLength() - 6 && !v.h(qVar, this.f53057a, this.f53058b, this.f53059c)) {
                qVar.advancePeekPosition(1);
            }
            if (qVar.getPeekPosition() < qVar.getLength() - 6) {
                return this.f53059c.f48167a;
            }
            qVar.advancePeekPosition((int) (qVar.getLength() - qVar.getPeekPosition()));
            return this.f53057a.f48180j;
        }

        @Override // o2.e.f
        public e.C0740e b(q qVar, long j10) {
            long position = qVar.getPosition();
            long jC = c(qVar);
            long peekPosition = qVar.getPeekPosition();
            qVar.advancePeekPosition(Math.max(6, this.f53057a.f48173c));
            long jC2 = c(qVar);
            long peekPosition2 = qVar.getPeekPosition();
            if (jC > j10 || jC2 <= j10) {
                return jC2 <= j10 ? e.C0740e.f(jC2, peekPosition2) : e.C0740e.d(jC, position);
            }
            return e.C0740e.e(peekPosition);
        }

        private C0807b(y yVar, int i10) {
            this.f53057a = yVar;
            this.f53058b = i10;
            this.f53059c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new e.d() { // from class: t2.a
            @Override // o2.e.d
            public final long a(long j12) {
                return yVar.i(j12);
            }
        }, new C0807b(yVar, i10), yVar.f(), 0L, yVar.f48180j, j10, j11, yVar.d(), Math.max(6, yVar.f48173c));
        Objects.requireNonNull(yVar);
    }
}
