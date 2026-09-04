package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.jip;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.hnj.hnj adContext;
    private PAGLogoView adLogo;
    private uua ivIcon;
    private boolean mInit;
    private jip rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.dkl.aq tvDesc;
    private com.bytedance.sdk.openadsdk.core.dkl.aq tvDownload;
    private TextView tvTitle;

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.jip.aip);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.dkl.aq aqVar, as asVar) {
        if (aqVar == null) {
            return;
        }
        String strBr = asVar.br();
        if (TextUtils.isEmpty(strBr)) {
            return;
        }
        aqVar.setText(strBr);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar, as asVar) {
        if (gjvVar == null || asVar.mn() == null || TextUtils.isEmpty(asVar.mn().hnj())) {
            return;
        }
        com.bytedance.sdk.openadsdk.apu.hn.hn().hnj(asVar.mn(), gjvVar, asVar);
    }

    private void bindTitleData(TextView textView, as asVar, String str) {
        if (textView != null) {
            if (asVar.zyh() == null || TextUtils.isEmpty(asVar.zyh().hn())) {
                textView.setText(str);
            } else {
                textView.setText(asVar.zyh().hn());
            }
        }
    }

    private void initData(final as asVar, com.bytedance.sdk.openadsdk.core.dkl.aq aqVar) {
        setDownloadButtonData(aqVar, asVar, -1);
        bindIconData(this.ivIcon, asVar);
        jip jipVar = this.rbScore;
        if (jipVar != null) {
            sq.hnj((TextView) null, jipVar, asVar);
            if (asVar.zyh() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (asVar.zyh() != null && !TextUtils.isEmpty(asVar.zyh().hn())) {
                this.tvTitle.setText(asVar.zyh().hn());
            } else if (TextUtils.isEmpty(asVar.mw())) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(asVar.mw());
            }
        }
        if (this.tvDesc != null) {
            String strKby = asVar.kby();
            if (TextUtils.isEmpty(strKby)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(strKby);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.hnj(RFEndCardBackUpLayout.this.adContext.orp, asVar, RFEndCardBackUpLayout.this.adContext.f13461sk);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(sq.hn(context, 16.0f), 0, sq.hn(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(skVar, layoutParams);
        if (this.adContext.lu == 2) {
            com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
            skVar2.setOrientation(0);
            skVar.addView(skVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(skVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(skVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(skVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.adContext;
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(hnjVar.orp, hnjVar.f13456hn);
        viewCreatePAGLogoViewByMaterial.setId(520093757);
        skVar.addView(viewCreatePAGLogoViewByMaterial);
        viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.hnj(RFEndCardBackUpLayout.this.adContext.orp, RFEndCardBackUpLayout.this.adContext.f13456hn, RFEndCardBackUpLayout.this.adContext.f13461sk);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.dkl.sk skVar) {
        as asVar = this.adContext.f13456hn;
        if (asVar != null) {
            List<as> listGjv = asVar.gjv().gjv();
            for (int i10 = 0; i10 < listGjv.size() && i10 < 3; i10++) {
                initSingleCardInThreeCardStyle(skVar, listGjv.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.dkl.sk skVar) {
        as asVar = this.adContext.f13456hn;
        if (asVar != null) {
            List<as> listGjv = asVar.gjv().gjv();
            for (int i10 = 0; i10 < listGjv.size() && i10 < 2; i10++) {
                initSingleCardInTwoCardStyle(skVar, listGjv.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.dkl.sk skVar, int i10) {
        as asVar = this.adContext.f13456hn;
        if (asVar != null) {
            List<as> listGjv = asVar.gjv().gjv();
            for (int i11 = 0; i11 < listGjv.size() && i11 < i10 && i11 < 3; i11++) {
                initSingleCardInTwoCardStyleLandscape(skVar, listGjv.get(i11), i11, i10);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.dkl.sk skVar, as asVar, int i10) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar2.setOrientation(1);
        skVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10 > 0 ? sq.hn(context, 12.0f) : 0, 0, 0);
        skVar2.setBackground(new hnj(context));
        skVar.addView(skVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar3.setOrientation(0);
        skVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = sq.hn(context, 20.0f);
        layoutParams2.leftMargin = sq.hn(context, 17.0f);
        layoutParams2.rightMargin = sq.hn(context, 30.0f);
        skVar2.addView(skVar3, layoutParams2);
        uua uuaVar = new uua(context);
        skVar3.addView(uuaVar, new FrameLayout.LayoutParams(sq.hn(context, 70.0f), sq.hn(context, 63.0f)));
        bindIconData(uuaVar, asVar);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar4 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = sq.hn(context, 7.0f);
        skVar3.addView(skVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        aqVar.setTextSize(18.0f);
        aqVar.setTextColor(Color.parseColor("#161823"));
        aqVar.setGravity(8388611);
        aqVar.setTypeface(null, 1);
        skVar4.addView(aqVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(aqVar, asVar, asVar.mw());
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar2.setSingleLine(true);
        aqVar2.setEllipsize(truncateAt);
        aqVar2.setTextSize(16.0f);
        aqVar2.setTextColor(Color.parseColor("#80161823"));
        skVar4.addView(aqVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(aqVar2, asVar);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar5 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar5.setOrientation(0);
        skVar5.setGravity(16);
        skVar4.addView(skVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar3.setTextSize(16.0f);
        aqVar3.setTextColor(Color.parseColor("#80161823"));
        skVar5.addView(aqVar3, new ViewGroup.LayoutParams(-2, -2));
        jip jipVar = new jip(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = sq.hn(context, 8.0f);
        skVar5.addView(jipVar, layoutParams4);
        sq.hnj(aqVar3, jipVar, asVar, 18);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar4.setGravity(17);
        aqVar4.setId(520093707);
        aqVar4.setText(wu.hnj(context, "tt_video_download_apk"));
        aqVar4.setTextColor(-1);
        aqVar4.setTextSize(2, 16.0f);
        aqVar4.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, sq.hn(context, 36.0f));
        layoutParams5.setMargins(sq.hn(context, 20.0f), sq.hn(context, 22.0f), sq.hn(context, 20.0f), sq.hn(context, 20.0f));
        skVar2.addView(aqVar4, layoutParams5);
        setDownloadButtonData(aqVar4, asVar, i10);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.dkl.sk skVar, as asVar, int i10) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar2.setOrientation(1);
        skVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10 > 0 ? sq.hn(context, 12.0f) : 0, 0, 0);
        skVar2.setBackground(new hnj(context));
        skVar.addView(skVar2, layoutParams);
        uua uuaVar = new uua(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(sq.hn(context, 70.0f), sq.hn(context, 63.0f));
        layoutParams2.setMargins(0, sq.hn(context, 24.0f), 0, sq.hn(context, 12.0f));
        skVar2.addView(uuaVar, layoutParams2);
        bindIconData(uuaVar, asVar);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        aqVar.setTextSize(18.0f);
        aqVar.setTextColor(Color.parseColor("#161823"));
        aqVar.setGravity(17);
        aqVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(sq.hn(context, 56.0f), 0, sq.hn(context, 56.0f), 0);
        skVar2.addView(aqVar, layoutParams3);
        bindTitleData(aqVar, asVar, asVar.mw());
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar2.setSingleLine(true);
        aqVar2.setEllipsize(truncateAt);
        aqVar2.setTextSize(16.0f);
        aqVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(sq.hn(context, 56.0f), sq.hn(context, 4.0f), sq.hn(context, 56.0f), 0);
        skVar2.addView(aqVar2, layoutParams4);
        bindDescData(aqVar2, asVar);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar3.setOrientation(0);
        skVar3.setGravity(16);
        skVar2.addView(skVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar3.setTextSize(16.0f);
        aqVar3.setTextColor(Color.parseColor("#80161823"));
        skVar3.addView(aqVar3, new ViewGroup.LayoutParams(-2, -2));
        jip jipVar = new jip(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = sq.hn(context, 8.0f);
        skVar3.addView(jipVar, layoutParams5);
        sq.hnj(aqVar3, jipVar, asVar, 18);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar4.setGravity(17);
        aqVar4.setId(520093707);
        aqVar4.setText(wu.hnj(context, "tt_video_download_apk"));
        aqVar4.setTextColor(-1);
        aqVar4.setTextSize(2, 16.0f);
        aqVar4.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, sq.hn(context, 36.0f));
        layoutParams6.setMargins(sq.hn(context, 20.0f), sq.hn(context, 36.0f), sq.hn(context, 20.0f), sq.hn(context, 20.0f));
        skVar2.addView(aqVar4, layoutParams6);
        setDownloadButtonData(aqVar4, asVar, i10);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.dkl.sk skVar, as asVar, int i10, int i11) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar2 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar2.setOrientation(1);
        skVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i10 > 0) {
            layoutParams.setMargins(sq.hn(context, 12.0f), 0, 0, 0);
        }
        skVar2.setBackground(new hnj(context));
        skVar.addView(skVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar3 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar3.setOrientation(0);
        skVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = sq.hn(context, 20.0f);
        layoutParams2.leftMargin = sq.hn(context, 17.0f);
        layoutParams2.rightMargin = sq.hn(context, 30.0f);
        skVar2.addView(skVar3, layoutParams2);
        uua uuaVar = new uua(context);
        skVar3.addView(uuaVar, new FrameLayout.LayoutParams(sq.hn(context, 44.0f), sq.hn(context, 44.0f)));
        bindIconData(uuaVar, asVar);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar4 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = sq.hn(context, 7.0f);
        skVar3.addView(skVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        aqVar.setTextSize(18.0f);
        aqVar.setTextColor(Color.parseColor("#161823"));
        aqVar.setGravity(8388611);
        aqVar.setTypeface(null, 1);
        skVar4.addView(aqVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(aqVar, asVar, asVar.mw());
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar5 = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar5.setOrientation(0);
        skVar5.setGravity(16);
        skVar4.addView(skVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar2.setTextSize(16.0f);
        aqVar2.setTextColor(Color.parseColor("#80161823"));
        skVar5.addView(aqVar2, new ViewGroup.LayoutParams(-2, -2));
        jip jipVar = new jip(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = sq.hn(context, 8.0f);
        skVar5.addView(jipVar, layoutParams4);
        sq.hnj(aqVar2, jipVar, asVar, 18);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        if (i11 == 2) {
            aqVar3.setSingleLine(true);
        } else {
            aqVar3.setLines(2);
        }
        aqVar3.setEllipsize(truncateAt);
        aqVar3.setTextSize(16.0f);
        aqVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i12 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i12;
        layoutParams5.leftMargin = i12;
        layoutParams5.topMargin = sq.hn(context, 12.0f);
        skVar2.addView(aqVar3, layoutParams5);
        bindDescData(aqVar3, asVar);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar4 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        aqVar4.setGravity(17);
        aqVar4.setId(520093707);
        aqVar4.setText(wu.hnj(context, "tt_video_download_apk"));
        aqVar4.setTextColor(-1);
        aqVar4.setTextSize(2, 16.0f);
        aqVar4.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, sq.hn(context, 36.0f));
        layoutParams6.setMargins(sq.hn(context, 20.0f), sq.hn(context, 22.0f), sq.hn(context, 20.0f), sq.hn(context, 20.0f));
        skVar2.addView(aqVar4, layoutParams6);
        setDownloadButtonData(aqVar4, asVar, i10);
    }

    private void initViews() {
        com.bytedance.sdk.openadsdk.core.model.hnj hnjVarGjv;
        List<as> listGjv;
        com.bytedance.sdk.openadsdk.activity.single.aq aqVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        boolean z10 = this.adContext.f13456hn.dzo() && (aqVar = this.adContext.f13463th) != null && aqVar.orp();
        if (z10) {
            if (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.qor.hnj()) {
                initViewsForUGen(true);
                return;
            } else if (this.shownAdCount > 1) {
                initOneSlotMultipleAdsLayout();
                return;
            }
        }
        as asVar = this.adContext.f13456hn;
        if (asVar.qs()) {
            initViewsForVast();
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.qor.hnj()) {
            initViewsForUGen(false);
            return;
        }
        if (z10 && (hnjVarGjv = asVar.gjv()) != null && (listGjv = hnjVarGjv.gjv()) != null && !listGjv.isEmpty()) {
            asVar = listGjv.get(0);
        }
        initViewsDefault(asVar);
        initData(asVar, this.tvDownload);
    }

    private void initViewsDefault(as asVar) {
        Context context = getContext();
        boolean z10 = asVar.zf() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        skVar.setGravity(1);
        skVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z10 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(sq.hn(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iHn = sq.hn(context, 24.0f);
        layoutParams.rightMargin = iHn;
        layoutParams.leftMargin = iHn;
        addView(skVar, layoutParams);
        uua uuaVar = new uua(context);
        this.ivIcon = uuaVar;
        uuaVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(sq.hn(context, 80.0f), sq.hn(context, 80.0f));
        layoutParams2.bottomMargin = sq.hn(context, 12.0f);
        skVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.tvTitle = aqVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aqVar.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(sq.hn(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        skVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar2 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.tvDesc = aqVar2;
        aqVar2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = sq.hn(context, 8.0f);
        skVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new jip(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, sq.hn(context, 16.0f));
        layoutParams4.topMargin = sq.hn(context, 12.0f);
        this.rbScore.setVisibility(8);
        skVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.dkl.aq aqVar3 = new com.bytedance.sdk.openadsdk.core.dkl.aq(context);
        this.tvDownload = aqVar3;
        aqVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(wu.hnj(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.dnm.hnj(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, sq.hn(context, 44.0f));
        layoutParams5.topMargin = sq.hn(context, 54.0f);
        skVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, asVar);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, sq.hn(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = sq.hn(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = sq.hn(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = sq.hn(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForUGen(boolean z10) {
        addView(new com.bytedance.sdk.openadsdk.core.bug.dkl.hnj.qor(this.adContext, z10));
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.dkl.gjv gjvVar = new com.bytedance.sdk.openadsdk.core.dkl.gjv(context);
        gjvVar.setId(com.bytedance.sdk.openadsdk.utils.jip.f14682ta);
        gjvVar.setVisibility(8);
        addView(gjvVar, new FrameLayout.LayoutParams(-1, -1));
        View dklVar = new com.bytedance.sdk.component.ojm.dkl(context, true, com.bytedance.sdk.component.ojm.dkl.qor.VAST_ENDCARD);
        dklVar.setVisibility(8);
        dklVar.setId(com.bytedance.sdk.openadsdk.utils.jip.dnm);
        addView(dklVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.dkl.aq aqVar, as asVar, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.qor.sk skVarHnj = hnjVar.tgn.hnj(hnjVar, asVar);
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar2 = this.adContext;
        skVarHnj.hnj(com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(hnjVar2.orp, hnjVar2.f13461sk));
        if (i10 != -1) {
            HashMap map = new HashMap();
            int i11 = i10 + 1;
            map.put("ad_show_order", Integer.valueOf(i11));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i11);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            skVarHnj.hnj(map);
        }
        aqVar.setOnClickListener(skVarHnj);
        aqVar.setOnTouchListener(skVarHnj);
        CharSequence charSequenceCq = asVar.cq();
        if (TextUtils.isEmpty(charSequenceCq)) {
            return;
        }
        aqVar.setText(charSequenceCq);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        this.adContext = hnjVar;
        if (hnjVar.f13456hn.qs()) {
            initViews();
        }
    }

    public void setShownAdCount(int i10) {
        this.shownAdCount = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            initViews();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class hnj extends Drawable {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private final Drawable f13540hn;
        Path hnj = new Path();
        private final int qor;

        public hnj(Context context) {
            this.f13540hn = wu.qor(context, "tt_ad_bg_header_gradient");
            this.qor = sq.hn(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.hnj);
            canvas.drawColor(-1);
            this.f13540hn.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13);
            float f10 = i12;
            this.f13540hn.setBounds(i10, i11, i12, (int) (((1.0f * f10) / this.f13540hn.getIntrinsicWidth()) * this.f13540hn.getIntrinsicHeight()));
            this.hnj.reset();
            Path path = this.hnj;
            RectF rectF = new RectF(0.0f, 0.0f, f10, i13);
            int i14 = this.qor;
            path.addRoundRect(rectF, i14, i14, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
