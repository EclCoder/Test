package zo;

import java.util.List;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class a0 extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String[] f59023c = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f59024b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends i {
        a() {
        }

        @Override // zo.i, uo.d
        public void a(uo.c cVar, uo.f fVar) throws CookieRestrictionViolationException {
            if (d(cVar, fVar)) {
                return;
            }
            throw new CookieRestrictionViolationException("Illegal 'path' attribute \"" + cVar.w() + "\". Path of origin: \"" + fVar.b() + "\"");
        }
    }

    public a0(String[] strArr, boolean z10) {
        super(new c0(), new a(), new z(), new h(), new j(), new e(), new g(strArr != null ? (String[]) strArr.clone() : f59023c));
        this.f59024b = z10;
    }

    @Override // zo.p, uo.g
    public void a(uo.c cVar, uo.f fVar) {
        ip.a.h(cVar, "Cookie");
        String name = cVar.getName();
        if (name.indexOf(32) != -1) {
            throw new CookieRestrictionViolationException("Cookie name may not contain blanks");
        }
        if (name.startsWith("$")) {
            throw new CookieRestrictionViolationException("Cookie name may not start with $");
        }
        super.a(cVar, fVar);
    }

    @Override // uo.g
    public List b(co.d dVar, uo.f fVar) throws MalformedCookieException {
        ip.a.h(dVar, "Header");
        ip.a.h(fVar, "Cookie origin");
        if (dVar.getName().equalsIgnoreCase("Set-Cookie")) {
            return g(dVar.g(), fVar);
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + dVar.toString() + "'");
    }

    @Override // uo.g
    public int getVersion() {
        return 1;
    }

    public String toString() {
        return "rfc2109";
    }

    protected a0(boolean z10, uo.b... bVarArr) {
        super(bVarArr);
        this.f59024b = z10;
    }
}
