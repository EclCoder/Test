package cn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: cn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0140a {
        public static boolean a(a aVar, int i10, int i11) {
            float f10 = i10;
            if (f10 < aVar.c() || f10 > aVar.c() + aVar.getWidth()) {
                return false;
            }
            float f11 = i11;
            return f11 >= aVar.d() && f11 <= aVar.d() + aVar.getHeight();
        }

        public static void b(a aVar, float f10, float f11, float f12, float f13) {
            aVar.b(f10);
            aVar.a(f11);
            aVar.g(f12);
            aVar.f(f13);
        }
    }

    void a(float f10);

    void b(float f10);

    float c();

    float d();

    boolean e(int i10, int i11);

    void f(float f10);

    void g(float f10);

    float getHeight();

    float getWidth();
}
