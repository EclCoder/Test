package qe;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f50643a;

    private c(pe.e eVar) {
        this.f50643a = eVar;
    }

    public static c a(pe.e eVar) {
        return new c(eVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((Context) this.f50643a.get());
    }
}
