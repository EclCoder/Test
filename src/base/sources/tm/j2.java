package tm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j2 {
    public static /* synthetic */ void c(j2 j2Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = j2Var.d() + 1;
        }
        j2Var.b(i10);
    }

    public abstract Object a();

    public abstract void b(int i10);

    public abstract int d();
}
