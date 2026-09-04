package com.bytedance.sdk.openadsdk.component.ojm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.dnm;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends qor {

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.dkl.aq f13365fc;
    private final com.bytedance.sdk.openadsdk.core.dkl.gjv jip;
    private final jip mjg;
    private final com.bytedance.sdk.openadsdk.core.dkl.qor orl;
    private final com.bytedance.sdk.openadsdk.core.dkl.sk uua;

    public gjv(Context context, as asVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iHn = sq.hn(context, 8.0f);
        int iHn2 = sq.hn(context, 9.0f);
        int iHn3 = sq.hn(context, 10.0f);
        int iHn4 = sq.hn(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.qor qorVar = new com.bytedance.sdk.openadsdk.core.widget.qor(context);
        this.bug = qorVar;
        qorVar.setPadding(iHn2, 0, iHn2, 0);
        this.bug.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(sq.hn(context, 32.0f), sq.hn(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iHn3, iHn3);
        this.bug.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar2 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        this.orl = qorVar2;
        qorVar2.setBackgroundColor(-1);
        qorVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, sq.hn(context, 107.0f));
        layoutParams2.addRule(12);
        qorVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setOrientation(0);
        skVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        skVar.setLayoutParams(layoutParams3);
        qorVar2.addView(skVar);
        uua uuaVar = new uua(context);
        this.dkl = uuaVar;
        uuaVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iHn4, iHn4);
        layoutParams4.rightMargin = iHn;
        layoutParams4.setMarginEnd(iHn);
        this.dkl.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.dse = aqVar;
        aqVar.setId(520093761);
        this.dse.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = this.dse;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar2.setEllipsize(truncateAt);
        this.dse.setMaxLines(2);
        this.dse.setTextColor(Color.parseColor("#161823"));
        this.dse.setTextSize(30.0f);
        skVar.addView(this.dkl);
        skVar.addView(this.dse);
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar3 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, qorVar2.getId());
        layoutParams5.addRule(10);
        qorVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        this.hnj = gjvVar;
        gjvVar.setId(520093754);
        this.hnj.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qorVar3.addView(this.hnj, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.qor qorVar4 = new com.bytedance.sdk.openadsdk.core.dkl.qor(context);
        this.f13371hn = qorVar4;
        qorVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        qorVar3.addView(this.f13371hn, layoutParams6);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar2 = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        this.qor = gjvVar2;
        gjvVar2.setId(520093756);
        qorVar3.addView(this.qor, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13372sk = aqVar3;
        aqVar3.setId(520093717);
        this.f13372sk.setBackground(dnm.hnj(context, Color.parseColor("#b3000000"), 24));
        this.f13372sk.setEllipsize(truncateAt);
        this.f13372sk.setGravity(17);
        this.f13372sk.setSingleLine(true);
        this.f13372sk.setText(wu.hnj(context, "tt_video_download_apk"));
        this.f13372sk.setTextColor(-1);
        this.f13372sk.setTextSize(1, 16.0f);
        this.f13372sk.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(sq.hn(context, 236.0f), sq.hn(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = sq.hn(context, 32.0f);
        qorVar3.addView(this.f13372sk, layoutParams7);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        this.uua = skVar2;
        skVar2.setOrientation(0);
        skVar2.setGravity(16);
        skVar2.setBackground(new hnj(context));
        skVar2.setPadding(sq.hn(context, 16.0f), sq.hn(context, 8.0f), sq.hn(context, 16.0f), sq.hn(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = sq.hn(context, 90.0f);
        skVar2.setLayoutParams(layoutParams8);
        uua uuaVar2 = new uua(context);
        this.jip = uuaVar2;
        skVar2.addView(uuaVar2, new LinearLayout.LayoutParams(sq.hn(context, 36.0f), sq.hn(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = sq.hn(context, 8.0f);
        skVar2.addView(skVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.f13365fc = aqVar4;
        aqVar4.setTextColor(-1);
        skVar3.addView(aqVar4, new LinearLayout.LayoutParams(-2, -2));
        jip jipVar = new jip(context, true);
        this.mjg = jipVar;
        skVar3.addView(jipVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, asVar);
        this.gjv = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, sq.hn(context, 14.0f));
        layoutParams10.gravity = 83;
        qorVar3.addView(this.gjv, layoutParams10);
        addView(qorVar3);
        addView(this.bug);
        addView(qorVar2);
        addView(this.aq);
        addView(skVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public com.bytedance.sdk.openadsdk.core.dkl.gjv getAdIconView() {
        return this.jip;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public com.bytedance.sdk.openadsdk.core.dkl.aq getAdTitleTextView() {
        return this.f13365fc;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public com.bytedance.sdk.openadsdk.core.dkl.sk getOverlayLayout() {
        return this.uua;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public jip getScoreBar() {
        return this.mjg;
    }

    @Override // com.bytedance.sdk.openadsdk.component.ojm.qor
    public View getUserInfo() {
        return this.orl;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class hnj extends Drawable {
        private final boolean gjv;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private static final int f13366sk = Color.parseColor("#b0000000");
        private static final int dkl = Color.parseColor("#40000000");
        private final RectF hnj = new RectF();

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final Paint f13367hn = new Paint();
        private final Path qor = new Path();

        public hnj(Context context) {
            this.gjv = com.bytedance.sdk.component.adexpress.gjv.hn.hnj(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.qor, this.f13367hn);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.hnj.set(rect);
            this.qor.reset();
            int iHeight = rect.height() / 2;
            Path path = this.qor;
            RectF rectF = this.hnj;
            if (this.gjv) {
                float f10 = iHeight;
                fArr = new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10};
            } else {
                float f11 = iHeight;
                fArr = new float[]{0.0f, 0.0f, f11, f11, f11, f11, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f12 = rect.right;
            boolean z10 = this.gjv;
            this.f13367hn.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{z10 ? dkl : f13366sk, z10 ? f13366sk : dkl}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
