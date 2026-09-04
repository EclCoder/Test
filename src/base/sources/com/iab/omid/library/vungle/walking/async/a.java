package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f24343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f24344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f24345e;

    public a(b.InterfaceC0363b interfaceC0363b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0363b);
        this.f24343c = new HashSet<>(hashSet);
        this.f24344d = jSONObject;
        this.f24345e = j10;
    }
}
