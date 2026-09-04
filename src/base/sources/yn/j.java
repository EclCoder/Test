package yn;

import java.io.EOFException;
import java.io.IOException;
import xn.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends xn.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f58121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f58123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q0 delegate, long j10, boolean z10) {
        super(delegate);
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f58121a = j10;
        this.f58122b = z10;
    }

    private final void a(xn.e eVar, long j10) throws EOFException {
        xn.e eVar2 = new xn.e();
        eVar2.C0(eVar);
        eVar.W(eVar2, j10);
        eVar2.k();
    }

    @Override // xn.o, xn.q0
    public long read(xn.e sink, long j10) throws IOException {
        kotlin.jvm.internal.s.h(sink, "sink");
        long j11 = this.f58123c;
        long j12 = this.f58121a;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f58122b) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long j14 = super.read(sink, j10);
        if (j14 != -1) {
            this.f58123c += j14;
        }
        long j15 = this.f58123c;
        long j16 = this.f58121a;
        if ((j15 >= j16 || j14 != -1) && j15 <= j16) {
            return j14;
        }
        if (j14 > 0 && j15 > j16) {
            a(sink, sink.size() - (this.f58123c - this.f58121a));
        }
        throw new IOException("expected " + this.f58121a + " bytes but got " + this.f58123c);
    }
}
