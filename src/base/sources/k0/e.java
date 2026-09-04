package k0;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f42786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f42787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f42789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f42790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f42791h;

    public e(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f42787d;
    }

    public int c() {
        return this.f42788e;
    }

    String d() {
        return this.f42791h;
    }

    public String e() {
        return this.f42784a;
    }

    public String f() {
        return this.f42785b;
    }

    public String g() {
        return this.f42786c;
    }

    public String h() {
        return this.f42789f;
    }

    public String i() {
        return this.f42790g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f42784a + ", mProviderPackage: " + this.f42785b + ", mQuery: " + this.f42786c + ", mSystemFont: " + this.f42789f + ", mVariationSettings: " + this.f42790g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f42787d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f42787d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f42788e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        this.f42784a = (String) m0.g.g(str);
        this.f42785b = (String) m0.g.g(str2);
        this.f42786c = (String) m0.g.g(str3);
        this.f42787d = (List) m0.g.g(list);
        this.f42788e = 0;
        this.f42789f = str4;
        this.f42790g = str5;
        this.f42791h = a(str, str2, str3, str4, str5);
    }
}
