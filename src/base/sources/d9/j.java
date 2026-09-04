package d9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f36475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f36476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f36477c;

    public j(el.a aVar, el.a aVar2, el.a aVar3) {
        this.f36475a = aVar;
        this.f36476b = aVar2;
        this.f36477c = aVar3;
    }

    public static j a(el.a aVar, el.a aVar2, el.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, m9.a aVar, m9.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f36475a.get(), (m9.a) this.f36476b.get(), (m9.a) this.f36477c.get());
    }
}
