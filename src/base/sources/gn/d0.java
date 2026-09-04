package gn;

import com.google.api.client.http.HttpMethods;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f39553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f39555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f39556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f39557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hn.f f39558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f39559g;

    public d0(a builder) {
        kotlin.jvm.internal.s.h(builder, "builder");
        y yVarL = builder.l();
        if (yVarL == null) {
            throw new IllegalStateException("url == null");
        }
        this.f39553a = yVarL;
        this.f39554b = builder.j();
        this.f39555c = builder.i().d();
        this.f39556d = builder.g();
        this.f39557e = builder.h();
        this.f39558f = builder.k();
    }

    public final e0 a() {
        return this.f39556d;
    }

    public final d b() {
        d dVar = this.f39559g;
        if (dVar != null) {
            return dVar;
        }
        d dVarA = d.f39529n.a(this.f39555c);
        this.f39559g = dVarA;
        return dVarA;
    }

    public final y c() {
        return this.f39557e;
    }

    public final hn.f d() {
        return this.f39558f;
    }

    public final String e(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        return this.f39555c.a(name);
    }

    public final x f() {
        return this.f39555c;
    }

    public final List g(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        return this.f39555c.k(name);
    }

    public final boolean h() {
        return this.f39553a.h();
    }

    public final String i() {
        return this.f39554b;
    }

    public final a j() {
        return new a(this);
    }

    public final Object k() {
        return l(l0.b(Object.class));
    }

    public final Object l(zl.c type) {
        kotlin.jvm.internal.s.h(type, "type");
        return sl.a.a(type).cast(this.f39558f.a(type));
    }

    public final y m() {
        return this.f39553a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.f39554b);
        sb2.append(", url=");
        sb2.append(this.f39553a);
        if (this.f39555c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f39555c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    gl.r.u();
                }
                fl.q qVar = (fl.q) obj;
                String str = (String) qVar.d();
                String str2 = (String) qVar.g();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (hn.m.y(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!kotlin.jvm.internal.s.c(this.f39558f, hn.a.f40709a)) {
            sb2.append(", tags=");
            sb2.append(this.f39558f);
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f39560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f39561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private x.a f39562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e0 f39563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private y f39564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private hn.f f39565f;

        public a() {
            this.f39565f = hn.a.f40709a;
            this.f39561b = HttpMethods.GET;
            this.f39562c = new x.a();
        }

        private final String e(String str) {
            if (bm.r.L(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = str.substring(3);
                kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!bm.r.L(str, "wss:", true)) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https:");
            String strSubstring2 = str.substring(4);
            kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(value, "value");
            this.f39562c.a(name, value);
            return this;
        }

        public d0 b() {
            return new d0(this);
        }

        public a c(d cacheControl) {
            kotlin.jvm.internal.s.h(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? r("Cache-Control") : n("Cache-Control", string);
        }

        public final a d(y yVar) {
            this.f39564e = yVar;
            return this;
        }

        public a f() {
            return p(HttpMethods.GET, null);
        }

        public final e0 g() {
            return this.f39563d;
        }

        public final y h() {
            return this.f39564e;
        }

        public final x.a i() {
            return this.f39562c;
        }

        public final String j() {
            return this.f39561b;
        }

        public final hn.f k() {
            return this.f39565f;
        }

        public final y l() {
            return this.f39560a;
        }

        public a m() {
            return p(HttpMethods.HEAD, null);
        }

        public a n(String name, String value) {
            kotlin.jvm.internal.s.h(name, "name");
            kotlin.jvm.internal.s.h(value, "value");
            this.f39562c.h(name, value);
            return this;
        }

        public a o(x headers) {
            kotlin.jvm.internal.s.h(headers, "headers");
            this.f39562c = headers.f();
            return this;
        }

        public a p(String method, e0 e0Var) {
            kotlin.jvm.internal.s.h(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (e0Var == null) {
                if (mn.f.f(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!mn.f.c(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f39561b = method;
            this.f39563d = e0Var;
            return this;
        }

        public a q(e0 body) {
            kotlin.jvm.internal.s.h(body, "body");
            return p(HttpMethods.POST, body);
        }

        public a r(String name) {
            kotlin.jvm.internal.s.h(name, "name");
            this.f39562c.g(name);
            return this;
        }

        public a s(Object obj) {
            return t(l0.b(Object.class), obj);
        }

        public final a t(zl.c type, Object obj) {
            kotlin.jvm.internal.s.h(type, "type");
            this.f39565f = this.f39565f.b(type, obj);
            return this;
        }

        public a u(y url) {
            kotlin.jvm.internal.s.h(url, "url");
            this.f39560a = url;
            return this;
        }

        public a v(String url) {
            kotlin.jvm.internal.s.h(url, "url");
            return u(y.f39776j.c(e(url)));
        }

        public a(d0 request) {
            kotlin.jvm.internal.s.h(request, "request");
            this.f39565f = hn.a.f40709a;
            this.f39560a = request.m();
            this.f39561b = request.i();
            this.f39563d = request.a();
            this.f39565f = request.d();
            this.f39562c = request.f().f();
            this.f39564e = request.c();
        }
    }

    public /* synthetic */ d0(y yVar, x xVar, String str, e0 e0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, (i10 & 2) != 0 ? x.f39772b.b(new String[0]) : xVar, (i10 & 4) != 0 ? "\u0000" : str, (i10 & 8) != 0 ? null : e0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(y url, x headers, String method, e0 e0Var) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(headers, "headers");
        kotlin.jvm.internal.s.h(method, "method");
        a aVarO = new a().u(url).o(headers);
        if (kotlin.jvm.internal.s.c(method, "\u0000")) {
            if (e0Var != null) {
                method = HttpMethods.POST;
            } else {
                method = HttpMethods.GET;
            }
        }
        this(aVarO.p(method, e0Var));
    }
}
