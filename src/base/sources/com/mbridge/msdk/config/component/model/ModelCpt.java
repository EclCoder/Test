package com.mbridge.msdk.config.component.model;

import android.text.TextUtils;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ModelCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f29016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f29017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f29018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f29019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29020l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f29021m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> mapD;
            String strValueOf = String.valueOf(ModelCpt.this.f29021m);
            if (strValueOf.startsWith("SELECT") || strValueOf.startsWith("select")) {
                mapD = com.mbridge.msdk.config.component.database.a.a().d(strValueOf);
            } else {
                mapD = (strValueOf.startsWith(HttpMethods.DELETE) || strValueOf.startsWith("delete")) ? com.mbridge.msdk.config.component.database.a.a().a(strValueOf) : com.mbridge.msdk.config.component.database.a.a().c(strValueOf);
            }
            Object obj = mapD.get(c.c("code"));
            if ((obj instanceof Integer ? ((Integer) obj).intValue() : 0) == 1) {
                ModelCpt.this.a(true, "", mapD.get(c.c(DataSchemeDataSource.SCHEME_DATA)));
            } else {
                ModelCpt.this.a(false, String.valueOf(mapD.get(c.c("reason"))), (Object) null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ModelCpt.this.f29018j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(str, String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.f29021m)) {
            return;
        }
        a aVar = new a();
        if (this.f29020l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    private void h() {
        Map<String, Object> map = this.f29017i;
        if (map == null || this.f28521d == null || this.f29018j == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = (String) map.get(c.c("120"));
        if (TextUtils.isEmpty(str)) {
            a(false, "Scope name is empty", (Object) null);
            return;
        }
        Iterator<Map.Entry<String, Object>> it = this.f29018j.entrySet().iterator();
        String str2 = "";
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    a(z10, str2, (Object) null);
                    return;
                }
                Map.Entry<String, Object> next = it.next();
                if (next != null && !TextUtils.isEmpty(next.getKey()) && !c.c("120").equals(next.getKey())) {
                    try {
                        String key = next.getKey();
                        String str3 = str + "." + key;
                        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = c.a(this.f28521d, str3);
                        if (aVarA != null) {
                            if (aVarA.a(str3, key, next.getValue()).intValue() != 1) {
                                break;
                            } else {
                                z10 = true;
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception e10) {
                        str2 = "Failed to modify data in scope: " + e10.getMessage();
                        q0.b("ModelCpt", str2);
                    }
                }
            }
        }
    }

    private void j() {
        b bVar = new b();
        if (this.f29020l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            if (c.c("313").equals(this.f29019k)) {
                g();
                return;
            }
            if (c.c("314").equals(this.f29019k)) {
                j();
            } else if (this.f29016h.equals("withScope")) {
                h();
            } else {
                i();
            }
        } catch (Exception e10) {
            q0.b("ModelCpt", "Error during execution: " + e10.getMessage());
            a(false, "Execution failed: " + e10.getMessage(), (Object) null);
        }
    }

    private void i() {
        Map<String, Object> map;
        if (this.f29017i == null || this.f28521d == null || (map = this.f29018j) == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = Saucuwx.BWg;
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    try {
                        z10 = this.f28521d.a(entry.getKey(), entry.getValue()).intValue() == 1;
                        if (!z10) {
                            str = "Failed to modify data";
                        }
                    } catch (Exception e10) {
                        str = "Failed to modify data without scope: " + e10.getMessage();
                        q0.b("ModelCpt", str);
                    }
                }
            }
            a(z10, str, (Object) null);
            return;
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f28523f = "914001";
        this.f29017i = map;
        if (map.isEmpty()) {
            q0.b("ModelCpt", "Config parameters is null");
            return;
        }
        this.f29016h = map.containsKey(c.c("120")) ? "withScope" : "withoutScope";
        Object obj = map.get(c.c("121"));
        if (obj instanceof Map) {
            this.f29018j = (Map) obj;
        }
        Object obj2 = map.get(c.c("117"));
        if (obj2 != null) {
            this.f29019k = String.valueOf(obj2);
        }
        Object obj3 = map.get(c.c("background"));
        if (obj3 != null) {
            this.f29020l = Integer.parseInt(String.valueOf(obj3));
        }
        Object obj4 = map.get(c.c("118"));
        if (obj4 != null) {
            this.f29021m = String.valueOf(obj4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, String str, Object obj) {
        HashMap map = new HashMap();
        map.put(c.c("500"), Integer.valueOf(z10 ? 1 : 0));
        map.put(c.c("code"), "");
        map.put(c.c("reason"), str);
        if (obj != null) {
            map.put(c.c(DataSchemeDataSource.SCHEME_DATA), obj);
        }
        a(a("914002", (Map<String, Object>) map));
    }
}
