package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f53479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53480b;

    public g(boolean[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53479a = bufferWithData;
        this.f53480b = bufferWithData.length;
        b(10);
    }

    @Override // tm.j2
    public void b(int i10) {
        boolean[] zArr = this.f53479a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, yl.g.d(i10, zArr.length * 2));
            kotlin.jvm.internal.s.g(zArrCopyOf, "copyOf(...)");
            this.f53479a = zArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53480b;
    }

    public final void e(boolean z10) {
        j2.c(this, 0, 1, null);
        boolean[] zArr = this.f53479a;
        int iD = d();
        this.f53480b = iD + 1;
        zArr[iD] = z10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f53479a, d());
        kotlin.jvm.internal.s.g(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
