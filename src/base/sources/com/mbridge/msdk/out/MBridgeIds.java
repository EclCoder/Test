package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBridgeIds implements Serializable, NoProGuard {
    private String contextId;
    private String placementId;
    private String requestId;
    private String unitId;
    private String bidToken = "";
    private boolean isCache = false;

    public MBridgeIds() {
    }

    public String getBidToken() {
        if (TextUtils.isEmpty(this.bidToken)) {
            this.bidToken = "";
        }
        return this.bidToken;
    }

    public String getContextId() {
        return this.contextId;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getRequestId() {
        return TextUtils.isEmpty(this.requestId) ? "" : this.requestId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCache(boolean z10) {
        this.isCache = z10;
    }

    public void setContextId(String str) {
        this.contextId = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public String toString() {
        return "MBridgeIds{placementId='" + this.placementId + '\'' + OGoz.GdkoE + this.unitId + "', bidToken='" + this.bidToken + "'}";
    }

    public MBridgeIds(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
    }

    public MBridgeIds(String str, String str2, String str3) {
        this.placementId = str;
        this.unitId = str2;
        this.requestId = str3;
    }
}
