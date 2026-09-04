package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile n f3620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final n f3621c = new n(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f3622a = Collections.EMPTY_MAP;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f3623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3624b;

        a(Object obj, int i10) {
            this.f3623a = obj;
            this.f3624b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3623a == aVar.f3623a && this.f3624b == aVar.f3624b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f3623a) * 65535) + this.f3624b;
        }
    }

    n(boolean z10) {
    }

    public static n b() {
        n nVarA;
        if (y0.f3776d) {
            return f3621c;
        }
        n nVar = f3620b;
        if (nVar != null) {
            return nVar;
        }
        synchronized (n.class) {
            try {
                nVarA = f3620b;
                if (nVarA == null) {
                    nVarA = m.a();
                    f3620b = nVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVarA;
    }

    public v.c a(n0 n0Var, int i10) {
        android.support.v4.media.session.b.a(this.f3622a.get(new a(n0Var, i10)));
        return null;
    }
}
