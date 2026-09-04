package org.apache.http.message;

import co.w;
import co.y;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class i extends a implements co.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y f49399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private co.v f49400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f49402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private co.j f49403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f49404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Locale f49405g;

    public i(co.v vVar, int i10, String str) {
        ip.a.g(i10, "Status code");
        this.f49399a = null;
        this.f49400b = vVar;
        this.f49401c = i10;
        this.f49402d = str;
        this.f49404f = null;
        this.f49405g = null;
    }

    @Override // co.q
    public y b() {
        if (this.f49399a == null) {
            co.v vVar = this.f49400b;
            if (vVar == null) {
                vVar = co.t.f10164f;
            }
            int i10 = this.f49401c;
            String strC = this.f49402d;
            if (strC == null) {
                strC = c(i10);
            }
            this.f49399a = new o(vVar, i10, strC);
        }
        return this.f49399a;
    }

    protected String c(int i10) {
        w wVar = this.f49404f;
        if (wVar == null) {
            return null;
        }
        Locale locale = this.f49405g;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return wVar.a(i10, locale);
    }

    @Override // co.q
    public co.j getEntity() {
        return this.f49403e;
    }

    @Override // co.n
    public co.v getProtocolVersion() {
        return this.f49400b;
    }

    @Override // co.q
    public void setEntity(co.j jVar) {
        this.f49403e = jVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        sb2.append(' ');
        sb2.append(this.headergroup);
        if (this.f49403e != null) {
            sb2.append(' ');
            sb2.append(this.f49403e);
        }
        return sb2.toString();
    }
}
