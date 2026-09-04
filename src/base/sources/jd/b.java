package jd;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final md.h0 f42250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f42252c;

    b(md.h0 h0Var, String str, File file) {
        if (h0Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f42250a = h0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f42251b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f42252c = file;
    }

    @Override // jd.j0
    public md.h0 b() {
        return this.f42250a;
    }

    @Override // jd.j0
    public File c() {
        return this.f42252c;
    }

    @Override // jd.j0
    public String d() {
        return this.f42251b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.f42250a.equals(j0Var.b()) && this.f42251b.equals(j0Var.d()) && this.f42252c.equals(j0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f42250a.hashCode() ^ 1000003) * 1000003) ^ this.f42251b.hashCode()) * 1000003) ^ this.f42252c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f42250a + ", sessionId=" + this.f42251b + ", reportFile=" + this.f42252c + "}";
    }
}
