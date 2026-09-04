package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ComponentStrategy extends BaseComponentStrategy implements IVideoAdStrategy {
    public ComponentStrategy(String str, String str2, int i10) {
        super(str, str2, i10);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public boolean isReady() {
        try {
            return isReadyWithSyncWait(false);
        } catch (Exception e10) {
            q0.b("BaseComponentStrategy", "ComponentBidStrategy isBidReady error: " + e10.getMessage(), e10);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void load() {
        HashMap map = new HashMap();
        map.put("bid_token", "");
        map.put("is_hb", 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c1", map);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show() {
        HashMap map = new HashMap();
        map.put("user_id", this.userId);
        map.put("user_extra_data", this.extraData);
        map.put("is_hb", 0);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c2", map);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity) {
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str) {
        this.userId = str;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str) {
        this.userId = str;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        com.mbridge.msdk.foundation.controller.c.n().a(activity);
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }
}
