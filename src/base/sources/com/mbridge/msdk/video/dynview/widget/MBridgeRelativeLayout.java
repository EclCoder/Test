package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.b;
import com.mbridge.msdk.video.dynview.moffer.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f34350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimatorSet f34352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f34354e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f34352c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        if (!this.f34351b && (dVar = this.f34350a) != null) {
            this.f34351b = true;
            dVar.a();
        }
        AnimatorSet animatorSet = this.f34352c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        b bVar;
        super.onVisibilityChanged(view, i10);
        if (!(view instanceof MBridgeRelativeLayout) || i10 != 0 || (bVar = this.f34354e) == null || this.f34353d) {
            return;
        }
        this.f34353d = true;
        bVar.a();
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f34352c = animatorSet;
    }

    public void setMoreOfferCacheReportCallBack(b bVar) {
        this.f34354e = bVar;
    }

    public void setMoreOfferShowFailedCallBack(d dVar) {
        this.f34350a = dVar;
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
