package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b6.a;
import b6.b;
import com.bytedance.sdk.component.adexpress.dkl.Cdo;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm extends dkl {
    private String hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements com.bytedance.sdk.component.sk.jip {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private Resources f12532hn;
        private WeakReference<View> hnj;

        public hn(View view, Resources resources) {
            this.hnj = new WeakReference<>(view);
            this.f12532hn = resources;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
            Object objHn;
            View view = this.hnj.get();
            if (view == null || (objHn = dnmVar.hn()) == null || dnmVar.qor() == null) {
                return;
            }
            if (objHn instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.f12532hn, (Bitmap) objHn));
            } else if (objHn instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.a(objHn)) {
                    b.a(objHn).start();
                }
                view.setBackground((Drawable) objHn);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements com.bytedance.sdk.component.sk.aq {
        private final WeakReference<Context> hnj;

        public hnj(Context context) {
            this.hnj = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.sk.aq
        public Bitmap hnj(Bitmap bitmap) {
            Context context = this.hnj.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.gjv.hnj.hnj(context, bitmap, 25);
            }
            return null;
        }
    }

    public dnm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        if (!TextUtils.isEmpty(this.bug.tll()) && aqVar.xn()) {
            com.bytedance.sdk.component.adexpress.dkl.ta taVar = new com.bytedance.sdk.component.adexpress.dkl.ta(context);
            taVar.setAnimationsLoop(this.bug.th());
            taVar.setImageLottieTosPath(this.bug.tll());
            taVar.setLottieAppNameMaxLength(this.bug.znr());
            taVar.setLottieAdTitleMaxLength(this.bug.fzb());
            taVar.setLottieAdDescMaxLength(this.bug.jo());
            taVar.setData(aqVar.apu());
            this.f12547fc = taVar;
        } else if (this.bug.fc() > 0.0f) {
            Cdo cdo = new Cdo(context);
            this.f12547fc = cdo;
            cdo.setXRound((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, this.bug.fc()));
            ((Cdo) this.f12547fc).setYRound((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, this.bug.fc()));
        } else if (aq() || !"arrowButton".equals(aqVar.ta().hn())) {
            this.f12547fc = new ImageView(context);
        } else {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.hn hnVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.hn(context);
            hnVar.setBrickNativeValue(this.bug);
            this.f12547fc = hnVar;
        }
        this.hnj = getImageKey();
        this.f12547fc.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(aqVar.ta().hn())) {
            if (this.bug.hn() > 0 || this.bug.hnj() > 0) {
                int iMin = Math.min(this.dse, this.aq);
                this.dse = iMin;
                this.aq = Math.min(iMin, this.aq);
                this.ojm = (int) (this.ojm + com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, this.bug.hn() + (this.bug.hnj() / 2) + 0.5f));
            } else {
                int iMax = Math.max(this.dse, this.aq);
                this.dse = iMax;
                this.aq = Math.max(iMax, this.aq);
            }
            this.bug.hnj(this.dse / 2);
        }
        addView(this.f12547fc, new FrameLayout.LayoutParams(this.dse, this.aq));
    }

    private String getImageKey() {
        Map<String, String> mapDnm = this.mjg.getRenderRequest().dnm();
        if (mapDnm == null || mapDnm.size() <= 0) {
            return null;
        }
        return mapDnm.get(this.bug.dnm());
    }

    private boolean hnj() {
        String strBug = this.bug.bug();
        if (this.bug.apu()) {
            return true;
        }
        if (TextUtils.isEmpty(strBug)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strBug);
            return Math.abs((((float) this.dse) / (((float) this.aq) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        int iUua;
        super.ojm();
        if (!TextUtils.isEmpty(this.bug.tll())) {
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iJip = 0;
        if ("arrowButton".equals(this.orl.ta().hn())) {
            ((ImageView) this.f12547fc).setImageResource(com.bytedance.sdk.component.utils.wu.gjv(this.dnm, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.f12547fc).getDrawable() != null) {
                ((ImageView) this.f12547fc).getDrawable().setAutoMirrored(true);
            }
            this.f12547fc.setPadding(0, 0, 0, 0);
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f12547fc.setBackgroundColor(this.bug.vf());
        String strQor = this.orl.ta().qor();
        if ("user".equals(strQor)) {
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f12547fc).setColorFilter(this.bug.dse());
            ((ImageView) this.f12547fc).setImageDrawable(com.bytedance.sdk.component.utils.wu.qor(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.f12547fc;
            int i10 = this.dse;
            imageView.setPadding(i10 / 10, this.aq / 5, i10 / 10, 0);
        } else if (strQor != null && strQor.startsWith("@")) {
            try {
                ((ImageView) this.f12547fc).setImageResource(Integer.parseInt(strQor.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.sk.fc fcVarSk = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().sk();
        String strDnm = this.bug.dnm();
        if (!TextUtils.isEmpty(strDnm) && !strDnm.startsWith("http:") && !strDnm.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.mjg;
            strDnm = com.bytedance.sdk.component.adexpress.dynamic.sk.ojm.hn(strDnm, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.mjg.getRenderRequest().m10do());
        }
        com.bytedance.sdk.component.adexpress.hnj.hnj.qor qorVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor();
        if (qorVarQor != null) {
            iJip = qorVarQor.jip();
            iUua = qorVarQor.uua();
        } else {
            iUua = 0;
        }
        com.bytedance.sdk.component.sk.ta taVarSk = fcVarSk.hnj(strDnm).hnj(this.hnj).hnj(this.dse).hn(this.aq).gjv(iJip).sk(iUua);
        String strMjg = this.mjg.getRenderRequest().mjg();
        if (!TextUtils.isEmpty(strMjg)) {
            taVarSk.hn(strMjg);
        }
        if (hnj()) {
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.FIT_CENTER);
            taVarSk.hnj(Bitmap.Config.ARGB_4444).qor(2).hnj(new hnj(this.dnm)).hnj(new hn(this.f12547fc, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                taVarSk.qor(1).hnj((ImageView) this.f12547fc);
            }
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.f12547fc instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.f12547fc).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.f12547fc).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.a(drawable)) {
            return;
        }
        b.a(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.f12547fc).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.a(drawable)) {
            return;
        }
        b.a(drawable).stop();
    }
}
