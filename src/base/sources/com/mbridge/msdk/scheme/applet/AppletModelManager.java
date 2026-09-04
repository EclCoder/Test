package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AppletModelManager {
    private static final String TAG = "AppletModelManager";
    private ConcurrentHashMap<String, AppletsModel> appletsModels;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class SingletonHolder {
        private static final AppletModelManager INSTANCE = new AppletModelManager();

        private SingletonHolder() {
        }
    }

    public static AppletModelManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public AppletsModel get(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String str = campaignEx.getRequestId() + "_" + campaignEx.getId() + "_" + campaignEx.getCampaignUnitId();
            if (this.appletsModels.containsKey(str)) {
                return this.appletsModels.get(str);
            }
            AppletsModel appletsModel = new AppletsModel(campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
            this.appletsModels.put(str, appletsModel);
            return appletsModel;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
            return null;
        }
    }

    public void remove(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + "_" + campaignEx.getId() + "_" + campaignEx.getCampaignUnitId();
            if (this.appletsModels.containsKey(str)) {
                this.appletsModels.remove(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    public void replace(AppletsModel appletsModel, CampaignEx campaignEx) {
        if (campaignEx == null || appletsModel == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + "_" + campaignEx.getId() + "_" + campaignEx.getCampaignUnitId();
            if (this.appletsModels.containsKey(str)) {
                this.appletsModels.remove(str);
            }
            this.appletsModels.put(str, appletsModel);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    private AppletModelManager() {
        this.appletsModels = new ConcurrentHashMap<>();
    }
}
