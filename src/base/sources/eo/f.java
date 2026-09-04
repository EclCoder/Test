package eo;

import co.l;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f38095f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f38096g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f38097h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f38098i = new f(null, -1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f38103e;

    public f(String str, int i10, String str2, String str3) {
        this.f38101c = str == null ? f38095f : str.toLowerCase(Locale.ROOT);
        this.f38102d = i10 < 0 ? -1 : i10;
        this.f38100b = str2 == null ? f38096g : str2;
        this.f38099a = str3 == null ? f38097h : str3.toUpperCase(Locale.ROOT);
        this.f38103e = null;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        return ip.f.a(this.f38101c, fVar.f38101c) && this.f38102d == fVar.f38102d && ip.f.a(this.f38100b, fVar.f38100b) && ip.f.a(this.f38099a, fVar.f38099a);
    }

    public int hashCode() {
        return ip.f.d(ip.f.d(ip.f.c(ip.f.d(17, this.f38101c), this.f38102d), this.f38100b), this.f38099a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f38099a;
        if (str != null) {
            sb2.append(str.toUpperCase(Locale.ROOT));
            sb2.append(' ');
        }
        if (this.f38100b != null) {
            sb2.append('\'');
            sb2.append(this.f38100b);
            sb2.append('\'');
        } else {
            sb2.append("<any realm>");
        }
        if (this.f38101c != null) {
            sb2.append('@');
            sb2.append(this.f38101c);
            if (this.f38102d >= 0) {
                sb2.append(':');
                sb2.append(this.f38102d);
            }
        }
        return sb2.toString();
    }

    public f(l lVar, String str, String str2) {
        ip.a.h(lVar, "Host");
        String strI = lVar.i();
        Locale locale = Locale.ROOT;
        this.f38101c = strI.toLowerCase(locale);
        this.f38102d = lVar.j() < 0 ? -1 : lVar.j();
        this.f38100b = str == null ? f38096g : str;
        this.f38099a = str2 == null ? f38097h : str2.toUpperCase(locale);
        this.f38103e = lVar;
    }

    public f(l lVar) {
        this(lVar, f38096g, f38097h);
    }
}
