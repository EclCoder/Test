package com.hecorat.screenrecorder.free.activities;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.activities.MediaViewActivity;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import n0.b0;
import n0.e1;
import n0.k1;
import n0.o1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/hecorat/screenrecorder/free/activities/MediaViewActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/view/View;", "v", "", "l", "t", CampaignEx.JSON_KEY_AD_R, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/g0;", "A0", "(Landroid/view/View;IIII)V", "", "z0", "()Z", "rootView", "actionBar", "controllerBar", "B0", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "y0", "(Landroid/view/View;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MediaViewActivity extends androidx.appcompat.app.d {
    private final void A0(View v10, int l10, int t10, int r10, int b10) {
        if (v10.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
            s.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(l10, t10, r10, b10);
            v10.requestLayout();
        }
    }

    public static final k1 C0(MediaViewActivity mediaViewActivity, View view, View view2, View view3, k1 insets) {
        s.h(insets, "insets");
        e0.b bVarG = insets.g(k1.s.g());
        s.g(bVarG, "getInsets(...)");
        mediaViewActivity.A0(view, bVarG.f37000a, bVarG.f37001b, bVarG.f37002c, 0);
        mediaViewActivity.A0(view2, bVarG.f37000a, 0, bVarG.f37002c, bVarG.f37003d);
        return insets;
    }

    protected final void B0(View rootView, final View actionBar, final View controllerBar) {
        s.h(rootView, "rootView");
        s.h(actionBar, "actionBar");
        s.h(controllerBar, "controllerBar");
        if (z0()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            e1.b(getWindow(), false);
            new o1(getWindow(), rootView).f(k1.s.g());
            q0.w0(rootView, new b0() { // from class: ff.i0
                @Override // n0.b0
                public final n0.k1 a(View view, n0.k1 k1Var) {
                    return MediaViewActivity.C0(this.f38530a, actionBar, controllerBar, view, k1Var);
                }
            });
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(1793);
        int iM = nh.b.m(this);
        int i10 = nh.b.i(this);
        if (nh.b.o(this)) {
            if (nh.b.q(this)) {
                A0(actionBar, 0, iM, 0, 0);
                A0(controllerBar, 0, 0, 0, i10);
                return;
            } else {
                A0(actionBar, 0, iM, 0, 0);
                A0(controllerBar, 0, 0, 0, i10);
                return;
            }
        }
        if (nh.b.q(this)) {
            A0(actionBar, i10, iM, 0, 0);
            A0(controllerBar, i10, 0, 0, 0);
        } else {
            A0(actionBar, 0, iM, i10, 0);
            A0(controllerBar, 0, 0, i10, 0);
        }
    }

    protected final void y0(View rootView) {
        s.h(rootView, "rootView");
        if (z0()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        e1.b(getWindow(), false);
        o1 o1Var = new o1(getWindow(), rootView);
        o1Var.a(k1.s.g());
        o1Var.e(2);
    }

    protected final boolean z0() {
        return isInPictureInPictureMode();
    }
}
