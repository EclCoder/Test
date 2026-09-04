package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o extends h {
    public o(int i10) {
        super(i10, null);
    }

    public final boolean g(float f10) {
        h(this.f1910b + 1);
        float[] fArr = this.f1909a;
        int i10 = this.f1910b;
        fArr[i10] = f10;
        this.f1910b = i10 + 1;
        return true;
    }

    public final void h(int i10) {
        float[] fArr = this.f1909a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i10, (fArr.length * 3) / 2));
            kotlin.jvm.internal.s.g(fArrCopyOf, "copyOf(...)");
            this.f1909a = fArrCopyOf;
        }
    }
}
