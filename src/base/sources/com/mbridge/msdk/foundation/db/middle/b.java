package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f30257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f30258b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a f30260b;

        a(boolean z10, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f30259a = z10;
            this.f30260b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f30259a || b.this.f30258b == null) {
                return;
            }
            for (String str : this.f30260b.a()) {
                b.this.f30258b.a(str, b.this.f30257a.a(str));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class C0392b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f30262a = new b(null);
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f30257a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.n().d()));
            this.f30258b = kVarA;
            a(kVarA.d(), false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f30257a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z10, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f30257a.a());
    }

    public static b a() {
        return C0392b.f30262a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f30257a.a(str);
        if (jSONObjectA != null || (kVar = this.f30258b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f30257a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
