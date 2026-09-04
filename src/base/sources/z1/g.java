package z1;

import android.net.Uri;
import com.google.api.client.http.HttpMethods;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t1.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f58544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f58545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f58547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f58548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f58549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f58550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f58551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f58552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f58553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f58554k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f58555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f58556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f58557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f58558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f58559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f58560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f58561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f58562h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f58563i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f58564j;

        public g a() {
            w1.a.j(this.f58555a, "The uri must be set.");
            return new g(this.f58555a, this.f58556b, this.f58557c, this.f58558d, this.f58559e, this.f58560f, this.f58561g, this.f58562h, this.f58563i, this.f58564j);
        }

        public b b(int i10) {
            this.f58563i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f58558d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f58557c = i10;
            return this;
        }

        public b e(Map map) {
            this.f58559e = map;
            return this;
        }

        public b f(String str) {
            this.f58562h = str;
            return this;
        }

        public b g(long j10) {
            this.f58561g = j10;
            return this;
        }

        public b h(long j10) {
            this.f58560f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f58555a = uri;
            return this;
        }

        public b j(String str) {
            this.f58555a = Uri.parse(str);
            return this;
        }

        public b k(long j10) {
            this.f58556b = j10;
            return this;
        }

        public b() {
            this.f58557c = 1;
            this.f58559e = Collections.EMPTY_MAP;
            this.f58561g = -1L;
        }

        private b(g gVar) {
            this.f58555a = gVar.f58544a;
            this.f58556b = gVar.f58545b;
            this.f58557c = gVar.f58546c;
            this.f58558d = gVar.f58547d;
            this.f58559e = gVar.f58548e;
            this.f58560f = gVar.f58550g;
            this.f58561g = gVar.f58551h;
            this.f58562h = gVar.f58552i;
            this.f58563i = gVar.f58553j;
            this.f58564j = gVar.f58554k;
        }
    }

    static {
        s.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return HttpMethods.GET;
        }
        if (i10 == 2) {
            return HttpMethods.POST;
        }
        if (i10 == 3) {
            return HttpMethods.HEAD;
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f58546c);
    }

    public boolean d(int i10) {
        return (this.f58553j & i10) == i10;
    }

    public g e(long j10, long j11) {
        return (j10 == 0 && this.f58551h == j11) ? this : new g(this.f58544a, this.f58545b, this.f58546c, this.f58547d, this.f58548e, this.f58550g + j10, j11, this.f58552i, this.f58553j, this.f58554k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f58544a + ", " + this.f58550g + ", " + this.f58551h + ", " + this.f58552i + ", " + this.f58553j + "]";
    }

    private g(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        w1.a.a(j13 >= 0);
        w1.a.a(j11 >= 0);
        w1.a.a(j12 > 0 || j12 == -1);
        this.f58544a = (Uri) w1.a.e(uri);
        this.f58545b = j10;
        this.f58546c = i10;
        this.f58547d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f58548e = Collections.unmodifiableMap(new HashMap(map));
        this.f58550g = j11;
        this.f58549f = j13;
        this.f58551h = j12;
        this.f58552i = str;
        this.f58553j = i11;
        this.f58554k = obj;
    }
}
