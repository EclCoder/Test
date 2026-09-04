package tm;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m3 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f53539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53540b;

    public /* synthetic */ m3(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    @Override // tm.j2
    public /* bridge */ /* synthetic */ Object a() {
        return fl.f0.a(f());
    }

    @Override // tm.j2
    public void b(int i10) {
        if (fl.f0.o(this.f53539a) < i10) {
            short[] sArr = this.f53539a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, yl.g.d(i10, fl.f0.o(sArr) * 2));
            kotlin.jvm.internal.s.g(sArrCopyOf, "copyOf(...)");
            this.f53539a = fl.f0.d(sArrCopyOf);
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53540b;
    }

    public final void e(short s10) {
        j2.c(this, 0, 1, null);
        short[] sArr = this.f53539a;
        int iD = d();
        this.f53540b = iD + 1;
        fl.f0.v(sArr, iD, s10);
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f53539a, d());
        kotlin.jvm.internal.s.g(sArrCopyOf, "copyOf(...)");
        return fl.f0.d(sArrCopyOf);
    }

    private m3(short[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53539a = bufferWithData;
        this.f53540b = fl.f0.o(bufferWithData);
        b(10);
    }
}
