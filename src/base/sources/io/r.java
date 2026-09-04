package io;

import co.v;
import com.google.api.client.http.HttpMethods;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Charset f41568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v f41569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private URI f41570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private org.apache.http.message.q f41571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private co.j f41572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f41573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private go.a f41574h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f41575a;

        a(String str) {
            this.f41575a = str;
        }

        @Override // io.n, io.q
        public String getMethod() {
            return this.f41575a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f41576a;

        b(String str) {
            this.f41576a = str;
        }

        @Override // io.n, io.q
        public String getMethod() {
            return this.f41576a;
        }
    }

    r(String str) {
        this.f41568b = co.b.f10154a;
        this.f41567a = str;
    }

    public static r b(co.o oVar) {
        ip.a.h(oVar, "HTTP request");
        return new r().c(oVar);
    }

    private r c(co.o oVar) {
        if (oVar != null) {
            this.f41567a = oVar.getRequestLine().getMethod();
            this.f41569c = oVar.getRequestLine().getProtocolVersion();
            if (this.f41571e == null) {
                this.f41571e = new org.apache.http.message.q();
            }
            this.f41571e.g();
            this.f41571e.p(oVar.getAllHeaders());
            this.f41573g = null;
            this.f41572f = null;
            if (oVar instanceof co.k) {
                co.j entity = ((co.k) oVar).getEntity();
                org.apache.http.entity.d dVarE = org.apache.http.entity.d.e(entity);
                if (dVarE == null || !dVarE.h().equals(org.apache.http.entity.d.f49237e.h())) {
                    this.f41572f = entity;
                } else {
                    try {
                        List listI = lo.e.i(entity);
                        if (!listI.isEmpty()) {
                            this.f41573g = listI;
                        }
                    } catch (IOException unused) {
                    }
                }
            }
            if (oVar instanceof q) {
                this.f41570d = ((q) oVar).getURI();
            } else {
                this.f41570d = URI.create(oVar.getRequestLine().getUri());
            }
            if (oVar instanceof d) {
                this.f41574h = ((d) oVar).getConfig();
            } else {
                this.f41574h = null;
            }
        }
        return this;
    }

    public q a() {
        n bVar;
        URI uriB = this.f41570d;
        if (uriB == null) {
            uriB = URI.create("/");
        }
        co.j gVar = this.f41572f;
        List list = this.f41573g;
        if (list != null && !list.isEmpty()) {
            if (gVar == null && (HttpMethods.POST.equalsIgnoreCase(this.f41567a) || HttpMethods.PUT.equalsIgnoreCase(this.f41567a))) {
                List list2 = this.f41573g;
                Charset charset = this.f41568b;
                if (charset == null) {
                    charset = gp.e.f39837a;
                }
                gVar = new ho.g(list2, charset);
            } else {
                try {
                    uriB = new lo.c(uriB).q(this.f41568b).a(this.f41573g).b();
                } catch (URISyntaxException unused) {
                }
            }
        }
        if (gVar == null) {
            bVar = new b(this.f41567a);
        } else {
            a aVar = new a(this.f41567a);
            aVar.setEntity(gVar);
            bVar = aVar;
        }
        bVar.setProtocolVersion(this.f41569c);
        bVar.setURI(uriB);
        org.apache.http.message.q qVar = this.f41571e;
        if (qVar != null) {
            bVar.setHeaders(qVar.i());
        }
        bVar.setConfig(this.f41574h);
        return bVar;
    }

    public r d(URI uri) {
        this.f41570d = uri;
        return this;
    }

    public String toString() {
        return "RequestBuilder [method=" + this.f41567a + ", charset=" + this.f41568b + ", version=" + this.f41569c + ", uri=" + this.f41570d + ", headerGroup=" + this.f41571e + ", entity=" + this.f41572f + ", parameters=" + this.f41573g + ", config=" + this.f41574h + "]";
    }

    r() {
        this(null);
    }
}
