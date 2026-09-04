package d4;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import kotlin.jvm.internal.s;
import y3.d1;
import y3.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f36191a = new e();

    private e() {
    }

    public static final boolean b(g0 navController, c configuration) {
        s.h(navController, "navController");
        s.h(configuration, "configuration");
        v0.c cVarB = configuration.b();
        d1 d1VarS = navController.s();
        if (cVarB != null && d1VarS != null && configuration.c(d1VarS)) {
            cVarB.open();
            return true;
        }
        if (navController.L()) {
            return true;
        }
        c.b bVarA = configuration.a();
        if (bVarA != null) {
            return bVarA.b();
        }
        return false;
    }

    public static final void c(androidx.appcompat.app.d activity, g0 navController, c configuration) {
        s.h(activity, "activity");
        s.h(navController, "navController");
        s.h(configuration, "configuration");
        navController.i(new b(activity, configuration));
    }

    public static /* synthetic */ void d(androidx.appcompat.app.d dVar, g0 g0Var, c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = new c.a(g0Var.u()).a();
        }
        c(dVar, g0Var, cVar);
    }

    public static final void e(Toolbar toolbar, final g0 navController, final c configuration) {
        s.h(toolbar, "toolbar");
        s.h(navController, "navController");
        s.h(configuration, "configuration");
        navController.i(new h(toolbar, configuration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: d4.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.f(navController, configuration, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g0 g0Var, c cVar, View view) {
        b(g0Var, cVar);
    }
}
