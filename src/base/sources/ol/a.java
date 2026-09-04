package ol;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends nl.a {

    /* JADX INFO: renamed from: ol.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0758a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0758a f48996a = new C0758a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f48997b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f48997b = num2;
        }

        private C0758a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0758a.f48997b;
        return num == null || num.intValue() >= i10;
    }

    @Override // nl.a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        s.h(cause, "cause");
        s.h(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
