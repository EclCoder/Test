package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r1.f f4462a = new r1.f();

    public static final em.o0 a(p1 p1Var) {
        r1.b bVarA;
        kotlin.jvm.internal.s.h(p1Var, "<this>");
        synchronized (f4462a) {
            bVarA = (r1.b) p1Var.f("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bVarA == null) {
                bVarA = r1.c.a();
                p1Var.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bVarA);
            }
        }
        return bVarA;
    }
}
