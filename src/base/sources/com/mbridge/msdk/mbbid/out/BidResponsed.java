package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    protected String f31384ln;
    private String price;

    /* JADX INFO: renamed from: wn, reason: collision with root package name */
    protected String f31385wn;

    public String getBidId() {
        return this.bidId;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCur() {
        return this.cur;
    }

    public String getLn() {
        return this.f31384ln;
    }

    public String getPrice() {
        return this.price;
    }

    public String getWn() {
        return this.f31385wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (TextUtils.isEmpty(this.f31384ln) || context == null || bidLossCode == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(this.f31384ln);
        if (this.f31384ln.contains("?")) {
            sb2.append("&");
        } else {
            sb2.append("?");
        }
        sb2.append("reason=");
        sb2.append(bidLossCode.getCurrentCode());
        a.a(context, (CampaignEx) null, "", sb2.toString(), false, false);
    }

    public void sendWinNotice(Context context) {
        if (TextUtils.isEmpty(this.f31385wn) || context == null) {
            return;
        }
        a.a(context, (CampaignEx) null, "", this.f31385wn, false, false);
    }

    protected void setBidId(String str) {
        this.bidId = str;
    }

    protected void setBidToken(String str) {
        this.bidToken = str;
    }

    protected void setCur(String str) {
        this.cur = str;
    }

    protected void setPrice(String str) {
        this.price = str;
    }
}
