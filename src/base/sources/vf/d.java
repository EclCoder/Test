package vf;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f55423b;

    public d(b bVar, el.a aVar) {
        this.f55422a = bVar;
        this.f55423b = aVar;
    }

    public static d a(b bVar, el.a aVar) {
        return new d(bVar, aVar);
    }

    public static FirebaseAnalytics c(b bVar, Context context) {
        return (FirebaseAnalytics) ek.e.c(bVar.b(context));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FirebaseAnalytics get() {
        return c(this.f55422a, (Context) this.f55423b.get());
    }
}
