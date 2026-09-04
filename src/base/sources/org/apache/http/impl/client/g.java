package org.apache.http.impl.client;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g extends ep.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ep.d f49285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ep.d f49286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ep.d f49287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final ep.d f49288d;

    public g(ep.d dVar, ep.d dVar2, ep.d dVar3, ep.d dVar4) {
        this.f49285a = dVar;
        this.f49286b = dVar2;
        this.f49287c = dVar3;
        this.f49288d = dVar4;
    }

    @Override // ep.d
    public Object getParameter(String str) {
        ep.d dVar;
        ep.d dVar2;
        ep.d dVar3;
        ip.a.h(str, "Parameter name");
        ep.d dVar4 = this.f49288d;
        Object parameter = dVar4 != null ? dVar4.getParameter(str) : null;
        if (parameter == null && (dVar3 = this.f49287c) != null) {
            parameter = dVar3.getParameter(str);
        }
        if (parameter == null && (dVar2 = this.f49286b) != null) {
            parameter = dVar2.getParameter(str);
        }
        return (parameter != null || (dVar = this.f49285a) == null) ? parameter : dVar.getParameter(str);
    }

    @Override // ep.d
    public ep.d setParameter(String str, Object obj) {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }

    @Override // ep.d
    public ep.d g() {
        return this;
    }
}
