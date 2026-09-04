package com.mbridge.msdk.out;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class LoadListener implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract void onLoadFaild(String str);

    public abstract void onLoadSucceed();
}
