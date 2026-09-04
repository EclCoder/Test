package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b implements com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0348b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f23911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f23912b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f23912b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0348b
    public JSONObject a() {
        return this.f23911a;
    }

    public void b() {
        this.f23912b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0348b
    public void a(JSONObject jSONObject) {
        this.f23911a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f23912b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f23912b.b(new e(this, hashSet, jSONObject, j10));
    }
}
