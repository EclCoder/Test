package k9;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f43036a;

    public h(el.a aVar) {
        this.f43036a = aVar;
    }

    public static h a(el.a aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) e9.d.d(f.b(context));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c((Context) this.f43036a.get());
    }
}
