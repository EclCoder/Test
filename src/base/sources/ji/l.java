package ji;

import bm.r;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f42571h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f42575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f42576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f42577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f42578g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(String endpoint, String[] requiredProtocol) throws URISyntaxException {
            s.h(endpoint, "endpoint");
            s.h(requiredProtocol, "requiredProtocol");
            URI uri = new URI(endpoint);
            String scheme = uri.getScheme();
            s.g(scheme, "getScheme(...)");
            if (!gl.j.P(requiredProtocol, r.V0(scheme).toString())) {
                throw new URISyntaxException(endpoint, "Invalid protocol: " + uri.getScheme());
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (uri.getUserInfo() != null) {
                String userInfo = uri.getUserInfo();
                s.g(userInfo, "getUserInfo(...)");
                if (!r.T(userInfo, ":", false, 2, null)) {
                    throw new URISyntaxException(endpoint, "Invalid auth. Auth must contain ':'");
                }
            }
            return new l(uri, endpoint, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ l(URI uri, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str);
    }

    private final Map a() {
        List<String> listL;
        String str = this.f42577f;
        if (str == null || (listL = r.F0(str, new String[]{"&"}, false, 0, 6, null)) == null) {
            listL = gl.r.l();
        }
        HashMap map = new HashMap();
        for (String str2 : listL) {
            Pattern patternCompile = Pattern.compile("=");
            s.g(patternCompile, "compile(...)");
            List listJ = r.J(str2, patternCompile, 2);
            if (listJ.size() == 2) {
                map.put(listJ.get(0), listJ.get(1));
            }
        }
        return map;
    }

    public final String b() {
        String strE = e();
        Integer[] numArrE = i.e(strE, '/');
        int length = numArrE.length;
        if (length == 0) {
            return strE;
        }
        if (length == 1) {
            String strSubstring = strE.substring(0, numArrE[0].intValue());
            s.g(strSubstring, "substring(...)");
            return strSubstring;
        }
        if (a().isEmpty()) {
            String strSubstring2 = strE.substring(0, numArrE[1].intValue());
            s.g(strSubstring2, "substring(...)");
            return strSubstring2;
        }
        String strSubstring3 = strE.substring(0, numArrE[0].intValue());
        s.g(strSubstring3, "substring(...)");
        return strSubstring3;
    }

    public final String c() {
        List listF0;
        String str = this.f42578g;
        if (str == null || (listF0 = r.F0(str, new String[]{":"}, false, 0, 6, null)) == null || listF0.size() != 2) {
            return null;
        }
        return (String) listF0.get(1);
    }

    public final String d() {
        List listF0;
        String str = this.f42578g;
        if (str == null || (listF0 = r.F0(str, new String[]{":"}, false, 0, 6, null)) == null || listF0.size() != 2) {
            return null;
        }
        return (String) listF0.get(0);
    }

    public final String e() {
        String str;
        String str2 = this.f42576e;
        String str3 = this.f42577f;
        String str4 = "";
        if (str3 == null) {
            str = "";
        } else {
            str = "?" + str3;
        }
        String strY0 = r.y0(str2 + str, "?");
        if (strY0.length() != 0) {
            return strY0;
        }
        Integer num = this.f42575d;
        if (num != null) {
            str4 = ":" + num;
        }
        return r.y0(r.y0(this.f42572a, this.f42573b + "://" + this.f42574c + str4), "/");
    }

    public final String f() {
        return this.f42574c;
    }

    public final Integer g() {
        return this.f42575d;
    }

    public final String h() {
        return this.f42573b;
    }

    public final String i() {
        return r.y0(r.y0(e(), b()), "/");
    }

    public final String j() {
        String str;
        Integer num = this.f42575d;
        String str2 = "";
        if (num != null) {
            str = ":" + num;
        } else {
            str = "";
        }
        if (b().length() > 0) {
            str2 = "/" + b();
        }
        return this.f42573b + "://" + this.f42574c + str + str2;
    }

    private l(URI uri, String str) {
        this.f42572a = str;
        this.f42573b = "";
        this.f42574c = "";
        this.f42576e = "";
        String string = uri.toString();
        s.g(string, "toString(...)");
        this.f42573b = uri.getScheme();
        this.f42574c = uri.getHost();
        this.f42575d = uri.getPort() < 0 ? null : Integer.valueOf(uri.getPort());
        String path = uri.getPath();
        s.g(path, "getPath(...)");
        this.f42576e = r.y0(path, "/");
        if (uri.getQuery() != null) {
            String query = uri.getQuery();
            s.g(query, "getQuery(...)");
            int iF0 = r.f0(string, query, 0, false, 6, null);
            String strSubstring = string.substring(iF0 < 0 ? 0 : iF0);
            s.g(strSubstring, "substring(...)");
            this.f42577f = strSubstring;
        }
        this.f42578g = uri.getUserInfo();
    }
}
