package mc;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f45568a;

    public a(float f10) {
        this.f45568a = f10;
    }

    @Override // mc.d
    public float a(RectF rectF) {
        return this.f45568a;
    }

    public float b() {
        return this.f45568a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f45568a == ((a) obj).f45568a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f45568a)});
    }

    public String toString() {
        return b() + "px";
    }
}
