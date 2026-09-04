package uk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum c implements wk.a {
    INSTANCE,
    NEVER;

    @Override // wk.b
    public int a(int i10) {
        return i10 & 2;
    }

    @Override // wk.c
    public boolean isEmpty() {
        return true;
    }

    @Override // wk.c
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // wk.c
    public Object poll() {
        return null;
    }

    @Override // wk.c
    public void clear() {
    }

    @Override // rk.b
    public void d() {
    }
}
