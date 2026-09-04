package pg;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f50040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f50041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Uri f50042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f50043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected long f50044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f50045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected long f50046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f50047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected long f50048k;

    d(int i10, long j10, String str, String str2, long j11, Uri uri, long j12, String str3) {
        super(i10);
        this.f50045h = false;
        this.f50043f = j10;
        this.f50040c = str;
        this.f50041d = str2;
        this.f50046i = j11;
        this.f50044g = j12;
        this.f50042e = uri;
        this.f50047j = str3;
        this.f50048k = -1L;
    }

    public long c() {
        return this.f50046i;
    }

    public long d() {
        return this.f50048k;
    }

    public String e() {
        return this.f50040c;
    }

    public Uri f() {
        return this.f50042e;
    }

    public String g() {
        return this.f50041d;
    }

    public String h() {
        return this.f50047j;
    }

    public int i() {
        if (this.f50047j.contains("×")) {
            return Math.min(Integer.parseInt(this.f50047j.split("×")[0]), Integer.parseInt(this.f50047j.split("×")[1]));
        }
        return -1;
    }

    public long j() {
        return this.f50044g;
    }

    public boolean k() {
        return this.f50045h;
    }

    public void l(boolean z10) {
        this.f50045h = z10;
    }

    public void m(String str) {
        this.f50040c = str;
    }

    public void n(Uri uri) {
        this.f50042e = uri;
    }

    public void o(String str) {
        this.f50041d = str;
    }

    public void p(String str) {
        this.f50047j = str;
    }

    d(int i10, long j10, String str, String str2, long j11, Uri uri, long j12, String str3, long j13) {
        super(i10);
        this.f50045h = false;
        this.f50043f = j10;
        this.f50040c = str;
        this.f50041d = str2;
        this.f50046i = j11;
        this.f50044g = j12;
        this.f50042e = uri;
        this.f50047j = str3;
        this.f50048k = j13;
    }
}
