package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f53617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53618b;

    public z(double[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53617a = bufferWithData;
        this.f53618b = bufferWithData.length;
        b(10);
    }

    @Override // tm.j2
    public void b(int i10) {
        double[] dArr = this.f53617a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, yl.g.d(i10, dArr.length * 2));
            kotlin.jvm.internal.s.g(dArrCopyOf, "copyOf(...)");
            this.f53617a = dArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53618b;
    }

    public final void e(double d10) {
        j2.c(this, 0, 1, null);
        double[] dArr = this.f53617a;
        int iD = d();
        this.f53618b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f53617a, d());
        kotlin.jvm.internal.s.g(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
