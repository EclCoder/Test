package d9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f36483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f36484b;

    public l(el.a aVar, el.a aVar2) {
        this.f36483a = aVar;
        this.f36484b = aVar2;
    }

    public static l a(el.a aVar, el.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f36483a.get(), this.f36484b.get());
    }
}
