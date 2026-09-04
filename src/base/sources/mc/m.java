package mc;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f45655a;

    public m(float f10) {
        this.f45655a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // mc.d
    public float a(RectF rectF) {
        return this.f45655a * b(rectF);
    }

    public float c() {
        return this.f45655a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f45655a == ((m) obj).f45655a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f45655a)});
    }

    public String toString() {
        return ((int) (c() * 100.0f)) + "%";
    }
}
