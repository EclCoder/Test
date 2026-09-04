package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private int f14638hn;
        private final Drawable hnj;
        private int qor;

        public hnj(Drawable drawable) {
            this.hnj = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 == this.f14638hn && i19 == this.qor) {
                return;
            }
            this.f14638hn = i18;
            this.qor = i19;
            this.hnj.setBounds(0, 0, i18, i19);
        }
    }

    public static void hnj(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (viewGroup == null || asVar == null || TextUtils.isEmpty(asVar.hqh())) {
            return;
        }
        try {
            int i10 = jip.mzt;
            if (viewGroup.getTag(i10) != null) {
                return;
            }
            viewGroup.setTag(i10, Integer.valueOf(i10));
            Drawable drawableHnj = hnj(viewGroup.getResources(), asVar);
            if (drawableHnj == null) {
                return;
            }
            viewGroup.setForeground(drawableHnj);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("add overlay fail", th2.getMessage());
        }
    }

    public static void hnj(Activity activity, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        if (activity == null || asVar == null || TextUtils.isEmpty(asVar.hqh())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i10 = jip.mzt;
            if (decorView.getTag(i10) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i10, Integer.valueOf(i10));
            Drawable drawableHnj = hnj(activity.getResources(), asVar);
            if (drawableHnj == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableHnj);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.apu.qor("add overlay fail", th2.getMessage());
        }
    }

    private static Drawable hnj(Resources resources, com.bytedance.sdk.openadsdk.core.model.as asVar) {
        try {
            String strHqh = asVar.hqh();
            if (TextUtils.isEmpty(strHqh)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strHqh, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
