package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAdHandler implements BaseExtraInterfaceForHandler {
    protected static final String TAG = "BaseAdHandler";
    protected Context context;
    protected String placementId;
    protected String unitId;

    public BaseAdHandler(Context context, String str, String str2) {
        this.context = context;
        this.placementId = str;
        this.unitId = str2;
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        if (context instanceof Activity) {
            c.n().a(context);
        }
        initData(str, str2);
    }

    private void initData(String str, String str2) {
        initStrategy(str2, str);
        String strE = v0.e(str2);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        v0.d(str2, strE);
    }

    public Context getContext() {
        return this.context;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    protected abstract void initStrategy(String str, String str2);

    public BaseAdHandler(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
        initData(str, str2);
    }
}
