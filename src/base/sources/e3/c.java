package e3;

import java.nio.ByteBuffer;
import w1.t;
import w1.u;
import w1.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends x2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f37062a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f37063b = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private z f37064c;

    @Override // x2.c
    protected t1.u b(x2.b bVar, ByteBuffer byteBuffer) {
        t1.u.b eVar;
        z zVar = this.f37064c;
        if (zVar == null || bVar.f56622j != zVar.f()) {
            z zVar2 = new z(bVar.f4866f);
            this.f37064c = zVar2;
            zVar2.a(bVar.f4866f - bVar.f56622j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f37062a.R(bArrArray, iLimit);
        this.f37063b.o(bArrArray, iLimit);
        this.f37063b.r(39);
        long jH = (((long) this.f37063b.h(1)) << 32) | ((long) this.f37063b.h(32));
        this.f37063b.r(20);
        int iH = this.f37063b.h(12);
        int iH2 = this.f37063b.h(8);
        this.f37062a.U(14);
        if (iH2 == 0) {
            eVar = new e();
        } else if (iH2 == 255) {
            eVar = a.a(this.f37062a, iH, jH);
        } else if (iH2 == 4) {
            eVar = f.a(this.f37062a);
        } else if (iH2 != 5) {
            eVar = iH2 != 6 ? null : g.a(this.f37062a, jH, this.f37064c);
        } else {
            eVar = d.a(this.f37062a, jH, this.f37064c);
        }
        return eVar == null ? new t1.u(new t1.u.b[0]) : new t1.u(eVar);
    }
}
