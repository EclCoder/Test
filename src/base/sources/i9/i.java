package i9;

import android.content.Context;
import j9.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f41243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f41244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f41245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f41246d;

    public i(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        this.f41243a = aVar;
        this.f41244b = aVar2;
        this.f41245c = aVar3;
        this.f41246d = aVar4;
    }

    public static i a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, k9.d dVar, j9.f fVar, m9.a aVar) {
        return (x) e9.d.d(h.a(context, dVar, fVar, aVar));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f41243a.get(), (k9.d) this.f41244b.get(), (j9.f) this.f41245c.get(), (m9.a) this.f41246d.get());
    }
}
