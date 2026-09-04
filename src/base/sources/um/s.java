package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f54816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54817b;

    public s(c0 writer) {
        kotlin.jvm.internal.s.h(writer, "writer");
        this.f54816a = writer;
        this.f54817b = true;
    }

    public final boolean a() {
        return this.f54817b;
    }

    public void b() {
        this.f54817b = true;
    }

    public void c() {
        this.f54817b = false;
    }

    public void d() {
        this.f54817b = false;
    }

    public void e(byte b10) {
        this.f54816a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f54816a.a(c10);
    }

    public void g(double d10) {
        this.f54816a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f54816a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f54816a.writeLong(i10);
    }

    public void j(long j10) {
        this.f54816a.writeLong(j10);
    }

    public final void k(String v10) {
        kotlin.jvm.internal.s.h(v10, "v");
        this.f54816a.c(v10);
    }

    public void l(short s10) {
        this.f54816a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f54816a.c(String.valueOf(z10));
    }

    public void n(String value) {
        kotlin.jvm.internal.s.h(value, "value");
        this.f54816a.b(value);
    }

    protected final void o(boolean z10) {
        this.f54817b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
