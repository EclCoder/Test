package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0357b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f24187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f24188b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f24188b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0357b
    public JSONObject a() {
        return this.f24187a;
    }

    public void b() {
        this.f24188b.b(new d(this));
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0357b
    public void a(JSONObject jSONObject) {
        this.f24187a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24188b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f24188b.b(new e(this, hashSet, jSONObject, j10));
    }
}
