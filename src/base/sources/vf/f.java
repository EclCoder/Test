package vf;

import android.content.Context;
import android.media.projection.MediaProjectionManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f55427b;

    public f(b bVar, el.a aVar) {
        this.f55426a = bVar;
        this.f55427b = aVar;
    }

    public static f a(b bVar, el.a aVar) {
        return new f(bVar, aVar);
    }

    public static MediaProjectionManager c(b bVar, Context context) {
        return (MediaProjectionManager) ek.e.c(bVar.d(context));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MediaProjectionManager get() {
        return c(this.f55426a, (Context) this.f55427b.get());
    }
}
