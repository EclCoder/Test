package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b6.a;
import b6.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends sk {
    private static String apu = "";
    private volatile boolean eum;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private Runnable f12525hn;
    private Runnable hnj;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.qor.ojm f12526xn;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn implements com.bytedance.sdk.component.sk.jip {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final WeakReference<sk> f12529hn;
        private final WeakReference<View> hnj;

        public hn(View view, sk skVar) {
            this.hnj = new WeakReference<>(view);
            this.f12529hn = new WeakReference<>(skVar);
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
            Object objHn;
            sk skVar;
            View view = this.hnj.get();
            if (view == null || (objHn = dnmVar.hn()) == null || dnmVar.qor() == null || (skVar = this.f12529hn.get()) == null || !(objHn instanceof Bitmap)) {
                return;
            }
            view.setBackground(skVar.hnj((Bitmap) objHn));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hnj implements com.bytedance.sdk.component.sk.jip {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final WeakReference<DynamicRootView> f12530hn;
        private final WeakReference<View> hnj;
        private final com.bytedance.sdk.component.adexpress.dynamic.gjv.aq qor;

        public hnj(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
            this.hnj = new WeakReference<>(view);
            this.f12530hn = new WeakReference<>(dynamicRootView);
            this.qor = aqVar;
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.sk.jip
        public void hnj(com.bytedance.sdk.component.sk.dnm dnmVar) {
            Drawable bitmapDrawable;
            View view = this.hnj.get();
            Object objHn = dnmVar.hn();
            if (objHn instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objHn);
            } else if (objHn instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.a(objHn)) {
                    b.a(objHn).start();
                }
                bitmapDrawable = (Drawable) objHn;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.gjv.hn()) {
                DynamicRootView dynamicRootView = this.f12530hn.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().gjv()) || "splash_ad".equals(dynamicRootView.getRenderRequest().gjv())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(bitmapDrawable);
            com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = this.qor;
            if (aqVar == null || aqVar.ta() == null || 6 != this.qor.ta().hnj() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class qor implements com.bytedance.sdk.component.sk.aq {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final int f12531hn;
        private final WeakReference<Context> hnj;

        public qor(Context context, int i10) {
            this.hnj = new WeakReference<>(context);
            this.f12531hn = i10;
        }

        @Override // com.bytedance.sdk.component.sk.aq
        public Bitmap hnj(Bitmap bitmap) {
            Context context = this.hnj.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.gjv.hnj.hnj(context, bitmap, this.f12531hn);
            }
            return null;
        }
    }

    public dkl(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.eum = true;
        setTag(Integer.valueOf(getClickArea()));
        String strHn = aqVar.ta().hn();
        if ("logo-union".equals(strHn)) {
            dynamicRootView.setLogoUnionHeight(this.aq - ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, this.bug.hn() + this.bug.hnj())));
        } else if ("scoreCountWithIcon".equals(strHn)) {
            dynamicRootView.setScoreCountWithIcon(this.aq - ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(context, this.bug.hn() + this.bug.hnj())));
        }
    }

    private static String getBuildModel() {
        try {
            apu = com.bytedance.sdk.component.utils.tu.hnj();
        } catch (Throwable unused) {
            apu = Build.MODEL;
        }
        if (TextUtils.isEmpty(apu)) {
            apu = Build.MODEL;
        }
        return apu;
    }

    private String hn(String str) {
        try {
            Map<String, String> mapDnm = this.mjg.getRenderRequest().dnm();
            if (mapDnm != null && mapDnm.size() > 0) {
                return mapDnm.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable qor(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getString(i10).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i10));
                } else if (jSONArray.getString(i10).endsWith("deg")) {
                    string = jSONArray.getString(i10);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(((String) arrayList.get(i11)).substring(0, 7));
            }
            GradientDrawable gradientDrawableHnj = hnj(hnj(string), iArr);
            gradientDrawableHnj.setShape(0);
            gradientDrawableHnj.setCornerRadius(com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.fc()));
            return gradientDrawableHnj;
        } catch (Throwable unused) {
            return null;
        }
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.dse, this.aq);
    }

    public boolean ojm() {
        int iJip;
        int iUua;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.f12547fc;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.orl.hnj(this.bug.xyo()));
        String strLko = this.bug.lko();
        String strM10do = null;
        String strHnj = (TextUtils.isEmpty(strLko) || (dynamicRootView = this.mjg) == null || dynamicRootView.getRenderRequest() == null || this.mjg.getRenderRequest().qor() == null || (jSONObjectOptJSONObject = this.mjg.getRenderRequest().qor().optJSONObject("creative")) == null) ? null : hnj(jSONObjectOptJSONObject.opt(strLko));
        if (TextUtils.isEmpty(strHnj)) {
            strHnj = this.bug.eum();
        }
        com.bytedance.sdk.component.adexpress.hnj.hnj.qor qorVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor();
        if (qorVarQor != null) {
            iJip = qorVarQor.jip();
            iUua = qorVarQor.uua();
        } else {
            iJip = 0;
            iUua = 0;
        }
        if (this.bug.apu()) {
            int iXn = this.bug.xn();
            String str = this.bug.f12599hn;
            com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().sk().hnj(str).hnj(this.dse).hn(this.aq).gjv(iJip).sk(iUua).hnj(hn(str)).qor(2).hnj(new qor(this.dnm, iXn)).hnj(new hn(view, this));
        } else if (!TextUtils.isEmpty(strHnj)) {
            if (!strHnj.startsWith("http:") && !strHnj.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.mjg;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strM10do = this.mjg.getRenderRequest().m10do();
                }
                strHnj = com.bytedance.sdk.component.adexpress.dynamic.sk.ojm.hn(strHnj, strM10do);
            }
            com.bytedance.sdk.component.sk.ta taVarQor = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().sk().hnj(strHnj).hnj(this.dse).hn(this.aq).gjv(iJip).sk(iUua).hnj(hn(strHnj)).qor(1);
            hnj(taVarQor);
            taVarQor.hnj(new hnj(view, this.mjg, this.orl));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.bug.hqh() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (dkl.this.bug.ua() > 0) {
                            dkl dklVar = dkl.this;
                            Drawable drawableQor = dklVar.qor(dklVar.mjg.getBgMaterialCenterCalcColor().get(Integer.valueOf(dkl.this.bug.ua())));
                            if (drawableQor == null) {
                                dkl dklVar2 = dkl.this;
                                drawableQor = dklVar2.hnj(true, dklVar2.mjg.getBgMaterialCenterCalcColor().get(Integer.valueOf(dkl.this.bug.ua())));
                            }
                            if (drawableQor != null) {
                                view.setBackground(drawableQor);
                                return;
                            }
                            View view2 = view;
                            dkl dklVar3 = dkl.this;
                            view2.setBackground(dklVar3.hnj(true, dklVar3.mjg.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.bug.hqh() * 1000.0d));
        }
        View view2 = this.f12547fc;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.qor()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.hn()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.gjv()), (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.hnj()));
        }
        if (this.jip || this.bug.mjg() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view = this.f12547fc;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        double dApu = this.orl.ta().sk().apu();
        if (dApu < 90.0d && dApu > 0.0d) {
            com.bytedance.sdk.component.utils.ojm.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl.2
                @Override // java.lang.Runnable
                public void run() {
                    dkl.this.setVisibility(8);
                }
            }, (long) (dApu * 1000.0d));
        }
        hnj(this.orl.ta().sk().xn(), view2);
        if (!TextUtils.isEmpty(this.bug.xad())) {
            hnj();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.hnj);
            removeCallbacks(this.f12525hn);
        } catch (Exception unused) {
        }
    }

    private String hnj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return hnj(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return hnj((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private static void hnj(com.bytedance.sdk.component.sk.ta taVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            taVar.hnj(Bitmap.Config.ARGB_8888);
        }
    }

    private void hnj(double d10, final View view) {
        if (d10 > 0.0d) {
            com.bytedance.sdk.component.utils.ojm.hn().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl.3
                @Override // java.lang.Runnable
                public void run() {
                    if (dkl.this.orl.ta().sk().lf() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    dkl.this.setVisibility(0);
                }
            }, (long) (d10 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnj(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) instanceof com.bytedance.sdk.component.adexpress.dynamic.qor.ojm) {
                viewGroup.removeViewAt(i10);
            }
        }
    }

    private void hnj() {
        if (this.eum) {
            int iXo = this.bug.xo();
            int iLu = this.bug.lu();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = dkl.this.mjg;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        dkl dklVar = dkl.this;
                        dkl dklVar2 = dkl.this;
                        dklVar.f12526xn = new com.bytedance.sdk.component.adexpress.dynamic.qor.ojm(dklVar2.dnm, dklVar2, dklVar2.bug);
                    } else {
                        com.bytedance.sdk.component.adexpress.hn.orl renderRequest = dkl.this.mjg.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.gjv.ta taVar = new com.bytedance.sdk.component.adexpress.dynamic.gjv.ta();
                        taVar.hnj(renderRequest.fc());
                        taVar.hn(renderRequest.jip());
                        taVar.qor(renderRequest.uua());
                        taVar.hnj(renderRequest.oj());
                        taVar.hn(renderRequest.xn());
                        taVar.qor(renderRequest.apu());
                        taVar.gjv(renderRequest.eum());
                        taVar.sk(renderRequest.wu());
                        dkl dklVar3 = dkl.this;
                        dkl dklVar4 = dkl.this;
                        dklVar3.f12526xn = new com.bytedance.sdk.component.adexpress.dynamic.qor.ojm(dklVar4.dnm, dklVar4, dklVar4.bug, taVar, renderRequest);
                    }
                    dkl dklVar5 = dkl.this;
                    dklVar5.hn(dklVar5.f12526xn);
                    if (dkl.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) dkl.this.getParent()).setClipChildren(false);
                    }
                    dkl.this.setClipChildren(false);
                    dkl.this.f12526xn.setTag(2);
                    dkl dklVar6 = dkl.this;
                    dklVar6.hnj((ViewGroup) dklVar6);
                    dkl dklVar7 = dkl.this;
                    dklVar7.addView(dklVar7.f12526xn, new FrameLayout.LayoutParams(-1, -1));
                    dkl.this.f12526xn.qor();
                }
            };
            this.hnj = runnable;
            postDelayed(runnable, ((long) iXo) * 1000);
            if (this.bug.rmr() || iLu >= Integer.MAX_VALUE || iXo >= iLu) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl.5
                @Override // java.lang.Runnable
                public void run() {
                    dkl dklVar = dkl.this;
                    if (dklVar.f12526xn != null) {
                        dklVar.eum = false;
                        dkl.this.f12526xn.gjv();
                        dkl.this.f12526xn.setVisibility(4);
                        dkl dklVar2 = dkl.this;
                        dklVar2.removeView(dklVar2.f12526xn);
                    }
                }
            };
            this.f12525hn = runnable2;
            postDelayed(runnable2, ((long) iLu) * 1000);
        }
    }
}
