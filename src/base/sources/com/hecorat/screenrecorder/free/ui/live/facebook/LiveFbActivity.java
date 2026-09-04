package com.hecorat.screenrecorder.free.ui.live.facebook;

import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.g;
import com.hecorat.screenrecorder.free.R;
import d4.c;
import gh.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import y3.g0;
import yg.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/hecorat/screenrecorder/free/ui/live/facebook/LiveFbActivity;", "Landroidx/appcompat/app/d;", "Lyg/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "", "s0", "()Z", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "v", "(Landroidx/appcompat/widget/Toolbar;)V", "Ly3/g0;", "c", "Ly3/g0;", "navController", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LiveFbActivity extends d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g0 navController;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23134a = new a();

        @Override // tl.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g.j(this, R.layout.activity_live_fb);
        this.navController = y3.b.a(this, R.id.liveFbNavHostFragment);
    }

    @Override // androidx.appcompat.app.d
    public boolean s0() {
        g0 g0Var = this.navController;
        if (g0Var == null) {
            s.w("navController");
            g0Var = null;
        }
        return g0Var.L();
    }

    @Override // yg.b
    public void v(Toolbar toolbar) {
        s.h(toolbar, "toolbar");
        g0 g0Var = this.navController;
        g0 g0Var2 = null;
        if (g0Var == null) {
            s.w("navController");
            g0Var = null;
        }
        c cVarA = new c.a(g0Var.u()).c(null).b(new j(a.f23134a)).a();
        g0 g0Var3 = this.navController;
        if (g0Var3 == null) {
            s.w("navController");
        } else {
            g0Var2 = g0Var3;
        }
        d4.g.a(toolbar, g0Var2, cVarA);
    }
}
