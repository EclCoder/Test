package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends Button {
    public aq(Context context) {
        super(context);
        hnj();
    }

    private void hnj() {
        setId(com.bytedance.sdk.openadsdk.utils.jip.krm);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, sq.hn(context, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_browser_download_selector"));
        setText(wu.hnj(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
