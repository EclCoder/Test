package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f23830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f23832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23833d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f23830a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f23831b = view.getClass().getCanonicalName();
        this.f23832c = friendlyObstructionPurpose;
        this.f23833d = str;
    }

    public String a() {
        return this.f23833d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f23832c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f23830a;
    }

    public String d() {
        return this.f23831b;
    }
}
