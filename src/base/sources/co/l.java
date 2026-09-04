package co;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Cloneable, Serializable {
    private static final long serialVersionUID = -7529410654042457626L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f10157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f10158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f10159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f10160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final InetAddress f10161e;

    public l(String str, int i10, String str2) {
        this.f10157a = (String) ip.a.c(str, "Host name");
        Locale locale = Locale.ROOT;
        this.f10158b = str.toLowerCase(locale);
        if (str2 != null) {
            this.f10160d = str2.toLowerCase(locale);
        } else {
            this.f10160d = "http";
        }
        this.f10159c = i10;
        this.f10161e = null;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f10158b.equals(lVar.f10158b) && this.f10159c == lVar.f10159c && this.f10160d.equals(lVar.f10160d)) {
                InetAddress inetAddress = this.f10161e;
                InetAddress inetAddress2 = lVar.f10161e;
                if (inetAddress != null ? inetAddress.equals(inetAddress2) : inetAddress2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public InetAddress g() {
        return this.f10161e;
    }

    public int hashCode() {
        int iD = ip.f.d(ip.f.c(ip.f.d(17, this.f10158b), this.f10159c), this.f10160d);
        InetAddress inetAddress = this.f10161e;
        return inetAddress != null ? ip.f.d(iD, inetAddress) : iD;
    }

    public String i() {
        return this.f10157a;
    }

    public int j() {
        return this.f10159c;
    }

    public String k() {
        return this.f10160d;
    }

    public String l() {
        if (this.f10159c == -1) {
            return this.f10157a;
        }
        StringBuilder sb2 = new StringBuilder(this.f10157a.length() + 6);
        sb2.append(this.f10157a);
        sb2.append(":");
        sb2.append(Integer.toString(this.f10159c));
        return sb2.toString();
    }

    public String m() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10160d);
        sb2.append("://");
        sb2.append(this.f10157a);
        if (this.f10159c != -1) {
            sb2.append(':');
            sb2.append(Integer.toString(this.f10159c));
        }
        return sb2.toString();
    }

    public String toString() {
        return m();
    }

    public l(String str, int i10) {
        this(str, i10, (String) null);
    }

    public l(InetAddress inetAddress, int i10, String str) {
        this((InetAddress) ip.a.h(inetAddress, "Inet address"), inetAddress.getHostName(), i10, str);
    }

    public l(InetAddress inetAddress, String str, int i10, String str2) {
        this.f10161e = (InetAddress) ip.a.h(inetAddress, "Inet address");
        String str3 = (String) ip.a.h(str, "Hostname");
        this.f10157a = str3;
        Locale locale = Locale.ROOT;
        this.f10158b = str3.toLowerCase(locale);
        if (str2 != null) {
            this.f10160d = str2.toLowerCase(locale);
        } else {
            this.f10160d = "http";
        }
        this.f10159c = i10;
    }
}
