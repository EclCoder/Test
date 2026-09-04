package com.iab.omid.library.mmadbridge.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f24178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f24179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f24180e;

    public a(b.InterfaceC0357b interfaceC0357b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0357b);
        this.f24178c = new HashSet<>(hashSet);
        this.f24179d = jSONObject;
        this.f24180e = j10;
    }
}
