package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 writer, boolean z10) {
        super(writer);
        kotlin.jvm.internal.s.h(writer, "writer");
        this.f54840c = z10;
    }

    @Override // um.s
    public void e(byte b10) {
        boolean z10 = this.f54840c;
        String strE = fl.x.e(fl.x.b(b10));
        if (z10) {
            n(strE);
        } else {
            k(strE);
        }
    }

    @Override // um.s
    public void i(int i10) {
        boolean z10 = this.f54840c;
        String string = Long.toString(((long) fl.z.b(i10)) & 4294967295L, 10);
        if (z10) {
            n(string);
        } else {
            k(string);
        }
    }

    @Override // um.s
    public void j(long j10) {
        boolean z10 = this.f54840c;
        long jB = fl.b0.b(j10);
        if (z10) {
            n(h.a(jB, 10));
        } else {
            k(h.a(jB, 10));
        }
    }

    @Override // um.s
    public void l(short s10) {
        boolean z10 = this.f54840c;
        String strE = fl.e0.e(fl.e0.b(s10));
        if (z10) {
            n(strE);
        } else {
            k(strE);
        }
    }
}
