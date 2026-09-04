package xe;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f56818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f56819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f56820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f56821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f56822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f56823g;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f56817a = sb2.toString();
        this.f56818b = l.FORCE_NONE;
        this.f56819c = new StringBuilder(str.length());
        this.f56821e = -1;
    }

    private int h() {
        return this.f56817a.length() - this.f56823g;
    }

    public int a() {
        return this.f56819c.length();
    }

    public StringBuilder b() {
        return this.f56819c;
    }

    public char c() {
        return this.f56817a.charAt(this.f56820d);
    }

    public String d() {
        return this.f56817a;
    }

    public int e() {
        return this.f56821e;
    }

    public int f() {
        return h() - this.f56820d;
    }

    public k g() {
        return this.f56822f;
    }

    public boolean i() {
        return this.f56820d < h();
    }

    public void j() {
        this.f56821e = -1;
    }

    public void k() {
        this.f56822f = null;
    }

    public void m(int i10) {
        this.f56823g = i10;
    }

    public void n(l lVar) {
        this.f56818b = lVar;
    }

    public void o(int i10) {
        this.f56821e = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f56822f;
        if (kVar == null || i10 > kVar.a()) {
            this.f56822f = k.l(i10, this.f56818b, null, null, true);
        }
    }

    public void r(char c10) {
        this.f56819c.append(c10);
    }

    public void s(String str) {
        this.f56819c.append(str);
    }

    public void l(com.google.zxing.b bVar, com.google.zxing.b bVar2) {
    }
}
