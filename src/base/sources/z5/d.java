package z5;

import m6.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements t5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f58655a;

    public d(Object obj) {
        this.f58655a = k.e(obj);
    }

    @Override // t5.c
    public Class b() {
        return this.f58655a.getClass();
    }

    @Override // t5.c
    public final Object get() {
        return this.f58655a;
    }

    @Override // t5.c
    public final int getSize() {
        return 1;
    }

    @Override // t5.c
    public void a() {
    }
}
