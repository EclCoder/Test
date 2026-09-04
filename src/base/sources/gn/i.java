package gn;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f39631b;

    public i(String scheme, Map authParams) {
        String lowerCase;
        kotlin.jvm.internal.s.h(scheme, "scheme");
        kotlin.jvm.internal.s.h(authParams, "authParams");
        this.f39630a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null) {
                Locale US = Locale.US;
                kotlin.jvm.internal.s.g(US, "US");
                lowerCase = str.toLowerCase(US);
                kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.s.g(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f39631b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f39631b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.s.g(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return bm.d.f9084g;
    }

    public final String b() {
        return (String) this.f39631b.get("realm");
    }

    public final String c() {
        return this.f39630a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.s.c(iVar.f39630a, this.f39630a) && kotlin.jvm.internal.s.c(iVar.f39631b, this.f39631b);
    }

    public int hashCode() {
        return ((899 + this.f39630a.hashCode()) * 31) + this.f39631b.hashCode();
    }

    public String toString() {
        return this.f39630a + " authParams=" + this.f39631b;
    }
}
