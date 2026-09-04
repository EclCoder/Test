package i9;

import j9.x;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f41237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f41238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f41239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f41240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f41241e;

    public d(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        this.f41237a = aVar;
        this.f41238b = aVar2;
        this.f41239c = aVar3;
        this.f41240d = aVar4;
        this.f41241e = aVar5;
    }

    public static d a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, d9.e eVar, x xVar, k9.d dVar, l9.a aVar) {
        return new c(executor, eVar, xVar, dVar, aVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f41237a.get(), (d9.e) this.f41238b.get(), (x) this.f41239c.get(), (k9.d) this.f41240d.get(), (l9.a) this.f41241e.get());
    }
}
