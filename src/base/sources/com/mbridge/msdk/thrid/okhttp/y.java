package com.mbridge.msdk.thrid.okhttp;

import com.google.api.client.http.HttpMethods;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f33610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f33611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final r f33612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final z f33613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f33614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f33615f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f33616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f33617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        r.a f33618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        z f33619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f33620e;

        public a() {
            this.f33620e = Collections.EMPTY_MAP;
            this.f33617b = HttpMethods.GET;
            this.f33618c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f33616a = sVar;
            return this;
        }

        public a b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return a(s.b(str2));
        }

        public a c() {
            return a(HttpMethods.GET, (z) null);
        }

        public a d() {
            return a(HttpMethods.HEAD, (z) null);
        }

        public a c(z zVar) {
            return a(HttpMethods.POST, zVar);
        }

        public a d(z zVar) {
            return a(HttpMethods.PUT, zVar);
        }

        public a a(String str, String str2) {
            this.f33618c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f33618c.b(str);
            return this;
        }

        a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f33620e = map;
            this.f33616a = yVar.f33610a;
            this.f33617b = yVar.f33611b;
            this.f33619d = yVar.f33613d;
            this.f33620e = yVar.f33614e.isEmpty() ? map : new LinkedHashMap<>(yVar.f33614e);
            this.f33618c = yVar.f33612c.a();
        }

        public a a(r rVar) {
            this.f33618c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f33618c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f33110d);
        }

        public a a(z zVar) {
            return a(HttpMethods.DELETE, zVar);
        }

        public a b(z zVar) {
            return a(HttpMethods.PATCH, zVar);
        }

        public a a(String str, z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f33617b = str;
                    this.f33619d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public y a() {
            if (this.f33616a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    y(a aVar) {
        this.f33610a = aVar.f33616a;
        this.f33611b = aVar.f33617b;
        this.f33612c = aVar.f33618c.a();
        this.f33613d = aVar.f33619d;
        this.f33614e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f33620e);
    }

    public String a(String str) {
        return this.f33612c.b(str);
    }

    public c b() {
        c cVar = this.f33615f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f33612c);
        this.f33615f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f33612c;
    }

    public boolean d() {
        return this.f33610a.h();
    }

    public String e() {
        return this.f33611b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f33610a;
    }

    public String toString() {
        return "Request{method=" + this.f33611b + ", url=" + this.f33610a + ", tags=" + this.f33614e + '}';
    }

    public z a() {
        return this.f33613d;
    }
}
