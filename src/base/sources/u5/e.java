package u5;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e implements d {
    @Override // u5.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // u5.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // u5.d
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return e(i10, i11, config);
    }

    @Override // u5.d
    public void b() {
    }

    @Override // u5.d
    public void a(int i10) {
    }

    @Override // u5.d
    public void c(float f10) {
    }
}
