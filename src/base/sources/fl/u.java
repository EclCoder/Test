package fl;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class u implements k, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private tl.a f38777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f38778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f38779c;

    public u(tl.a initializer, Object obj) {
        kotlin.jvm.internal.s.h(initializer, "initializer");
        this.f38777a = initializer;
        this.f38778b = d0.f38744a;
        this.f38779c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // fl.k
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f38778b;
        d0 d0Var = d0.f38744a;
        if (obj != d0Var) {
            return obj;
        }
        synchronized (this.f38779c) {
            objInvoke = this.f38778b;
            if (objInvoke == d0Var) {
                tl.a aVar = this.f38777a;
                kotlin.jvm.internal.s.e(aVar);
                objInvoke = aVar.invoke();
                this.f38778b = objInvoke;
                this.f38777a = null;
            }
        }
        return objInvoke;
    }

    @Override // fl.k
    public boolean isInitialized() {
        return this.f38778b != d0.f38744a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ u(tl.a aVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
