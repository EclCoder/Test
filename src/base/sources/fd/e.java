package fd;

import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class e implements bd.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private hd.b f38463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hd.b f38464b;

    e() {
    }

    private static void b(hd.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f38463a : this.f38464b, str, bundle);
    }

    @Override // bd.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        gd.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(hd.b bVar) {
        this.f38464b = bVar;
    }

    public void e(hd.b bVar) {
        this.f38463a = bVar;
    }
}
