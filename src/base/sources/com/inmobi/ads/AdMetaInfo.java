package com.inmobi.ads;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/inmobi/ads/AdMetaInfo;", "", "", "creativeID", "Lorg/json/JSONObject;", "mTransactionInfo", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "a", "Ljava/lang/String;", "getCreativeID", "()Ljava/lang/String;", "", "getBid", "()D", BidResponsed.KEY_BID_ID, "getBidInfo", "()Lorg/json/JSONObject;", "bidInfo", "getBidKeyword", "bidKeyword", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String creativeID;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f24360b;

    public AdMetaInfo(String creativeID, JSONObject jSONObject) {
        s.h(creativeID, "creativeID");
        this.creativeID = creativeID;
        this.f24360b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f24360b;
        if (jSONObject != null) {
            return jSONObject.optDouble("buyerPrice");
        }
        return 0.0d;
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f24360b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f24360b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    public final String getCreativeID() {
        return this.creativeID;
    }
}
