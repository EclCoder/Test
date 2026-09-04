package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f24100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f24102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f24103d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f24100a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f24101b = view.getClass().getCanonicalName();
        this.f24102c = friendlyObstructionPurpose;
        this.f24103d = str;
    }

    public String a() {
        return this.f24103d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f24102c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f24100a;
    }

    public String d() {
        return this.f24101b;
    }
}
