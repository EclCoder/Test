package y3;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f57157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f57158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f57159c;

    public b1(Uri uri, String str, String str2) {
        this.f57157a = uri;
        this.f57158b = str;
        this.f57159c = str2;
    }

    public String a() {
        return this.f57158b;
    }

    public String b() {
        return this.f57159c;
    }

    public Uri c() {
        return this.f57157a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }
}
