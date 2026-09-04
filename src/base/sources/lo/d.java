package lo;

import co.l;
import ip.g;
import java.net.URI;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumSet f44881a = EnumSet.noneOf(a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f44882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet f44883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumSet f44884d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        DROP_FRAGMENT,
        NORMALIZE
    }

    static {
        a aVar = a.DROP_FRAGMENT;
        f44882b = EnumSet.of(aVar);
        a aVar2 = a.NORMALIZE;
        f44883c = EnumSet.of(aVar2);
        f44884d = EnumSet.of(aVar, aVar2);
    }

    public static l a(URI uri) {
        if (uri == null || !uri.isAbsolute()) {
            return null;
        }
        if (uri.getHost() != null) {
            return new l(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        if (uri.getAuthority() == null) {
            return null;
        }
        String authority = uri.getAuthority();
        int iIndexOf = authority.indexOf(64);
        int i10 = -1;
        if (iIndexOf != -1) {
            authority = authority.substring(iIndexOf + 1);
        }
        String scheme = uri.getScheme();
        int iIndexOf2 = authority.indexOf(":");
        if (iIndexOf2 != -1) {
            String strSubstring = authority.substring(0, iIndexOf2);
            try {
                String strSubstring2 = authority.substring(iIndexOf2 + 1);
                i10 = g.c(strSubstring2) ? -1 : Integer.parseInt(strSubstring2);
                authority = strSubstring;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        try {
            return new l(authority, i10, scheme);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public static URI b(URI uri) {
        ip.a.h(uri, "URI");
        if (uri.isOpaque()) {
            return uri;
        }
        c cVar = new c(uri);
        if (cVar.l() != null) {
            cVar.y(null);
        }
        if (cVar.k().isEmpty()) {
            cVar.v("");
        }
        if (g.c(cVar.j())) {
            cVar.t("/");
        }
        if (cVar.i() != null) {
            cVar.s(cVar.i().toLowerCase(Locale.ROOT));
        }
        cVar.r(null);
        return cVar.b();
    }

    public static URI c(URI uri, l lVar, EnumSet enumSet) {
        ip.a.h(uri, "URI");
        ip.a.h(enumSet, "URI flags");
        if (uri.isOpaque()) {
            return uri;
        }
        c cVar = new c(uri);
        if (lVar != null) {
            cVar.x(lVar.k());
            cVar.s(lVar.i());
            cVar.w(lVar.j());
        } else {
            cVar.x(null);
            cVar.s(null);
            cVar.w(-1);
        }
        if (enumSet.contains(a.DROP_FRAGMENT)) {
            cVar.r(null);
        }
        if (enumSet.contains(a.NORMALIZE)) {
            List listK = cVar.k();
            ArrayList arrayList = new ArrayList(listK);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).isEmpty() && it.hasNext()) {
                    it.remove();
                }
            }
            if (arrayList.size() != listK.size()) {
                cVar.u(arrayList);
            }
        }
        if (cVar.m()) {
            cVar.v("");
        }
        return cVar.b();
    }

    public static URI d(URI uri, qo.e eVar, boolean z10) {
        if (uri == null) {
            return null;
        }
        if (eVar.e() == null || eVar.c()) {
            if (uri.isAbsolute()) {
                return c(uri, null, z10 ? f44884d : f44882b);
            }
            return b(uri);
        }
        if (uri.isAbsolute()) {
            return b(uri);
        }
        return c(uri, eVar.g(), z10 ? f44884d : f44882b);
    }
}
