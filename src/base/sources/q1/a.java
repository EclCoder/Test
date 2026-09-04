package q1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0771a f50286b = new C0771a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f50287a = new LinkedHashMap();

    /* JADX INFO: renamed from: q1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0771a {
        public /* synthetic */ C0771a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0771a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f50288c = new b();

        private b() {
        }

        @Override // q1.a
        public Object a(c key) {
            s.h(key, "key");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f50287a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && s.c(this.f50287a, ((a) obj).f50287a);
    }

    public int hashCode() {
        return this.f50287a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f50287a + ")";
    }
}
