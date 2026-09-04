package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends com.bytedance.sdk.openadsdk.core.dkl.gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14259hn;
    private float hnj;

    public dkl(Context context) {
        super(context);
        this.hnj = 2.25f;
        this.f14259hn = 12;
        hnj();
    }

    public static com.bytedance.sdk.openadsdk.core.dkl.gjv hn(Context context) {
        return new dkl(context, 28, 5.0f);
    }

    private void hnj() {
        setBackground(gjv.hnj());
        setImageResource(wu.gjv(getContext(), "tt_close_btn"));
        int iHn = sq.hn(getContext(), this.hnj);
        setPadding(iHn, iHn, iHn, iHn);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dkl.gjv, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iHn = sq.hn(getContext(), this.f14259hn);
            layoutParams.width = iHn;
            layoutParams.height = iHn;
        }
        super.setLayoutParams(layoutParams);
    }

    public dkl(Context context, int i10, float f10) {
        super(context);
        this.hnj = f10;
        this.f14259hn = i10;
        hnj();
    }

    public static com.bytedance.sdk.openadsdk.core.dkl.gjv hnj(Context context) {
        return new dkl(context);
    }
}
