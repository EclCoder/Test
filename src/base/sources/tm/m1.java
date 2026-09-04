package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m1 extends y2 {
    protected abstract String e0(String str, String str2);

    protected String f0(rm.f descriptor, int i10) {
        kotlin.jvm.internal.s.h(descriptor, "descriptor");
        return descriptor.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.y2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final String Z(rm.f fVar, int i10) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        return h0(f0(fVar, i10));
    }

    protected final String h0(String nestedName) {
        kotlin.jvm.internal.s.h(nestedName, "nestedName");
        String str = (String) Y();
        if (str == null) {
            str = "";
        }
        return e0(str, nestedName);
    }

    protected final String i0() {
        return a0().isEmpty() ? "$" : gl.r.l0(a0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
