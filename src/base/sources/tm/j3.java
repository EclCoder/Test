package tm;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j3 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f53523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53524b;

    public /* synthetic */ j3(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    @Override // tm.j2
    public /* bridge */ /* synthetic */ Object a() {
        return fl.c0.a(f());
    }

    @Override // tm.j2
    public void b(int i10) {
        if (fl.c0.o(this.f53523a) < i10) {
            long[] jArr = this.f53523a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, yl.g.d(i10, fl.c0.o(jArr) * 2));
            kotlin.jvm.internal.s.g(jArrCopyOf, "copyOf(...)");
            this.f53523a = fl.c0.d(jArrCopyOf);
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53524b;
    }

    public final void e(long j10) {
        j2.c(this, 0, 1, null);
        long[] jArr = this.f53523a;
        int iD = d();
        this.f53524b = iD + 1;
        fl.c0.v(jArr, iD, j10);
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f53523a, d());
        kotlin.jvm.internal.s.g(jArrCopyOf, "copyOf(...)");
        return fl.c0.d(jArrCopyOf);
    }

    private j3(long[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53523a = bufferWithData;
        this.f53524b = fl.c0.o(bufferWithData);
        b(10);
    }
}
