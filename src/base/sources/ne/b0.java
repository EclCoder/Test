package ne;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f47106b;

    private b0(pe.e eVar, pe.e eVar2) {
        this.f47105a = eVar;
        this.f47106b = eVar2;
    }

    public static b0 a(pe.e eVar, pe.e eVar2) {
        return new b0(eVar, eVar2);
    }

    public static a0 c(Context context, z0 z0Var) {
        return new a0(context, z0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return c((Context) this.f47105a.get(), (z0) this.f47106b.get());
    }
}
