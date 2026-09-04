package pl;

import wl.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a extends ol.a {

    /* JADX INFO: renamed from: pl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0768a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0768a f50161a = new C0768a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f50162b;

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
            f50162b = num2;
        }

        private C0768a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C0768a.f50162b;
        return num == null || num.intValue() >= i10;
    }

    @Override // nl.a
    public c b() {
        return c(34) ? new xl.a() : super.b();
    }
}
