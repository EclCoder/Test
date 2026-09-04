package tm;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g3 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f53497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53498b;

    public /* synthetic */ g3(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    @Override // tm.j2
    public /* bridge */ /* synthetic */ Object a() {
        return fl.a0.a(f());
    }

    @Override // tm.j2
    public void b(int i10) {
        if (fl.a0.o(this.f53497a) < i10) {
            int[] iArr = this.f53497a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, yl.g.d(i10, fl.a0.o(iArr) * 2));
            kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
            this.f53497a = fl.a0.d(iArrCopyOf);
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53498b;
    }

    public final void e(int i10) {
        j2.c(this, 0, 1, null);
        int[] iArr = this.f53497a;
        int iD = d();
        this.f53498b = iD + 1;
        fl.a0.v(iArr, iD, i10);
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f53497a, d());
        kotlin.jvm.internal.s.g(iArrCopyOf, "copyOf(...)");
        return fl.a0.d(iArrCopyOf);
    }

    private g3(int[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53497a = bufferWithData;
        this.f53498b = fl.a0.o(bufferWithData);
        b(10);
    }
}
