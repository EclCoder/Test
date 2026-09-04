package tm;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f53463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53464b;

    public /* synthetic */ d3(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    @Override // tm.j2
    public /* bridge */ /* synthetic */ Object a() {
        return fl.y.a(f());
    }

    @Override // tm.j2
    public void b(int i10) {
        if (fl.y.o(this.f53463a) < i10) {
            byte[] bArr = this.f53463a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, yl.g.d(i10, fl.y.o(bArr) * 2));
            kotlin.jvm.internal.s.g(bArrCopyOf, "copyOf(...)");
            this.f53463a = fl.y.d(bArrCopyOf);
        }
    }

    @Override // tm.j2
    public int d() {
        return this.f53464b;
    }

    public final void e(byte b10) {
        j2.c(this, 0, 1, null);
        byte[] bArr = this.f53463a;
        int iD = d();
        this.f53464b = iD + 1;
        fl.y.v(bArr, iD, b10);
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f53463a, d());
        kotlin.jvm.internal.s.g(bArrCopyOf, "copyOf(...)");
        return fl.y.d(bArrCopyOf);
    }

    private d3(byte[] bufferWithData) {
        kotlin.jvm.internal.s.h(bufferWithData, "bufferWithData");
        this.f53463a = bufferWithData;
        this.f53464b = fl.y.o(bufferWithData);
        b(10);
    }
}
