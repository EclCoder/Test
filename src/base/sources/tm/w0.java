package tm;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class w0 implements zl.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zl.l f53600a;

    public w0(zl.l origin) {
        kotlin.jvm.internal.s.h(origin, "origin");
        this.f53600a = origin;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        zl.l lVar = this.f53600a;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (!kotlin.jvm.internal.s.c(lVar, w0Var != null ? w0Var.f53600a : null)) {
            return false;
        }
        zl.d dVarI = i();
        if (dVarI instanceof zl.c) {
            zl.l lVar2 = obj instanceof zl.l ? (zl.l) obj : null;
            zl.d dVarI2 = lVar2 != null ? lVar2.i() : null;
            if (dVarI2 != null && (dVarI2 instanceof zl.c)) {
                return kotlin.jvm.internal.s.c(sl.a.a((zl.c) dVarI), sl.a.a((zl.c) dVarI2));
            }
        }
        return false;
    }

    @Override // zl.l
    public List g() {
        return this.f53600a.g();
    }

    @Override // zl.l
    public boolean h() {
        return this.f53600a.h();
    }

    public int hashCode() {
        return this.f53600a.hashCode();
    }

    @Override // zl.l
    public zl.d i() {
        return this.f53600a.i();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f53600a;
    }
}
