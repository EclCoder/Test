package m0;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f45063c;

    public f(int i10) {
        super(i10);
        this.f45063c = new Object();
    }

    @Override // m0.e, m0.d
    public boolean a(Object instance) {
        boolean zA;
        s.h(instance, "instance");
        synchronized (this.f45063c) {
            zA = super.a(instance);
        }
        return zA;
    }

    @Override // m0.e, m0.d
    public Object b() {
        Object objB;
        synchronized (this.f45063c) {
            objB = super.b();
        }
        return objB;
    }
}
