package com.iab.omid.library.inmobi.adsession.media;

import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public enum InteractionType {
    CLICK(CampaignEx.JSON_NATIVE_VIDEO_CLICK),
    INVITATION_ACCEPTED(mTFeqtajA.FyQUyErw);

    String interactionType;

    InteractionType(String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.interactionType;
    }
}
