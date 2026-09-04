package c9;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class q implements a9.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f9672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f9673c;

    q(Set set, p pVar, t tVar) {
        this.f9671a = set;
        this.f9672b = pVar;
        this.f9673c = tVar;
    }

    @Override // a9.i
    public a9.h a(String str, Class cls, a9.b bVar, a9.g gVar) {
        if (this.f9671a.contains(bVar)) {
            return new s(this.f9672b, str, bVar, gVar, this.f9673c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f9671a));
    }
}
