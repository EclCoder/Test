package com.mbridge.msdk.foundation.error;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Throwable f30423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f30424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MBridgeIds f30425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f30426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f30427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30429j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f30430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f30431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f30432m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f30433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f30434o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f30435p;

    public b(int i10) {
        this.f30420a = i10;
        this.f30421b = a.b(i10);
    }

    public void a(Throwable th2) {
        this.f30423d = th2;
    }

    public void b(String str) {
        this.f30427h = str;
    }

    public void c(String str) {
        this.f30422c = str;
    }

    public CampaignEx d() {
        return this.f30424e;
    }

    public int g() {
        return this.f30420a;
    }

    public int h() {
        return this.f30421b;
    }

    public String i() {
        return this.f30435p;
    }

    public MBridgeIds j() {
        if (this.f30425f == null) {
            this.f30425f = new MBridgeIds();
        }
        return this.f30425f;
    }

    public String k() {
        return this.f30427h;
    }

    public String l() {
        int i10;
        String strA = !TextUtils.isEmpty(this.f30422c) ? this.f30422c : "";
        if (TextUtils.isEmpty(strA) && (i10 = this.f30420a) != -1) {
            strA = a.a(i10);
        }
        Throwable th2 = this.f30423d;
        if (th2 == null) {
            return strA;
        }
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strA;
        }
        return strA + " # " + message;
    }

    public String m() {
        return this.f30430k;
    }

    public int n() {
        return this.f30429j;
    }

    public void a(CampaignEx campaignEx) {
        this.f30424e = campaignEx;
    }

    public void d(String str) {
        this.f30430k = str;
    }

    public String toString() {
        return "MBFailureReason{errorCode=" + this.f30420a + ", errorSubType=" + this.f30421b + ", message='" + this.f30422c + "', cause=" + this.f30423d + ", campaign=" + this.f30424e + ", ids=" + this.f30425f + giNWGaNAgVQoO.CiatxgUEbNQDZ + this.f30426g + "', localRequestId='" + this.f30427h + "', isHeaderBidding=" + this.f30428i + ", typeD=" + this.f30429j + ", reasonD='" + this.f30430k + "', extraMap=" + this.f30431l + ", serverErrorCode=" + this.f30432m + ", errorUrl='" + this.f30433n + "', serverErrorResponse='" + this.f30434o + "'}";
    }

    public void a(MBridgeIds mBridgeIds) {
        this.f30425f = mBridgeIds;
    }

    public void a(boolean z10) {
        this.f30428i = z10;
    }

    public b(int i10, String str) {
        this.f30420a = i10;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f30422c = str;
        this.f30421b = a.b(i10);
    }

    public void a(Object obj, Object obj2) {
        if (this.f30431l == null) {
            this.f30431l = new HashMap<>();
        }
        this.f30431l.put(obj, obj2);
    }

    public Object a(Object obj) {
        HashMap<Object, Object> map = this.f30431l;
        if (map != null && map.containsKey(obj)) {
            return this.f30431l.get(obj);
        }
        return null;
    }

    public void a(int i10) {
        this.f30429j = i10;
    }

    public void a(String str) {
        this.f30435p = str;
    }
}
