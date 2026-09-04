package tm;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f53551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53552b;

    public p(char[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53551a = bufferWithData;
        this.f53552b = bufferWithData.length;
        b(10);
    }

    @Override // tm.j2
    public void b(int i10) {
        char[] cArr = this.f53551a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, yl.g.d(i10, cArr.length * 2));
            kotlin.jvm.internal.s.g(cArrCopyOf, "copyOf(...)");
            this.f53551a = cArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53552b;
    }

    public final void e(char c10) {
        j2.c(this, 0, 1, null);
        char[] cArr = this.f53551a;
        int iD = d();
        this.f53552b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f53551a, d());
        kotlin.jvm.internal.s.g(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
