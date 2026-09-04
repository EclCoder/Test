package x5;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h implements r5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f56673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f56674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f56675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f56676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f56677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f56678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f56679h;

    public h(URL url) {
        this(url, i.f56681b);
    }

    private byte[] d() {
        if (this.f56678g == null) {
            this.f56678g = c().getBytes(r5.e.f51095a);
        }
        return this.f56678g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f56676e)) {
            String string = this.f56675d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) m6.k.e(this.f56674c)).toString();
            }
            this.f56676e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.f56676e;
    }

    private URL g() {
        if (this.f56677f == null) {
            this.f56677f = new URL(f());
        }
        return this.f56677f;
    }

    @Override // r5.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f56675d;
        return str != null ? str : ((URL) m6.k.e(this.f56674c)).toString();
    }

    public Map e() {
        return this.f56673b.a();
    }

    @Override // r5.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f56673b.equals(hVar.f56673b)) {
                return true;
            }
        }
        return false;
    }

    public URL h() {
        return g();
    }

    @Override // r5.e
    public int hashCode() {
        if (this.f56679h == 0) {
            int iHashCode = c().hashCode();
            this.f56679h = iHashCode;
            this.f56679h = (iHashCode * 31) + this.f56673b.hashCode();
        }
        return this.f56679h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f56681b);
    }

    public h(URL url, i iVar) {
        this.f56674c = (URL) m6.k.e(url);
        this.f56675d = null;
        this.f56673b = (i) m6.k.e(iVar);
    }

    public h(String str, i iVar) {
        this.f56674c = null;
        this.f56675d = m6.k.c(str);
        this.f56673b = (i) m6.k.e(iVar);
    }
}
