package oa;

import java.nio.ByteBuffer;
import ob.c0;
import ob.d0;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends ha.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f48307a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f48308b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n0 f48309c;

    @Override // ha.g
    protected ha.a b(ha.d dVar, ByteBuffer byteBuffer) {
        ha.a.b eVar;
        n0 n0Var = this.f48309c;
        if (n0Var == null || dVar.f40306i != n0Var.e()) {
            n0 n0Var2 = new n0(dVar.f16756e);
            this.f48309c = n0Var2;
            n0Var2.a(dVar.f16756e - dVar.f40306i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f48307a.S(bArrArray, iLimit);
        this.f48308b.o(bArrArray, iLimit);
        this.f48308b.r(39);
        long jH = (((long) this.f48308b.h(1)) << 32) | ((long) this.f48308b.h(32));
        this.f48308b.r(20);
        int iH = this.f48308b.h(12);
        int iH2 = this.f48308b.h(8);
        this.f48307a.V(14);
        if (iH2 == 0) {
            eVar = new e();
        } else if (iH2 == 255) {
            eVar = a.a(this.f48307a, iH, jH);
        } else if (iH2 == 4) {
            eVar = f.a(this.f48307a);
        } else if (iH2 != 5) {
            eVar = iH2 != 6 ? null : g.a(this.f48307a, jH, this.f48309c);
        } else {
            eVar = d.a(this.f48307a, jH, this.f48309c);
        }
        return eVar == null ? new ha.a(new ha.a.b[0]) : new ha.a(eVar);
    }
}
