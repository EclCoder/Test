package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends g2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f53563m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(String name, l0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(generatedSerializer, "generatedSerializer");
        this.f53563m = true;
    }

    @Override // tm.g2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        rm.f fVar = (rm.f) obj;
        if (!kotlin.jvm.internal.s.c(i(), fVar.i())) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (!q0Var.isInline() || !Arrays.equals(u(), q0Var.u()) || e() != fVar.e()) {
            return false;
        }
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            if (!kotlin.jvm.internal.s.c(h(i10).i(), fVar.h(i10).i()) || !kotlin.jvm.internal.s.c(h(i10).d(), fVar.h(i10).d())) {
                return false;
            }
        }
        return true;
    }

    @Override // tm.g2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // tm.g2, rm.f
    public boolean isInline() {
        return this.f53563m;
    }
}
