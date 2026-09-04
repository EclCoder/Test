package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.async.d;
import com.iab.omid.library.inmobi.walking.async.e;
import com.iab.omid.library.inmobi.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.iab.omid.library.inmobi.walking.async.b.InterfaceC0353b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.async.c f24053b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.f24053b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0353b
    public JSONObject a() {
        return this.f24052a;
    }

    public void b() {
        this.f24053b.b(new d(this));
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0353b
    public void a(JSONObject jSONObject) {
        this.f24052a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24053b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24053b.b(new e(this, hashSet, jSONObject, j10));
    }
}
