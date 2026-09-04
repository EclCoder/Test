package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f53577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53578b;

    public s0(int[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53577a = bufferWithData;
        this.f53578b = bufferWithData.length;
        b(10);
    }

    @Override // tm.j2
    public void b(int i10) {
        int[] iArr = this.f53577a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, yl.g.d(i10, iArr.length * 2));
            kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
            this.f53577a = iArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53578b;
    }

    public final void e(int i10) {
        j2.c(this, 0, 1, null);
        int[] iArr = this.f53577a;
        int iD = d();
        this.f53578b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f53577a, d());
        kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
