package d4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.appcompat.app.d f36182f;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(androidx.appcompat.app.d activity, c configuration) {
        s.h(activity, "activity");
        s.h(configuration, "configuration");
        androidx.appcompat.app.b.InterfaceC0010b interfaceC0010bM = activity.m();
        if (interfaceC0010bM != null) {
            Context contextA = interfaceC0010bM.a();
            s.g(contextA, "getActionBarThemedContext(...)");
            super(contextA, configuration);
            this.f36182f = activity;
            return;
        }
        throw new IllegalStateException(("Activity " + activity + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // d4.a
    protected void c(Drawable drawable, int i10) {
        androidx.appcompat.app.a aVarL0 = this.f36182f.l0();
        if (aVarL0 == null) {
            throw new IllegalStateException(("Activity " + this.f36182f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        aVarL0.t(drawable != null);
        androidx.appcompat.app.b.InterfaceC0010b interfaceC0010bM = this.f36182f.m();
        if (interfaceC0010bM != null) {
            interfaceC0010bM.c(drawable, i10);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f36182f + " does not have a DrawerToggleDelegate set").toString());
    }

    @Override // d4.a
    protected void d(CharSequence charSequence) {
        androidx.appcompat.app.a aVarL0 = this.f36182f.l0();
        if (aVarL0 != null) {
            aVarL0.D(charSequence);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f36182f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
