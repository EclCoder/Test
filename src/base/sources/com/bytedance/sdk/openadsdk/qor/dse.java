package com.bytedance.sdk.openadsdk.qor;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends LinearLayout {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private aq f14589hn;
    private final FilterWord hnj;
    private final ta qor;

    public dse(Context context, FilterWord filterWord, ta taVar) {
        super(context);
        setOrientation(1);
        this.hnj = filterWord;
        this.qor = taVar;
        hnj();
    }

    private void hn() {
        this.f14589hn = new aq(getContext(), this.qor);
        new LinearLayout.LayoutParams(-1, -2);
        this.f14589hn.hnj(this.hnj.getOptions());
        addView(this.f14589hn);
    }

    private void hnj() {
        qor();
        hn();
    }

    private void qor() {
        String name = this.hnj.getName();
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = sq.hn(getContext(), 12.0f);
        layoutParams.gravity = 17;
        aqVar.setGravity(17);
        aqVar.setText(name);
        aqVar.setTextColor(Color.argb(85, 22, 24, 35));
        aqVar.setTextSize(this.qor.ojm() ? 14 : 10);
        addView(aqVar, layoutParams);
    }
}
