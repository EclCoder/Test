package vf;

import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f55430b;

    public h(b bVar, el.a aVar) {
        this.f55429a = bVar;
        this.f55430b = aVar;
    }

    public static h a(b bVar, el.a aVar) {
        return new h(bVar, aVar);
    }

    public static NotificationManager c(b bVar, Context context) {
        return (NotificationManager) ek.e.c(bVar.f(context));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NotificationManager get() {
        return c(this.f55429a, (Context) this.f55430b.get());
    }
}
