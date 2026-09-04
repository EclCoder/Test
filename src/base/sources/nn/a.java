package nn;

import gn.x;
import kotlin.jvm.internal.s;
import xn.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f47858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f47859b;

    public a(g source) {
        s.h(source, "source");
        this.f47858a = source;
        this.f47859b = 262144L;
    }

    public final x a() {
        x.a aVar = new x.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.d();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strK = this.f47858a.K(this.f47859b);
        this.f47859b -= (long) strK.length();
        return strK;
    }
}
