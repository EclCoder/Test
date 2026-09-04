package kk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f43447e = new h();

    private h() {
        super(n.f43462f, null);
    }

    @Override // kk.l
    public void b(String str, Map map) {
        jk.b.b(str, "description");
        jk.b.b(map, "attributes");
    }

    @Override // kk.l
    public void c(k kVar) {
        jk.b.b(kVar, "messageEvent");
    }

    @Override // kk.l
    public void e(j jVar) {
        jk.b.b(jVar, "options");
    }

    @Override // kk.l
    public void g(String str, a aVar) {
        jk.b.b(str, "key");
        jk.b.b(aVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    public String toString() {
        return "BlankSpan";
    }
}
