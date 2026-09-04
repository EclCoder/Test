package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f54772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54773b;

    public j(char[] buffer) {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        this.f54772a = buffer;
        this.f54773b = buffer.length;
    }

    public char a(int i10) {
        return this.f54772a[i10];
    }

    public final char[] b() {
        return this.f54772a;
    }

    public int c() {
        return this.f54773b;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public void d(int i10) {
        this.f54773b = i10;
    }

    public final String e(int i10, int i11) {
        return bm.r.v(this.f54772a, i10, Math.min(i11, length()));
    }

    public final void f(int i10) {
        d(Math.min(this.f54772a.length, i10));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return bm.r.v(this.f54772a, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return e(0, length());
    }
}
