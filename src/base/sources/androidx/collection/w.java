package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1941a = new Object();

    public static final Object c(v vVar, int i10) {
        Object obj;
        kotlin.jvm.internal.s.h(vVar, "<this>");
        int iA = s.a.a(vVar.f1938b, vVar.f1940d, i10);
        if (iA < 0 || (obj = vVar.f1939c[iA]) == f1941a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(v vVar) {
        int i10 = vVar.f1940d;
        int[] iArr = vVar.f1938b;
        Object[] objArr = vVar.f1939c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1941a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        vVar.f1937a = false;
        vVar.f1940d = i11;
    }
}
