package d4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.transition.t;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.s;
import y3.d1;
import y3.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference f36194f;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Toolbar toolbar, c configuration) {
        s.h(toolbar, "toolbar");
        s.h(configuration, "configuration");
        Context context = toolbar.getContext();
        s.g(context, "getContext(...)");
        super(context, configuration);
        this.f36194f = new WeakReference(toolbar);
    }

    @Override // d4.a, y3.g0.c
    public void a(g0 controller, d1 destination, Bundle bundle) {
        s.h(controller, "controller");
        s.h(destination, "destination");
        if (((Toolbar) this.f36194f.get()) == null) {
            controller.S(this);
        } else {
            super.a(controller, destination, bundle);
        }
    }

    @Override // d4.a
    protected void c(Drawable drawable, int i10) {
        Toolbar toolbar = (Toolbar) this.f36194f.get();
        if (toolbar != null) {
            boolean z10 = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i10);
            if (z10) {
                t.a(toolbar);
            }
        }
    }

    @Override // d4.a
    protected void d(CharSequence charSequence) {
        Toolbar toolbar = (Toolbar) this.f36194f.get();
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }
}
