package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class Frame {
    private List<CampaignEx> campaigns;
    private String parentSessionId;
    private String sessionId;
    private int template;

    public List<CampaignEx> getCampaigns() {
        return this.campaigns;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public int getTemplate() {
        return this.template;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.campaigns = list;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setTemplate(int i10) {
        this.template = i10;
    }
}
