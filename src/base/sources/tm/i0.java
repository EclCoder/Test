package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f53509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53510b;

    public i0(float[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53509a = bufferWithData;
        this.f53510b = bufferWithData.length;
        b(10);
    }

    @Override // tm.j2
    public void b(int i10) {
        float[] fArr = this.f53509a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, yl.g.d(i10, fArr.length * 2));
            kotlin.jvm.internal.s.g(fArrCopyOf, "copyOf(...)");
            this.f53509a = fArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53510b;
    }

    public final void e(float f10) {
        j2.c(this, 0, 1, null);
        float[] fArr = this.f53509a;
        int iD = d();
        this.f53510b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f53509a, d());
        kotlin.jvm.internal.s.g(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
