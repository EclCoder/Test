package com.iab.omid.library.bytedance2.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f23902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f23903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f23904e;

    public a(b.InterfaceC0348b interfaceC0348b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0348b);
        this.f23902c = new HashSet<>(hashSet);
        this.f23903d = jSONObject;
        this.f23904e = j10;
    }
}
