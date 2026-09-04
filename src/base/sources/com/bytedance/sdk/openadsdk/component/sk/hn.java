package com.bytedance.sdk.openadsdk.component.sk;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Comparator;
import org.json.JSONObject;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn {
    public static final Comparator<hn> hnj = new Comparator<hn>() { // from class: com.bytedance.sdk.openadsdk.component.sk.hn.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public int compare(hn hnVar, hn hnVar2) {
            return hnVar.sk() != hnVar2.sk() ? Long.compare(hnVar2.sk(), hnVar.sk()) : Long.compare(hnVar2.qor(), hnVar.qor());
        }
    };
    private final long dkl;
    private final String dse;
    private final long gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final String f13566hn;
    private final String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private final long f13567sk;

    public hn(String str, String str2, long j10, long j11, long j12, String str3) {
        this.f13566hn = str;
        this.qor = str2;
        this.gjv = j10;
        this.f13567sk = j11;
        this.dkl = j12;
        this.dse = str3;
    }

    public static hn hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new hn(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong(BidResponsed.KEY_PRICE), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }

    public String dkl() {
        return this.dse;
    }

    public long gjv() {
        return this.f13567sk;
    }

    public String hn() {
        return this.qor;
    }

    public long qor() {
        return this.gjv;
    }

    public long sk() {
        return this.dkl;
    }

    public String toString() {
        return "AdCache{mRit=" + this.f13566hn + ", mExpireTime=" + this.gjv + SVWsZyNSAChGIA.oEcRoCqR + this.f13567sk + ", mPrice=" + this.dkl + ", mReqId='" + this.dse + '}';
    }

    public JSONObject hnj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.f13566hn);
            jSONObject.putOpt("material", this.qor);
            jSONObject.putOpt("expire_time", Long.valueOf(this.gjv));
            jSONObject.putOpt("create_time", Long.valueOf(this.f13567sk));
            jSONObject.putOpt(BidResponsed.KEY_PRICE, Long.valueOf(this.dkl));
            jSONObject.putOpt("req_id", this.dse);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
