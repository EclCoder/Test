package vf;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f55432b;

    public i(b bVar, el.a aVar) {
        this.f55431a = bVar;
        this.f55432b = aVar;
    }

    public static i a(b bVar, el.a aVar) {
        return new i(bVar, aVar);
    }

    public static sf.e c(b bVar, Context context) {
        return (sf.e) ek.e.c(bVar.g(context));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public sf.e get() {
        return c(this.f55431a, (Context) this.f55432b.get());
    }
}
