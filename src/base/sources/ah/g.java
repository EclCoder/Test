package ah;

import android.content.Context;
import android.os.Build;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import kotlin.jvm.internal.s;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements e.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f340b;

    public g() {
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        s.g(applicationContext, "getApplicationContext(...)");
        this.f340b = applicationContext;
    }

    @Override // ah.e.i
    public void a() {
        b();
    }

    public final void b() {
        d();
        if (this.f339a != null && Build.VERSION.SDK_INT >= 30) {
            l0.D(this.f340b, "remove_camera_permission");
        }
        this.f339a = null;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 30) {
            l0.D(this.f340b, "add_camera_permission");
        }
        if (this.f339a == null) {
            this.f339a = new e(this.f340b);
        }
        e eVar = this.f339a;
        if (eVar != null) {
            eVar.E0(this);
        }
        e eVar2 = this.f339a;
        if (eVar2 != null) {
            eVar2.G0();
        }
    }

    public final void d() {
        e eVar = this.f339a;
        if (eVar != null) {
            eVar.n();
        }
    }
}
