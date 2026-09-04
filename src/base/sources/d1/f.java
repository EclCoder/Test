package d1;

import gl.l0;
import java.util.Map;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36101a;

        public a(String name) {
            s.h(name, "name");
            this.f36101a = name;
        }

        public final String a() {
            return this.f36101a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return s.c(this.f36101a, ((a) obj).f36101a);
            }
            return false;
        }

        public int hashCode() {
            return this.f36101a.hashCode();
        }

        public String toString() {
            return this.f36101a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(l0.v(a()), false);
    }

    public final f d() {
        return new c(l0.v(a()), true);
    }
}
