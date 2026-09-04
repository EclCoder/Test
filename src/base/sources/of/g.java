package of;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f48566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f48567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f48568h;

    public g(String id2, String displayName, String url, int i10, String sha256, String encoderName, String decoderName, String tokensName) {
        s.h(id2, "id");
        s.h(displayName, "displayName");
        s.h(url, "url");
        s.h(sha256, "sha256");
        s.h(encoderName, "encoderName");
        s.h(decoderName, "decoderName");
        s.h(tokensName, "tokensName");
        this.f48561a = id2;
        this.f48562b = displayName;
        this.f48563c = url;
        this.f48564d = i10;
        this.f48565e = sha256;
        this.f48566f = encoderName;
        this.f48567g = decoderName;
        this.f48568h = tokensName;
    }

    public final String a() {
        return this.f48567g;
    }

    public final String b() {
        return this.f48566f;
    }

    public final String c() {
        return this.f48561a;
    }

    public final String d() {
        return this.f48565e;
    }

    public final int e() {
        return this.f48564d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.c(this.f48561a, gVar.f48561a) && s.c(this.f48562b, gVar.f48562b) && s.c(this.f48563c, gVar.f48563c) && this.f48564d == gVar.f48564d && s.c(this.f48565e, gVar.f48565e) && s.c(this.f48566f, gVar.f48566f) && s.c(this.f48567g, gVar.f48567g) && s.c(this.f48568h, gVar.f48568h);
    }

    public final String f() {
        return this.f48568h;
    }

    public final String g() {
        return this.f48563c;
    }

    public int hashCode() {
        return (((((((((((((this.f48561a.hashCode() * 31) + this.f48562b.hashCode()) * 31) + this.f48563c.hashCode()) * 31) + Integer.hashCode(this.f48564d)) * 31) + this.f48565e.hashCode()) * 31) + this.f48566f.hashCode()) * 31) + this.f48567g.hashCode()) * 31) + this.f48568h.hashCode();
    }

    public String toString() {
        return "SttModelEntry(id=" + this.f48561a + ", displayName=" + this.f48562b + ", url=" + this.f48563c + ", sizeMb=" + this.f48564d + ", sha256=" + this.f48565e + ", encoderName=" + this.f48566f + ", decoderName=" + this.f48567g + ", tokensName=" + this.f48568h + ')';
    }
}
