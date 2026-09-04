package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n1 extends z2 {
    protected abstract String a0(String str, String str2);

    protected abstract String b0(rm.f fVar, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tm.z2
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(rm.f fVar, int i10) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        return d0(b0(fVar, i10));
    }

    protected final String d0(String nestedName) {
        kotlin.jvm.internal.s.h(nestedName, "nestedName");
        String str = (String) W();
        if (str == null) {
            str = "";
        }
        return a0(str, nestedName);
    }
}
