package eo;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f38104a = a.UNCHALLENGED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f38105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f38106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f38107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Queue f38108e;

    public b a() {
        return this.f38105b;
    }

    public j b() {
        return this.f38107d;
    }

    public a c() {
        return this.f38104a;
    }

    public boolean d() {
        b bVar = this.f38105b;
        return bVar != null && bVar.g();
    }

    public void e() {
        this.f38104a = a.UNCHALLENGED;
        this.f38108e = null;
        this.f38105b = null;
        this.f38106c = null;
        this.f38107d = null;
    }

    public void f(a aVar) {
        if (aVar == null) {
            aVar = a.UNCHALLENGED;
        }
        this.f38104a = aVar;
    }

    public void g(b bVar, j jVar) {
        ip.a.h(bVar, "Auth scheme");
        ip.a.h(jVar, "Credentials");
        this.f38105b = bVar;
        this.f38107d = jVar;
        this.f38108e = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("state:");
        sb2.append(this.f38104a);
        sb2.append(";");
        if (this.f38105b != null) {
            sb2.append("auth scheme:");
            sb2.append(this.f38105b.h());
            sb2.append(";");
        }
        if (this.f38107d != null) {
            sb2.append("credentials present");
        }
        return sb2.toString();
    }
}
