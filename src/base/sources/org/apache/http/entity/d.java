package org.apache.http.entity;

import co.j;
import co.u;
import com.google.api.client.http.UrlEncodedParser;
import ip.g;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f49236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f49237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f49238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f49239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f49240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f49241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f49242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f49243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f49244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f49245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f49246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f49247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f49248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f49249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f49250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f49251s;
    private static final long serialVersionUID = -7768694718232371896L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f49252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f49253u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f49254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f49255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map f49256x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f49257y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f49258z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f49260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u[] f49261c;

    static {
        Charset charset = co.b.f10156c;
        d dVarC = c("application/atom+xml", charset);
        f49236d = dVarC;
        d dVarC2 = c(UrlEncodedParser.CONTENT_TYPE, charset);
        f49237e = dVarC2;
        Charset charset2 = co.b.f10154a;
        d dVarC3 = c("application/json", charset2);
        f49238f = dVarC3;
        f49239g = c("application/octet-stream", null);
        f49240h = c("application/soap+xml", charset2);
        d dVarC4 = c("application/svg+xml", charset);
        f49241i = dVarC4;
        d dVarC5 = c("application/xhtml+xml", charset);
        f49242j = dVarC5;
        d dVarC6 = c("application/xml", charset);
        f49243k = dVarC6;
        d dVarB = b("image/bmp");
        f49244l = dVarB;
        d dVarB2 = b("image/gif");
        f49245m = dVarB2;
        d dVarB3 = b("image/jpeg");
        f49246n = dVarB3;
        d dVarB4 = b("image/png");
        f49247o = dVarB4;
        d dVarB5 = b("image/svg+xml");
        f49248p = dVarB5;
        d dVarB6 = b("image/tiff");
        f49249q = dVarB6;
        d dVarB7 = b("image/webp");
        f49250r = dVarB7;
        d dVarC7 = c("multipart/form-data", charset);
        f49251s = dVarC7;
        d dVarC8 = c("text/html", charset);
        f49252t = dVarC8;
        d dVarC9 = c("text/plain", charset);
        f49253u = dVarC9;
        d dVarC10 = c("text/xml", charset);
        f49254v = dVarC10;
        f49255w = c("*/*", null);
        d[] dVarArr = {dVarC, dVarC2, dVarC3, dVarC4, dVarC5, dVarC6, dVarB, dVarB2, dVarB3, dVarB4, dVarB5, dVarB6, dVarB7, dVarC7, dVarC8, dVarC9, dVarC10};
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 17; i10++) {
            d dVar = dVarArr[i10];
            map.put(dVar.h(), dVar);
        }
        f49256x = Collections.unmodifiableMap(map);
        f49257y = f49253u;
        f49258z = f49239g;
    }

    d(String str, Charset charset) {
        this.f49259a = str;
        this.f49260b = charset;
        this.f49261c = null;
    }

    private static d a(co.e eVar, boolean z10) {
        return d(eVar.getName(), eVar.getParameters(), z10);
    }

    public static d b(String str) {
        return c(str, null);
    }

    public static d c(String str, Charset charset) {
        String lowerCase = ((String) ip.a.d(str, "MIME type")).toLowerCase(Locale.ROOT);
        ip.a.a(i(lowerCase), "MIME type may not contain reserved characters");
        return new d(lowerCase, charset);
    }

    private static d d(String str, u[] uVarArr, boolean z10) {
        Charset charsetForName;
        int length = uVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                u uVar = uVarArr[i10];
                if (uVar.getName().equalsIgnoreCase("charset")) {
                    String value = uVar.getValue();
                    if (!g.b(value)) {
                        try {
                            charsetForName = Charset.forName(value);
                            break;
                        } catch (UnsupportedCharsetException e10) {
                            if (z10) {
                                throw e10;
                            }
                            charsetForName = null;
                            break;
                        }
                    }
                } else {
                    i10++;
                }
            }
            charsetForName = null;
            break;
        }
        if (uVarArr.length <= 0) {
            uVarArr = null;
        }
        return new d(str, charsetForName, uVarArr);
    }

    public static d e(j jVar) {
        co.d contentType;
        if (jVar != null && (contentType = jVar.getContentType()) != null) {
            co.e[] eVarArrG = contentType.g();
            if (eVarArrG.length > 0) {
                return a(eVarArrG[0], true);
            }
        }
        return null;
    }

    private static boolean i(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"' || cCharAt == ',' || cCharAt == ';') {
                return false;
            }
        }
        return true;
    }

    public Charset g() {
        return this.f49260b;
    }

    public String h() {
        return this.f49259a;
    }

    public String toString() {
        ip.c cVar = new ip.c(64);
        cVar.b(this.f49259a);
        if (this.f49261c != null) {
            cVar.b("; ");
            org.apache.http.message.f.f49390b.e(cVar, this.f49261c, false);
        } else if (this.f49260b != null) {
            cVar.b("; charset=");
            cVar.b(this.f49260b.name());
        }
        return cVar.toString();
    }

    d(String str, Charset charset, u[] uVarArr) {
        this.f49259a = str;
        this.f49260b = charset;
        this.f49261c = uVarArr;
    }
}
