package mc;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f45571a;

    public c(float f10) {
        this.f45571a = f10;
    }

    public static c b(a aVar) {
        return new c(aVar.b());
    }

    private static float c(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // mc.d
    public float a(RectF rectF) {
        return h0.a.a(this.f45571a, 0.0f, c(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f45571a == ((c) obj).f45571a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f45571a)});
    }
}
