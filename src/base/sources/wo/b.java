package wo;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b extends h {
    private static final long serialVersionUID = -1931571557597830536L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f56374d;

    public b(Charset charset) {
        super(charset);
        this.f56374d = false;
    }

    @Override // eo.b
    public boolean d() {
        return this.f56374d;
    }

    @Override // eo.b
    public boolean g() {
        return false;
    }

    @Override // eo.b
    public String h() {
        return "basic";
    }

    public String toString() {
        return "BASIC [complete=" + this.f56374d + "]";
    }

    public b() {
        this(co.b.f10155b);
    }
}
