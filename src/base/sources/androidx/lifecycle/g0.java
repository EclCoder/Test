package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b0 b0Var, s.b bVar, s.b bVar2) {
        if (bVar == s.b.INITIALIZED && bVar2 == s.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + s.b.CREATED + "' to be moved to '" + bVar2 + "' in component " + b0Var).toString());
        }
        s.b bVar3 = s.b.DESTROYED;
        if (bVar != bVar3 || bVar == bVar2) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar3 + "' and cannot be moved to `" + bVar2 + "` in component " + b0Var).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s.b d(s.b bVar, s.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
