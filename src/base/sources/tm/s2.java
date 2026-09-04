package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s2 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f53581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53582b;

    public s2(short[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53581a = bufferWithData;
        this.f53582b = bufferWithData.length;
        b(10);
    }

    @Override // tm.j2
    public void b(int i10) {
        short[] sArr = this.f53581a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, yl.g.d(i10, sArr.length * 2));
            kotlin.jvm.internal.s.g(sArrCopyOf, "copyOf(...)");
            this.f53581a = sArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53582b;
    }

    public final void e(short s10) {
        j2.c(this, 0, 1, null);
        short[] sArr = this.f53581a;
        int iD = d();
        this.f53582b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f53581a, d());
        kotlin.jvm.internal.s.g(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
