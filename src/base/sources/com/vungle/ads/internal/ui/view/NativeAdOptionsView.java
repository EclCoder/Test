package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/ui/view/NativeAdOptionsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lfl/g0;", "initView", "Landroid/widget/ImageView;", "getPrivacyIcon$vungle_ads_release", "()Landroid/widget/ImageView;", "getPrivacyIcon", "rootView", "optionsPosition", "renderTo", "(Landroid/widget/FrameLayout;I)V", "destroy", "()V", RewardPlus.ICON, "Landroid/widget/ImageView;", "", "destroyed", "Z", "Companion", "a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeAdOptionsView extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    private boolean destroyed;
    private ImageView icon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context) {
        super(context);
        s.h(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int iDpToPixels = a0.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        ImageView imageView = this.icon;
        ImageView imageView2 = null;
        if (imageView == null) {
            s.w(RewardPlus.ICON);
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            s.w(RewardPlus.ICON);
        } else {
            imageView2 = imageView3;
        }
        addView(imageView2);
    }

    public final void destroy() {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        try {
            ImageView imageView = this.icon;
            if (imageView == null) {
                s.w(RewardPlus.ICON);
                imageView = null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            q.Companion.w("NativeAd", "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView2 = this.icon;
        if (imageView2 == null) {
            s.w(RewardPlus.ICON);
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            s.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        s.w(RewardPlus.ICON);
        return null;
    }

    public final void renderTo(FrameLayout rootView, int optionsPosition) {
        s.h(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            s.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        a0 a0Var = a0.INSTANCE;
        Context context = getContext();
        s.g(context, "context");
        int iDpToPixels = a0Var.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        if (optionsPosition == 0) {
            layoutParams.gravity = 8388659;
        } else if (optionsPosition == 1) {
            layoutParams.gravity = 8388661;
        } else if (optionsPosition == 2) {
            layoutParams.gravity = 8388691;
        } else if (optionsPosition != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.h(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s.h(context, "context");
        initView(context);
    }
}
