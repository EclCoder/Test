package com.iab.omid.library.inmobi.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f24043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f24044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f24045e;

    public a(b.InterfaceC0353b interfaceC0353b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0353b);
        this.f24043c = new HashSet<>(hashSet);
        this.f24044d = jSONObject;
        this.f24045e = j10;
    }
}
