package mc;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f45569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f45570b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f45569a;
            f10 += ((b) dVar).f45570b;
        }
        this.f45569a = dVar;
        this.f45570b = f10;
    }

    @Override // mc.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f45569a.a(rectF) + this.f45570b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f45569a.equals(bVar.f45569a) && this.f45570b == bVar.f45570b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45569a, Float.valueOf(this.f45570b)});
    }
}
