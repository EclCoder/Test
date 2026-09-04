package y3;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f57361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b2 f57362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57363c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public z1() {
        this.f57361a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y h(z1 z1Var, m1 m1Var, a aVar, y backStackEntry) {
        d1 d1VarF;
        kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
        d1 d1VarD = backStackEntry.d();
        if (d1VarD == null) {
            d1VarD = null;
        }
        if (d1VarD == null || (d1VarF = z1Var.f(d1VarD, backStackEntry.b(), m1Var, aVar)) == null) {
            return null;
        }
        return kotlin.jvm.internal.s.c(d1VarF, d1VarD) ? backStackEntry : z1Var.d().b(d1VarF, d1VarF.d(backStackEntry.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 k(n1 navOptions) {
        kotlin.jvm.internal.s.h(navOptions, "$this$navOptions");
        navOptions.d(true);
        return fl.g0.f38750a;
    }

    public abstract d1 c();

    protected final b2 d() {
        b2 b2Var = this.f57362b;
        if (b2Var != null) {
            return b2Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean e() {
        return this.f57363c;
    }

    public d1 f(d1 destination, Bundle bundle, m1 m1Var, a aVar) {
        kotlin.jvm.internal.s.h(destination, "destination");
        return destination;
    }

    public void g(List entries, final m1 m1Var, final a aVar) {
        kotlin.jvm.internal.s.h(entries, "entries");
        Iterator it = am.j.q(am.j.y(gl.r.T(entries), new Function1(m1Var, aVar) { // from class: y3.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f57349b;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z1.h(this.f57348a, this.f57349b, null, (y) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            d().l((y) it.next());
        }
    }

    public void i(b2 state) {
        kotlin.jvm.internal.s.h(state, "state");
        this.f57362b = state;
        this.f57363c = true;
    }

    public void j(y backStackEntry) {
        kotlin.jvm.internal.s.h(backStackEntry, "backStackEntry");
        d1 d1VarD = backStackEntry.d();
        if (d1VarD == null) {
            d1VarD = null;
        }
        if (d1VarD == null) {
            return;
        }
        f(d1VarD, null, o1.a(new Function1() { // from class: y3.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z1.k((n1) obj);
            }
        }), null);
        d().g(backStackEntry);
    }

    public void l(Bundle savedState) {
        kotlin.jvm.internal.s.h(savedState, "savedState");
    }

    public Bundle m() {
        return null;
    }

    public void n(y popUpTo, boolean z10) {
        kotlin.jvm.internal.s.h(popUpTo, "popUpTo");
        List list = (List) d().c().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        y yVar = null;
        while (o()) {
            yVar = (y) listIterator.previous();
            if (kotlin.jvm.internal.s.c(yVar, popUpTo)) {
                break;
            }
        }
        if (yVar != null) {
            d().i(yVar, z10);
        }
    }

    public boolean o() {
        return true;
    }

    public z1(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        this.f57361a = name;
    }
}
