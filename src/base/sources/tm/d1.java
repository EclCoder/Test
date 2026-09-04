package tm;

import c1.pGX.geAgcEazw;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f53460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53461b;

    @Override // tm.j2
    public void b(int i10) {
        long[] jArr = this.f53460a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, yl.g.d(i10, jArr.length * 2));
            kotlin.jvm.internal.s.g(jArrCopyOf, "copyOf(...)");
            this.f53460a = jArrCopyOf;
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53461b;
    }

    public final void e(long j10) {
        j2.c(this, 0, 1, null);
        long[] jArr = this.f53460a;
        int iD = d();
        this.f53461b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // tm.j2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f53460a, d());
        kotlin.jvm.internal.s.g(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    public d1(long[] jArr) {
        kotlin.jvm.internal.s.h(jArr, geAgcEazw.eHeJSm);
        this.f53460a = jArr;
        this.f53461b = jArr.length;
        b(10);
    }
}
