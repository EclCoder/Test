package gn;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f39423e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bm.o f39424f = new bm.o("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bm.o f39425g = new bm.o(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f39427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f39428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f39429d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 a(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            bm.l lVarE = a0.f39424f.e(str, 0);
            if (lVarE == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
            }
            String str2 = (String) lVarE.a().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) lVarE.a().get(2)).toLowerCase(locale);
            kotlin.jvm.internal.s.g(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int iB = lVarE.b().b();
            while (true) {
                int i10 = iB + 1;
                if (i10 >= str.length()) {
                    return new a0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                bm.l lVarE2 = a0.f39425g.e(str, i10);
                if (lVarE2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i10);
                    kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                bm.j jVar = lVarE2.c().get(1);
                String strA = jVar != null ? jVar.a() : null;
                if (strA == null) {
                    iB = lVarE2.b().b();
                } else {
                    bm.j jVar2 = lVarE2.c().get(2);
                    String strA2 = jVar2 != null ? jVar2.a() : null;
                    if (strA2 == null) {
                        bm.j jVar3 = lVarE2.c().get(3);
                        kotlin.jvm.internal.s.e(jVar3);
                        strA2 = jVar3.a();
                    } else if (bm.r.I0(strA2, '\'', false, 2, null) && bm.r.W(strA2, '\'', false, 2, null) && strA2.length() > 2) {
                        strA2 = strA2.substring(1, strA2.length() - 1);
                        kotlin.jvm.internal.s.g(strA2, "substring(...)");
                    }
                    arrayList.add(strA);
                    arrayList.add(strA2);
                    iB = lVarE2.b().b();
                }
            }
        }

        public final a0 b(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public a0(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        kotlin.jvm.internal.s.h(mediaType, "mediaType");
        kotlin.jvm.internal.s.h(type, "type");
        kotlin.jvm.internal.s.h(subtype, "subtype");
        kotlin.jvm.internal.s.h(parameterNamesAndValues, "parameterNamesAndValues");
        this.f39426a = mediaType;
        this.f39427b = type;
        this.f39428c = subtype;
        this.f39429d = parameterNamesAndValues;
    }

    public static /* synthetic */ Charset d(a0 a0Var, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return a0Var.c(charset);
    }

    public static final a0 f(String str) {
        return f39423e.b(str);
    }

    public final Charset c(Charset charset) {
        String strE = e("charset");
        if (strE == null) {
            return charset;
        }
        try {
            return Charset.forName(strE);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String name) {
        kotlin.jvm.internal.s.h(name, "name");
        int i10 = 0;
        int iB = nl.c.b(0, this.f39429d.length - 1, 2);
        if (iB < 0) {
            return null;
        }
        while (!bm.r.A(this.f39429d[i10], name, true)) {
            if (i10 == iB) {
                return null;
            }
            i10 += 2;
        }
        return this.f39429d[i10 + 1];
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && kotlin.jvm.internal.s.c(((a0) obj).f39426a, this.f39426a);
    }

    public int hashCode() {
        return this.f39426a.hashCode();
    }

    public String toString() {
        return this.f39426a;
    }
}
