package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.h;
import com.mbridge.msdk.config.component.common.express.operator.i;
import com.mbridge.msdk.config.component.common.express.operator.j;
import com.mbridge.msdk.config.component.common.express.operator.k;
import com.mbridge.msdk.config.component.common.express.operator.l;
import com.mbridge.msdk.config.component.common.express.operator.m;
import com.mbridge.msdk.config.component.common.express.operator.n;
import com.mbridge.msdk.config.component.common.express.operator.o;
import com.mbridge.msdk.config.component.common.express.operator.p;
import com.mbridge.msdk.config.component.common.express.operator.q;
import com.mbridge.msdk.config.component.common.express.operator.r;
import com.mbridge.msdk.config.component.common.express.operator.s;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f28553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.c f28554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.d f28555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.f f28556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.e f28557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q f28558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s f28559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f28560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f28561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f28562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.a f28563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i f28564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k f28565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.b f28566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final r f28567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final j f28568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p f28569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final n f28570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f28571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.g f28572t;

    public d() {
        com.mbridge.msdk.config.component.common.express.operator.parts.c cVar = new com.mbridge.msdk.config.component.common.express.operator.parts.c();
        this.f28553a = cVar;
        this.f28554b = new com.mbridge.msdk.config.component.common.express.operator.c(cVar);
        this.f28555c = new com.mbridge.msdk.config.component.common.express.operator.d(cVar);
        this.f28556d = new com.mbridge.msdk.config.component.common.express.operator.f(cVar);
        this.f28557e = new com.mbridge.msdk.config.component.common.express.operator.e(cVar);
        this.f28558f = new q(cVar);
        this.f28559g = new s(cVar);
        this.f28560h = new o(cVar);
        this.f28561i = new m(cVar);
        this.f28562j = new l(cVar);
        this.f28563k = new com.mbridge.msdk.config.component.common.express.operator.a(cVar);
        this.f28564l = new i(cVar);
        this.f28565m = new k(cVar);
        this.f28566n = new com.mbridge.msdk.config.component.common.express.operator.b(cVar);
        this.f28567o = new r(cVar);
        this.f28568p = new j();
        this.f28569q = new p(cVar);
        this.f28570r = new n(cVar);
        this.f28571s = new h(cVar);
        this.f28572t = new com.mbridge.msdk.config.component.common.express.operator.g(cVar);
    }

    public Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("\"") && str.endsWith("\"") && str.replace("\\\"", "").split("\"").length == 2) {
            return str.substring(1, str.length() - 1);
        }
        try {
            Object objA = new a().a(str).a(this, e.OTHER, aVar);
            return objA == null ? "" : objA;
        } catch (Exception e10) {
            q0.a("ExpressionOperator", "execute-e: " + e10.getMessage());
            return "";
        }
    }

    public Object a(Object obj, List<Object> list, String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        b bVar = new b();
        bVar.a(obj);
        bVar.a(list);
        bVar.a(str);
        return a(bVar, aVar);
    }

    private Object a(b bVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        String strB = bVar.b();
        Object objA = bVar.a();
        List<Object> listC = bVar.c();
        try {
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB = this.f28570r.b(strB, objA, listC, aVar);
            if (aVarB.b()) {
                return aVarB.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA = this.f28557e.a(strB, objA, listC);
            if (aVarA.b()) {
                return aVarA.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA2 = this.f28556d.a(strB, objA, listC);
            if (aVarA2.b()) {
                return aVarA2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA3 = this.f28555c.a(strB, objA, listC);
            if (aVarA3.b()) {
                return aVarA3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA4 = this.f28558f.a(strB, objA, listC);
            if (aVarA4.b()) {
                return aVarA4.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA5 = this.f28565m.a(strB, objA, listC);
            if (aVarA5.b()) {
                return aVarA5.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA6 = this.f28561i.a(strB, objA, listC);
            if (aVarA6.b()) {
                return aVarA6.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA7 = this.f28559g.a(strB, objA, listC);
            if (aVarA7.b()) {
                return aVarA7.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarI = this.f28560h.i(strB, objA, listC);
            if (aVarI.b()) {
                return aVarI.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB2 = this.f28562j.b(strB, objA, listC);
            if (aVarB2.b()) {
                return aVarB2.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA8 = this.f28563k.a(strB, objA, listC);
            if (aVarA8.b()) {
                return aVarA8.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA9 = this.f28567o.a(strB, objA, listC);
            if (aVarA9.b()) {
                return aVarA9.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA10 = this.f28569q.a(strB, objA, listC);
            if (aVarA10.b()) {
                return aVarA10.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarB3 = this.f28568p.b(strB, objA, listC);
            if (aVarB3.b()) {
                return aVarB3.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA11 = this.f28554b.a(strB, objA, listC);
            if (aVarA11.b()) {
                return aVarA11.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA12 = this.f28571s.a(strB, objA, listC);
            if (aVarA12.b()) {
                return aVarA12.a();
            }
            com.mbridge.msdk.config.component.common.express.operator.parts.a aVarA13 = this.f28572t.a(strB, objA, listC);
            return aVarA13.b() ? aVarA13.a() : strB;
        } catch (Exception e10) {
            q0.b("ExpressionOperator", e10.getMessage(), e10);
            return null;
        }
    }
}
