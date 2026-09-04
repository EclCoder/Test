package r1;

import androidx.lifecycle.p1;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t1 f51004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s1.c f51005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q1.a f51006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f51007d;

    public h(t1 store, s1.c factory, q1.a defaultExtras) {
        s.h(store, "store");
        s.h(factory, "factory");
        s.h(defaultExtras, "defaultExtras");
        this.f51004a = store;
        this.f51005b = factory;
        this.f51006c = defaultExtras;
        this.f51007d = new f();
    }

    public static /* synthetic */ p1 e(h hVar, zl.c cVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = j.f51008a.c(cVar);
        }
        return hVar.d(cVar, str);
    }

    public final p1 d(zl.c modelClass, String key) {
        p1 p1VarB;
        s.h(modelClass, "modelClass");
        s.h(key, "key");
        synchronized (this.f51007d) {
            try {
                p1VarB = this.f51004a.b(key);
                if (modelClass.a(p1VarB)) {
                    if (this.f51005b instanceof s1.e) {
                        s1.e eVar = (s1.e) this.f51005b;
                        s.e(p1VarB);
                        eVar.d(p1VarB);
                    }
                    s.f(p1VarB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    q1.d dVar = new q1.d(this.f51006c);
                    dVar.c(s1.f4483c, key);
                    p1VarB = i.a(this.f51005b, modelClass, dVar);
                    this.f51004a.d(key, p1VarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p1VarB;
    }
}
