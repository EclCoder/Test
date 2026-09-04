package j9;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f42174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f42175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f42176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f42177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f42178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final el.a f42179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final el.a f42180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final el.a f42181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final el.a f42182i;

    public s(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7, el.a aVar8, el.a aVar9) {
        this.f42174a = aVar;
        this.f42175b = aVar2;
        this.f42176c = aVar3;
        this.f42177d = aVar4;
        this.f42178e = aVar5;
        this.f42179f = aVar6;
        this.f42180g = aVar7;
        this.f42181h = aVar8;
        this.f42182i = aVar9;
    }

    public static s a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7, el.a aVar8, el.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, d9.e eVar, k9.d dVar, x xVar, Executor executor, l9.a aVar, m9.a aVar2, m9.a aVar3, k9.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f42174a.get(), (d9.e) this.f42175b.get(), (k9.d) this.f42176c.get(), (x) this.f42177d.get(), (Executor) this.f42178e.get(), (l9.a) this.f42179f.get(), (m9.a) this.f42180g.get(), (m9.a) this.f42181h.get(), (k9.c) this.f42182i.get());
    }
}
