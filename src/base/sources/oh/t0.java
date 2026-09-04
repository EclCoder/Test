package oh;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t0 extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y3.g0 f48854c;

    private final void x0() {
        n0.e1.b(getWindow(), true);
        n0.o1 o1Var = new n0.o1(getWindow(), getWindow().getDecorView());
        o1Var.a(n0.k1.s.f());
        o1Var.e(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x0();
    }

    public final void y0(Toolbar toolbar) {
        kotlin.jvm.internal.s.h(toolbar, "toolbar");
        u0(toolbar);
        Fragment fragmentJ0 = getSupportFragmentManager().j0(R.id.nav_host_fragment);
        kotlin.jvm.internal.s.f(fragmentJ0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        y3.g0 g0VarW = ((NavHostFragment) fragmentJ0).w();
        this.f48854c = g0VarW;
        if (g0VarW == null) {
            kotlin.jvm.internal.s.w("navController");
            g0VarW = null;
        }
        d4.e.d(this, g0VarW, null, 4, null);
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
        androidx.appcompat.app.a aVarL1 = l0();
        if (aVarL1 != null) {
            aVarL1.v(false);
        }
    }
}
