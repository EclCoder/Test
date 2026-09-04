package oe;

import kotlin.jvm.internal.s;
import ne.t0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48513a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static t0 f48514b;

    private a() {
    }

    public static final void b() {
        try {
            if (f48514b == null) {
                f48513a.c(t0.f47245a.a());
            }
            a aVar = f48513a;
            if (aVar.a().a()) {
                aVar.a().b();
            }
        } catch (Exception unused) {
        }
    }

    public final t0 a() {
        t0 t0Var = f48514b;
        if (t0Var != null) {
            return t0Var;
        }
        s.w("sharedSessionRepository");
        return null;
    }

    public final void c(t0 t0Var) {
        s.h(t0Var, "<set-?>");
        f48514b = t0Var;
    }
}
