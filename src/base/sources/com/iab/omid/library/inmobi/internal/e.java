package com.iab.omid.library.inmobi.internal;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f23965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f23967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23968d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23965a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f23966b = view.getClass().getCanonicalName();
        this.f23967c = friendlyObstructionPurpose;
        this.f23968d = str;
    }

    public String a() {
        return this.f23968d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f23967c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f23965a;
    }

    public String d() {
        return this.f23966b;
    }
}
