package uo;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f54867d;

    public f(String str, int i10, String str2, boolean z10) {
        ip.a.d(str, "Host");
        ip.a.g(i10, "Port");
        ip.a.h(str2, "Path");
        this.f54864a = str.toLowerCase(Locale.ROOT);
        this.f54865b = i10;
        if (ip.g.b(str2)) {
            this.f54866c = "/";
        } else {
            this.f54866c = str2;
        }
        this.f54867d = z10;
    }

    public String a() {
        return this.f54864a;
    }

    public String b() {
        return this.f54866c;
    }

    public int c() {
        return this.f54865b;
    }

    public boolean d() {
        return this.f54867d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this.f54867d) {
            sb2.append("(secure)");
        }
        sb2.append(this.f54864a);
        sb2.append(':');
        sb2.append(Integer.toString(this.f54865b));
        sb2.append(this.f54866c);
        sb2.append(']');
        return sb2.toString();
    }
}
