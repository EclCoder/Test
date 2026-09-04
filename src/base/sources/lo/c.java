package lo;

import ip.g;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f44869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f44870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f44871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f44873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f44874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f44875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f44876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f44877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Charset f44878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f44879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f44880o;

    public c(URI uri) {
        this(uri, null);
    }

    private String c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f44866a;
        if (str != null) {
            sb2.append(str);
            sb2.append(':');
        }
        String str2 = this.f44867b;
        if (str2 != null) {
            sb2.append(str2);
        } else {
            if (this.f44868c != null) {
                sb2.append("//");
                sb2.append(this.f44868c);
            } else if (this.f44871f != null) {
                sb2.append("//");
                String str3 = this.f44870e;
                if (str3 != null) {
                    sb2.append(str3);
                    sb2.append("@");
                } else {
                    String str4 = this.f44869d;
                    if (str4 != null) {
                        sb2.append(h(str4));
                        sb2.append("@");
                    }
                }
                if (to.c.b(this.f44871f)) {
                    sb2.append("[");
                    sb2.append(this.f44871f);
                    sb2.append("]");
                } else {
                    sb2.append(this.f44871f);
                }
                if (this.f44872g >= 0) {
                    sb2.append(":");
                    sb2.append(this.f44872g);
                }
            }
            String str5 = this.f44873h;
            if (str5 != null) {
                sb2.append(n(str5, sb2.length() == 0));
            } else {
                List list = this.f44874i;
                if (list != null) {
                    sb2.append(e(list));
                }
            }
            if (this.f44875j != null) {
                sb2.append("?");
                sb2.append(this.f44875j);
            } else {
                List list2 = this.f44876k;
                if (list2 != null && !list2.isEmpty()) {
                    sb2.append("?");
                    sb2.append(g(this.f44876k));
                } else if (this.f44877l != null) {
                    sb2.append("?");
                    sb2.append(f(this.f44877l));
                }
            }
        }
        if (this.f44880o != null) {
            sb2.append("#");
            sb2.append(this.f44880o);
        } else if (this.f44879n != null) {
            sb2.append("#");
            sb2.append(f(this.f44879n));
        }
        return sb2.toString();
    }

    private void d(URI uri) {
        this.f44866a = uri.getScheme();
        this.f44867b = uri.getRawSchemeSpecificPart();
        this.f44868c = uri.getRawAuthority();
        this.f44871f = uri.getHost();
        this.f44872g = uri.getPort();
        this.f44870e = uri.getRawUserInfo();
        this.f44869d = uri.getUserInfo();
        this.f44873h = uri.getRawPath();
        String rawPath = uri.getRawPath();
        Charset charset = this.f44878m;
        if (charset == null) {
            charset = co.b.f10154a;
        }
        this.f44874i = o(rawPath, charset);
        this.f44875j = uri.getRawQuery();
        String rawQuery = uri.getRawQuery();
        Charset charset2 = this.f44878m;
        if (charset2 == null) {
            charset2 = co.b.f10154a;
        }
        this.f44876k = p(rawQuery, charset2);
        this.f44880o = uri.getRawFragment();
        this.f44879n = uri.getFragment();
    }

    private String e(List list) {
        Charset charset = this.f44878m;
        if (charset == null) {
            charset = co.b.f10154a;
        }
        return e.h(list, charset);
    }

    private String f(String str) {
        Charset charset = this.f44878m;
        if (charset == null) {
            charset = co.b.f10154a;
        }
        return e.c(str, charset);
    }

    private String g(List list) {
        Charset charset = this.f44878m;
        if (charset == null) {
            charset = co.b.f10154a;
        }
        return e.g(list, charset);
    }

    private String h(String str) {
        Charset charset = this.f44878m;
        if (charset == null) {
            charset = co.b.f10154a;
        }
        return e.d(str, charset);
    }

    private static String n(String str, boolean z10) {
        if (g.b(str)) {
            return "";
        }
        if (z10 || str.startsWith("/")) {
            return str;
        }
        return "/" + str;
    }

    private List o(String str, Charset charset) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return e.l(str, charset);
    }

    private List p(String str, Charset charset) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return e.k(str, charset);
    }

    public c a(List list) {
        if (this.f44876k == null) {
            this.f44876k = new ArrayList();
        }
        this.f44876k.addAll(list);
        this.f44875j = null;
        this.f44867b = null;
        this.f44877l = null;
        return this;
    }

    public URI b() {
        return new URI(c());
    }

    public String i() {
        return this.f44871f;
    }

    public String j() {
        if (this.f44874i == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f44874i) {
            sb2.append('/');
            sb2.append(str);
        }
        return sb2.toString();
    }

    public List k() {
        return this.f44874i != null ? new ArrayList(this.f44874i) : Collections.EMPTY_LIST;
    }

    public String l() {
        return this.f44869d;
    }

    public boolean m() {
        List list = this.f44874i;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        String str = this.f44873h;
        return str == null || str.isEmpty();
    }

    public c q(Charset charset) {
        this.f44878m = charset;
        return this;
    }

    public c r(String str) {
        this.f44879n = str;
        this.f44880o = null;
        return this;
    }

    public c s(String str) {
        this.f44871f = str;
        this.f44867b = null;
        this.f44868c = null;
        return this;
    }

    public c t(String str) {
        return u(str != null ? e.m(str) : null);
    }

    public String toString() {
        return c();
    }

    public c u(List list) {
        this.f44874i = (list == null || list.size() <= 0) ? null : new ArrayList(list);
        this.f44867b = null;
        this.f44873h = null;
        return this;
    }

    public c v(String... strArr) {
        this.f44874i = strArr.length > 0 ? Arrays.asList(strArr) : null;
        this.f44867b = null;
        this.f44873h = null;
        return this;
    }

    public c w(int i10) {
        if (i10 < 0) {
            i10 = -1;
        }
        this.f44872g = i10;
        this.f44867b = null;
        this.f44868c = null;
        return this;
    }

    public c x(String str) {
        this.f44866a = str;
        return this;
    }

    public c y(String str) {
        this.f44869d = str;
        this.f44867b = null;
        this.f44868c = null;
        this.f44870e = null;
        return this;
    }

    public c(URI uri, Charset charset) {
        q(charset);
        d(uri);
    }
}
