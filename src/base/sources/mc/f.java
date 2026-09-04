package mc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f45572a = -1.0f;

    @Override // mc.e
    public void a(r rVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        rVar.o(0.0f, f13, 180.0f, 180.0f - f10);
        double d10 = f13;
        rVar.m((float) (Math.sin(Math.toRadians(f10)) * d10), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10));
    }
}
