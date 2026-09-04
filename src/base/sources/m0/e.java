package m0;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f45061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45062b;

    public e(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f45061a = new Object[i10];
    }

    private final boolean c(Object obj) {
        int i10 = this.f45062b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f45061a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.d
    public boolean a(Object instance) {
        s.h(instance, "instance");
        if (c(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f45062b;
        Object[] objArr = this.f45061a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = instance;
        this.f45062b = i10 + 1;
        return true;
    }

    @Override // m0.d
    public Object b() {
        int i10 = this.f45062b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f45061a[i11];
        s.f(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f45061a[i11] = null;
        this.f45062b--;
        return obj;
    }
}
