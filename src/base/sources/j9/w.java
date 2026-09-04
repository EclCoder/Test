package j9;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f42189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f42190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f42191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f42192d;

    public w(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        this.f42189a = aVar;
        this.f42190b = aVar2;
        this.f42191c = aVar3;
        this.f42192d = aVar4;
    }

    public static w a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, k9.d dVar, x xVar, l9.a aVar) {
        return new v(executor, dVar, xVar, aVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f42189a.get(), (k9.d) this.f42190b.get(), (x) this.f42191c.get(), (l9.a) this.f42192d.get());
    }
}
