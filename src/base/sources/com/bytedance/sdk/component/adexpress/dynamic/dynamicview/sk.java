package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import com.bytedance.sdk.component.utils.Cdo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class sk extends FrameLayout implements IAnimation, ua, ul {
    private float apu;
    protected int aq;
    protected com.bytedance.sdk.component.adexpress.dynamic.gjv.dse bug;
    protected float dkl;
    protected Context dnm;
    protected int dse;
    private Cdo eum;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    protected View f12547fc;
    protected float gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f12548hn;
    private float hnj;
    protected boolean jip;
    protected DynamicRootView mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.qor f12549oj;
    protected int ojm;
    protected com.bytedance.sdk.component.adexpress.dynamic.gjv.aq orl;
    protected float qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected float f12550sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    protected int f12551ta;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.hn uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private float f12552xn;
    private static final View.OnTouchListener wu = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener as = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public sk(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context);
        this.dnm = context;
        this.mjg = dynamicRootView;
        this.orl = aqVar;
        this.qor = aqVar.dkl();
        this.gjv = aqVar.dse();
        this.f12550sk = aqVar.aq();
        this.dkl = aqVar.ojm();
        this.ojm = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.qor);
        this.f12551ta = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.gjv);
        this.dse = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.f12550sk);
        this.aq = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.dkl);
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar = new com.bytedance.sdk.component.adexpress.dynamic.gjv.dse(aqVar.ta());
        this.bug = dseVar;
        if (dseVar.oj() > 0) {
            this.dse += this.bug.oj() * 2;
            this.aq += this.bug.oj() * 2;
            this.ojm -= this.bug.oj();
            this.f12551ta -= this.bug.oj();
            List<com.bytedance.sdk.component.adexpress.dynamic.gjv.aq> listDnm = aqVar.dnm();
            if (listDnm != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar2 : listDnm) {
                    aqVar2.qor(aqVar2.dkl() + com.bytedance.sdk.component.adexpress.gjv.dse.hn(this.dnm, this.bug.oj()));
                    aqVar2.gjv(aqVar2.dse() + com.bytedance.sdk.component.adexpress.gjv.dse.hn(this.dnm, this.bug.oj()));
                    aqVar2.hnj(com.bytedance.sdk.component.adexpress.gjv.dse.hn(this.dnm, this.bug.oj()));
                    aqVar2.hn(com.bytedance.sdk.component.adexpress.gjv.dse.hn(this.dnm, this.bug.oj()));
                }
            }
        }
        this.jip = this.bug.mjg() > 0.0d;
        this.f12549oj = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.qor();
    }

    protected boolean aq() {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = this.orl;
        return aqVar == null || aqVar.ta() == null || this.orl.ta().sk() == null || this.orl.ta().sk().lf() == null;
    }

    public void dkl() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.dse, this.aq);
        layoutParams.topMargin = this.f12551ta;
        int i10 = this.ojm;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public void dse() {
        if (aq()) {
            return;
        }
        View view = this.f12547fc;
        if (view == null) {
            view = this;
        }
        this.uua = new com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.hn(view, this.orl.ta().sk().lf());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.hn hnVar = sk.this.uua;
                if (hnVar != null) {
                    hnVar.hnj();
                }
            }
        });
    }

    protected Drawable getBackgroundDrawable() {
        return hnj(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.jip;
    }

    public int getClickArea() {
        return this.bug.xyo();
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj getDynamicClickListener() {
        return this.mjg.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.aq;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.sk skVarTa;
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = this.orl;
        if (aqVar == null || (skVarTa = aqVar.ta()) == null) {
            return null;
        }
        return skVarTa.sk();
    }

    public int getDynamicWidth() {
        return this.dse;
    }

    public String getImageObjectFit() {
        return this.bug.zt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.f12552xn;
    }

    protected Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(hnj(hn(this.bug.fvt().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.hnj;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f12548hn;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.apu;
    }

    protected boolean gjv() {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.f12547fc;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        if (sk()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = wu;
            onClickListener = as;
        }
        if (onTouchListener != null && onClickListener != null) {
            view2.setOnTouchListener(onTouchListener);
            view2.setOnClickListener(onClickListener);
            int iHnj = com.bytedance.sdk.component.adexpress.dynamic.hn.hnj.hnj(this.bug);
            if (iHnj == 2 || iHnj == 3) {
                view2.setOnClickListener(as);
            } else {
                view2.setOnClickListener(onClickListener);
            }
        }
        hnj(view2);
        hn(view2);
        return true;
    }

    protected void hn(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dkl dklVarSk;
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = this.orl;
        if (aqVar == null || (dklVarSk = aqVar.ta().sk()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(dklVarSk.xe()));
    }

    public void hnj(int i10) {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar = this.bug;
        if (dseVar != null && dseVar.hnj(i10)) {
            ojm();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof sk)) {
                    ((sk) childAt).hnj(i10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        dse();
        hnj();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        hn();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12549oj.hnj(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.qor qorVar = this.f12549oj;
        View view = this.f12547fc;
        if (view == null) {
            view = this;
        }
        qorVar.hnj(view, i10, i11);
    }

    public boolean qor() {
        ojm();
        dkl();
        gjv();
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.f12552xn = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.hnj = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.f12548hn = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.jip = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.apu = f10;
        this.f12549oj.hnj(this, f10);
    }

    public boolean sk() {
        com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar = this.bug;
        return (dseVar == null || dseVar.xyo() == 0) ? false : true;
    }

    private List<String> hn(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z10 = true;
            } else if (str.charAt(i12) == ')' && (i10 = i10 - 1) == 0 && z10) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z10 = false;
            }
        }
        return arrayList;
    }

    protected void hnj(View view) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.orl.aq());
            jSONObject.put("height", this.orl.ojm());
            if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hnj.apu, this.bug.orp());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hnj.eum, this.orl.ta().hn());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hnj.wu, this.orl.qor());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.hnj.as, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.bug.orp());
            view.setTag(2097610715, this.orl.ta().hn());
            view.setTag(2097610714, this.orl.qor());
            view.setTag(2097610713, jSONObject.toString());
            int iHnj = com.bytedance.sdk.component.adexpress.dynamic.hn.hnj.hnj(this.bug);
            if (iHnj == 1) {
                view.setTag(2097610707, new Pair(this.bug.tu(), Long.valueOf(this.bug.tgn())));
                view.setTag(2097610708, Integer.valueOf(iHnj));
            }
        } catch (JSONException unused) {
        }
    }

    public void hn() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.hn hnVar = this.uua;
        if (hnVar != null) {
            hnVar.hn();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    protected Drawable hnj(boolean z10, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iVf;
        if (!TextUtils.isEmpty(this.bug.fvt())) {
            try {
                String strFvt = this.bug.fvt();
                String strSubstring = strFvt.substring(strFvt.indexOf("(") + 1, strFvt.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableHnj = hnj(hnj(strArrSplit[0]), iArr);
                gradientDrawableHnj.setShape(0);
                gradientDrawableHnj.setCornerRadius(com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.fc()));
                return gradientDrawableHnj;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fHnj = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.fc());
        drawable.setCornerRadius(fHnj);
        if (fHnj < 1.0f) {
            float fHnj2 = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.nyv());
            float fHnj3 = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.pty());
            float fHnj4 = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.gm());
            float fHnj5 = com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.ul());
            float[] fArr = new float[8];
            if (fHnj2 > 0.0f) {
                fArr[0] = fHnj2;
                fArr[1] = fHnj2;
            }
            if (fHnj3 > 0.0f) {
                fArr[2] = fHnj3;
                fArr[3] = fHnj3;
            }
            if (fHnj4 > 0.0f) {
                fArr[4] = fHnj4;
                fArr[5] = fHnj4;
            }
            if (fHnj5 > 0.0f) {
                fArr[6] = fHnj5;
                fArr[7] = fHnj5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            iVf = Color.parseColor(str);
        } else {
            iVf = this.bug.vf();
        }
        drawable.setColor(iVf);
        if (this.bug.uua() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.uua()), this.bug.jip());
        } else if (this.bug.oj() > 0) {
            drawable.setStroke(this.bug.oj(), this.bug.jip());
            drawable.setAlpha(50);
            if (TextUtils.equals(this.orl.ta().hn(), "video-vd")) {
                setLayerType(1, null);
                return new xn((int) fHnj, this.bug.oj());
            }
        }
        return drawable;
    }

    protected hn hnj(Bitmap bitmap) {
        return new hnj(bitmap, null);
    }

    private Drawable[] hnj(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.gjv.dse.hnj(strArrSplit[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable gradientDrawableHnj = hnj(hnj(strArrSplit[0]), iArr);
                gradientDrawableHnj.setShape(0);
                gradientDrawableHnj.setCornerRadius(com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.dnm, this.bug.fc()));
                drawableArr[(list.size() - 1) - i10] = gradientDrawableHnj;
            }
        }
        return drawableArr;
    }

    protected GradientDrawable hnj(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    protected GradientDrawable.Orientation hnj(String str) {
        try {
            int i10 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i10 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void hnj() {
        if (isShown()) {
            int iHnj = com.bytedance.sdk.component.adexpress.dynamic.hn.hnj.hnj(this.bug);
            if (iHnj == 2) {
                if (this.eum == null) {
                    this.eum = new Cdo(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk.4
                };
                com.bytedance.sdk.component.adexpress.hn.orl renderRequest = this.mjg.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.fc();
                    renderRequest.eum();
                    renderRequest.xn();
                    return;
                }
                return;
            }
            if (iHnj == 3) {
                if (this.eum == null) {
                    this.eum = new Cdo(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk.5
                };
                com.bytedance.sdk.component.adexpress.hn.orl renderRequest2 = this.mjg.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.uua();
                    renderRequest2.wu();
                    renderRequest2.oj();
                    renderRequest2.apu();
                }
            }
        }
    }
}
