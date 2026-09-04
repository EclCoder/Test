package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.iab.omid.library.vungle.walking.async.b.InterfaceC0363b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.async.c f24353b;

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.f24353b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0363b
    public JSONObject a() {
        return this.f24352a;
    }

    public void b() {
        this.f24353b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0363b
    public void a(JSONObject jSONObject) {
        this.f24352a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24353b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24353b.b(new e(this, hashSet, jSONObject, j10));
    }
}
