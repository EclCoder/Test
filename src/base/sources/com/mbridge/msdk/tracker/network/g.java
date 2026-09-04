package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33784b;

    public g(String str, String str2) {
        this.f33783a = str;
        this.f33784b = str2;
    }

    public final String a() {
        return this.f33783a;
    }

    public final String b() {
        return this.f33784b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f33783a, gVar.f33783a) && TextUtils.equals(this.f33784b, gVar.f33784b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f33783a.hashCode() * 31) + this.f33784b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f33783a + vHmGJpUTWNVV.fiPSHw + this.f33784b + "]";
    }
}
