package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vungle.ads.d0;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\fH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/vungle/ads/internal/ui/view/MediaView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzj/c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lfl/g0;", "setNativeVideoListener", "(Lzj/c;)V", "Lcom/vungle/ads/internal/l;", "internal", "present$vungle_ads_release", "(Lcom/vungle/ads/internal/l;)V", "present", "Lzj/a;", "getVideoControl$vungle_ads_release", "()Lzj/a;", "getVideoControl", "getDuration", "()I", "getCurrentTime", "destroy$vungle_ads_release", "()V", "destroy", "videoListener", "Lzj/c;", "Lcom/vungle/ads/internal/ui/view/h;", "contentView", "Lcom/vungle/ads/internal/ui/view/h;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MediaView extends RelativeLayout {
    private h contentView;
    private zj.c videoListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        this(context, null, 0, 6, null);
        s.h(context, "context");
    }

    public final void destroy$vungle_ads_release() {
        setOnClickListener(null);
        setOnTouchListener(null);
        removeAllViews();
        h hVar = this.contentView;
        if (hVar != null) {
            hVar.destroy$vungle_ads_release();
        }
        this.contentView = null;
    }

    public final int getCurrentTime() {
        zj.a videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getCurrentTime() : 0) / 1000;
    }

    public final int getDuration() {
        zj.a videoControl$vungle_ads_release = getVideoControl$vungle_ads_release();
        return (videoControl$vungle_ads_release != null ? videoControl$vungle_ads_release.getDuration() : 0) / 1000;
    }

    public final zj.a getVideoControl$vungle_ads_release() {
        ViewParent viewParent = this.contentView;
        if (viewParent instanceof zj.a) {
            return (zj.a) viewParent;
        }
        return null;
    }

    public final void present$vungle_ads_release(com.vungle.ads.internal.l internal) {
        s.h(internal, "internal");
        if (internal.hasVideoContent()) {
            if (this.contentView == null) {
                Context context = getContext();
                s.g(context, "context");
                n nVar = new n(context, internal);
                nVar.setNativeVideoListener(this.videoListener);
                com.vungle.ads.g gVar = com.vungle.ads.g.INSTANCE;
                d0 d0Var = new d0(Sdk$SDKMetric.b.NATIVE_PLAY_ASSET_TYPE);
                d0Var.setValue(1L);
                com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar, d0Var, internal.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.contentView = nVar;
            }
        } else if (this.contentView == null) {
            Context context2 = getContext();
            s.g(context2, "context");
            h hVar = new h(context2, internal);
            com.vungle.ads.g gVar2 = com.vungle.ads.g.INSTANCE;
            d0 d0Var2 = new d0(Sdk$SDKMetric.b.NATIVE_PLAY_ASSET_TYPE);
            d0Var2.setValue(2L);
            com.vungle.ads.g.logMetric$vungle_ads_release$default(gVar2, d0Var2, internal.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            this.contentView = hVar;
        }
        h hVar2 = this.contentView;
        if (hVar2 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            hVar2.setLayoutParams(layoutParams);
            if (!s.c(hVar2.getParent(), this)) {
                ViewGroup viewGroup = (ViewGroup) hVar2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(hVar2);
                }
                addView(hVar2);
            }
            Context context3 = getContext();
            s.g(context3, "context");
            hVar2.render(context3);
        }
    }

    public final void setNativeVideoListener(zj.c listener) {
        s.h(listener, "listener");
        this.videoListener = listener;
        h hVar = this.contentView;
        n nVar = hVar instanceof n ? (n) hVar : null;
        if (nVar == null) {
            return;
        }
        nVar.setNativeVideoListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.h(context, "context");
    }

    public /* synthetic */ MediaView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s.h(context, "context");
    }
}
