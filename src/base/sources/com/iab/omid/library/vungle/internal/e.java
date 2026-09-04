package com.iab.omid.library.vungle.internal;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f24260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24263d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24260a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f24261b = view.getClass().getCanonicalName();
        this.f24262c = friendlyObstructionPurpose;
        this.f24263d = str;
    }

    public String a() {
        return this.f24263d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24262c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f24260a;
    }

    public String d() {
        return this.f24261b;
    }
}
