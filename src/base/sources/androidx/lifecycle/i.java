package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final k0 a(kl.j context, long j10, tl.o block) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(block, "block");
        return new h(context, j10, block);
    }

    public static /* synthetic */ k0 b(kl.j jVar, long j10, tl.o oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return a(jVar, j10, oVar);
    }
}
