package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y f32956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final w f32957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f32958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f32959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q f32960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final r f32961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b0 f32962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final a0 f32963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final a0 f32964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final a0 f32965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final long f32966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f32967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile c f32968m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        y f32969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        w f32970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32971c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f32972d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        q f32973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        r.a f32974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        b0 f32975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        a0 f32976h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        a0 f32977i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        a0 f32978j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f32979k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f32980l;

        public a() {
            this.f32971c = -1;
            this.f32974f = new r.a();
        }

        public a a(y yVar) {
            this.f32969a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f32974f.c(str, str2);
            return this;
        }

        public a c(a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f32976h = a0Var;
            return this;
        }

        public a d(a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f32978j = a0Var;
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.f32962g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.f32970b = wVar;
            return this;
        }

        public a a(int i10) {
            this.f32971c = i10;
            return this;
        }

        a(a0 a0Var) {
            this.f32971c = -1;
            this.f32969a = a0Var.f32956a;
            this.f32970b = a0Var.f32957b;
            this.f32971c = a0Var.f32958c;
            this.f32972d = a0Var.f32959d;
            this.f32973e = a0Var.f32960e;
            this.f32974f = a0Var.f32961f.a();
            this.f32975g = a0Var.f32962g;
            this.f32976h = a0Var.f32963h;
            this.f32977i = a0Var.f32964i;
            this.f32978j = a0Var.f32965j;
            this.f32979k = a0Var.f32966k;
            this.f32980l = a0Var.f32967l;
        }

        public a a(String str) {
            this.f32972d = str;
            return this;
        }

        public a b(long j10) {
            this.f32979k = j10;
            return this;
        }

        public a a(q qVar) {
            this.f32973e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f32974f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f32974f = rVar.a();
            return this;
        }

        public a a(b0 b0Var) {
            this.f32975g = b0Var;
            return this;
        }

        public a a(a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f32977i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f32962g == null) {
                if (a0Var.f32963h == null) {
                    if (a0Var.f32964i == null) {
                        if (a0Var.f32965j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(long j10) {
            this.f32980l = j10;
            return this;
        }

        public a0 a() {
            if (this.f32969a != null) {
                if (this.f32970b != null) {
                    if (this.f32971c >= 0) {
                        if (this.f32972d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f32971c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    a0(a aVar) {
        this.f32956a = aVar.f32969a;
        this.f32957b = aVar.f32970b;
        this.f32958c = aVar.f32971c;
        this.f32959d = aVar.f32972d;
        this.f32960e = aVar.f32973e;
        this.f32961f = aVar.f32974f.a();
        this.f32962g = aVar.f32975g;
        this.f32963h = aVar.f32976h;
        this.f32964i = aVar.f32977i;
        this.f32965j = aVar.f32978j;
        this.f32966k = aVar.f32979k;
        this.f32967l = aVar.f32980l;
    }

    public String a(String str, String str2) {
        String strB = this.f32961f.b(str);
        return strB != null ? strB : str2;
    }

    public String b(String str) {
        return a(str, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f32962g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public b0 d() {
        return this.f32962g;
    }

    public c h() {
        c cVar = this.f32968m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f32961f);
        this.f32968m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f32958c;
    }

    public q l() {
        return this.f32960e;
    }

    public r m() {
        return this.f32961f;
    }

    public boolean n() {
        int i10 = this.f32958c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f32959d;
    }

    public a p() {
        return new a(this);
    }

    public a0 q() {
        return this.f32965j;
    }

    public long r() {
        return this.f32967l;
    }

    public y s() {
        return this.f32956a;
    }

    public long t() {
        return this.f32966k;
    }

    public String toString() {
        return "Response{protocol=" + this.f32957b + ", code=" + this.f32958c + ", message=" + this.f32959d + ", url=" + this.f32956a.g() + '}';
    }
}
