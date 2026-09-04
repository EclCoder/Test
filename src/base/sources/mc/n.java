package mc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class n extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f45656a = -1.0f;

    @Override // mc.e
    public void a(r rVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        rVar.o(0.0f, f13, 180.0f, 180.0f - f10);
        float f14 = f13 * 2.0f;
        rVar.a(0.0f, 0.0f, f14, f14, 180.0f, f10);
    }
}
