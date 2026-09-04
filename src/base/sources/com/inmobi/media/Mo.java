package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25298d;

    public Mo(int i10, int i11, int i12, int i13) {
        this.f25295a = i10;
        this.f25296b = i11;
        this.f25297c = i12;
        this.f25298d = i13;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.LEFT, J3.a(this.f25295a));
            jSONObject.put("top", J3.a(this.f25296b));
            jSONObject.put(TtmlNode.RIGHT, J3.a(this.f25297c));
            jSONObject.put("bottom", J3.a(this.f25298d));
            return jSONObject;
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mo)) {
            return false;
        }
        Mo mo2 = (Mo) obj;
        return this.f25295a == mo2.f25295a && this.f25296b == mo2.f25296b && this.f25297c == mo2.f25297c && this.f25298d == mo2.f25298d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25298d) + AbstractC3305si.a(this.f25297c, AbstractC3305si.a(this.f25296b, Integer.hashCode(this.f25295a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + this.f25295a + ", top=" + this.f25296b + ", right=" + this.f25297c + ", bottom=" + this.f25298d + ")";
    }
}
