package fl;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38783b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f38784a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ x(byte b10) {
        this.f38784a = b10;
    }

    public static final /* synthetic */ x a(byte b10) {
        return new x(b10);
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof x) && b10 == ((x) obj).f();
    }

    public static int d(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String e(byte b10) {
        return String.valueOf(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.s.i(f() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, ((x) obj).f() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public boolean equals(Object obj) {
        return c(this.f38784a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f38784a;
    }

    public int hashCode() {
        return d(this.f38784a);
    }

    public String toString() {
        return e(this.f38784a);
    }

    public static byte b(byte b10) {
        return b10;
    }
}
