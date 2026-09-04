package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.api.client.http.HttpMethods;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o9.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f18782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f18783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f18789k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f18790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f18791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f18792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f18793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f18794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f18795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f18796g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f18797h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f18798i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f18799j;

        public a a() {
            ob.a.j(this.f18790a, "The uri must be set.");
            return new a(this.f18790a, this.f18791b, this.f18792c, this.f18793d, this.f18794e, this.f18795f, this.f18796g, this.f18797h, this.f18798i, this.f18799j);
        }

        public b b(int i10) {
            this.f18798i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f18793d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f18792c = i10;
            return this;
        }

        public b e(Map map) {
            this.f18794e = map;
            return this;
        }

        public b f(String str) {
            this.f18797h = str;
            return this;
        }

        public b g(long j10) {
            this.f18796g = j10;
            return this;
        }

        public b h(long j10) {
            this.f18795f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f18790a = uri;
            return this;
        }

        public b j(String str) {
            this.f18790a = Uri.parse(str);
            return this;
        }

        public b() {
            this.f18792c = 1;
            this.f18794e = Collections.EMPTY_MAP;
            this.f18796g = -1L;
        }

        private b(a aVar) {
            this.f18790a = aVar.f18779a;
            this.f18791b = aVar.f18780b;
            this.f18792c = aVar.f18781c;
            this.f18793d = aVar.f18782d;
            this.f18794e = aVar.f18783e;
            this.f18795f = aVar.f18785g;
            this.f18796g = aVar.f18786h;
            this.f18797h = aVar.f18787i;
            this.f18798i = aVar.f18788j;
            this.f18799j = aVar.f18789k;
        }
    }

    static {
        n.a("goog.exo.datasource");
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
        return c(this.f18781c);
    }

    public boolean d(int i10) {
        return (this.f18788j & i10) == i10;
    }

    public a e(long j10) {
        long j11 = this.f18786h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public a f(long j10, long j11) {
        return (j10 == 0 && this.f18786h == j11) ? this : new a(this.f18779a, this.f18780b, this.f18781c, this.f18782d, this.f18783e, this.f18785g + j10, j11, this.f18787i, this.f18788j, this.f18789k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f18779a + ", " + this.f18785g + ", " + this.f18786h + ", " + this.f18787i + ", " + this.f18788j + "]";
    }

    public a(Uri uri) {
        this(uri, 0L, -1L);
    }

    public a(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }

    private a(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        ob.a.a(j13 >= 0);
        ob.a.a(j11 >= 0);
        ob.a.a(j12 > 0 || j12 == -1);
        this.f18779a = uri;
        this.f18780b = j10;
        this.f18781c = i10;
        this.f18782d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f18783e = Collections.unmodifiableMap(new HashMap(map));
        this.f18785g = j11;
        this.f18784f = j13;
        this.f18786h = j12;
        this.f18787i = str;
        this.f18788j = i11;
        this.f18789k = obj;
    }
}
