package com.bytedance.adsdk.hn.qor.qor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.hn.apu;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor extends gjv {
    private LinearLayout aq;
    private String bug;
    private final List<TextView> dnm;
    private final LinearLayout.LayoutParams ojm;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final List<String> f12114ta;

    public qor(com.bytedance.adsdk.hn.ojm ojmVar, sk skVar, Context context) {
        List<com.bytedance.adsdk.hn.ta.hnj> listQor;
        super(ojmVar, skVar);
        this.ojm = new LinearLayout.LayoutParams(-2, -2);
        this.f12114ta = new ArrayList();
        this.dnm = new ArrayList();
        com.bytedance.adsdk.hn.ta taVar = ((gjv) this).dse;
        if (taVar == null || (listQor = taVar.qor()) == null || listQor.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.aq = linearLayout;
        int i10 = 0;
        linearLayout.setOrientation(0);
        hn(listQor.get(0).dse);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.aq.addView(linearLayout2);
        List<String> listBug = bug();
        while (i10 < listQor.size()) {
            com.bytedance.adsdk.hn.ta.hnj hnjVar = listQor.get(i10);
            TextView textView = new TextView(context);
            hnj(textView, hnjVar, (listBug == null || i10 >= listBug.size()) ? "" : listBug.get(i10));
            int i11 = hnjVar.dkl;
            if (i11 != 0) {
                this.ojm.bottomMargin = (int) (i11 * com.bytedance.adsdk.hn.dkl.dkl.hnj());
                linearLayout2.addView(textView, this.ojm);
            } else {
                linearLayout2.addView(textView);
            }
            i10++;
        }
        float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj();
        hnj(this.aq, (int) (((gjv) this).dse.hnj() * fHnj), (int) (((gjv) this).dse.hn() * fHnj));
    }

    private List<String> bug() {
        com.bytedance.adsdk.hn.ojm ojmVar;
        apu apuVarM1do;
        List<com.bytedance.adsdk.hn.ta.hnj> listQor;
        if (((gjv) this).dse == null || (ojmVar = this.f12102hn) == null || (apuVarM1do = ojmVar.m1do()) == null) {
            return null;
        }
        String strGjv = ((gjv) this).dse.gjv();
        if ((!TextUtils.isEmpty(strGjv) || !TextUtils.isEmpty(this.bug)) && (listQor = ((gjv) this).dse.qor()) != null) {
            String strHnj = this.bug;
            if (TextUtils.isEmpty(strHnj)) {
                strHnj = apuVarM1do.hnj(strGjv);
            }
            if (!TextUtils.isEmpty(strHnj)) {
                int length = strHnj.length();
                this.f12114ta.clear();
                for (int i10 = 0; i10 < listQor.size(); i10++) {
                    com.bytedance.adsdk.hn.ta.hnj hnjVar = listQor.get(i10);
                    int iMax = hnjVar.hnj;
                    int iMax2 = hnjVar.f12138hn;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.f12114ta.add("");
                    } else {
                        if (listQor.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.f12114ta.add(strHnj.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.f12114ta;
            }
        }
        return null;
    }

    private void hn(String str) {
        if (TextUtils.isEmpty(str)) {
            this.aq.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals(TtmlNode.LEFT)) {
            this.aq.setGravity(3);
        } else if (str.equals(TtmlNode.RIGHT)) {
            this.aq.setGravity(5);
        } else {
            this.aq.setGravity(17);
        }
    }

    private void hnj(TextView textView, com.bytedance.adsdk.hn.ta.hnj hnjVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(hnjVar.qor)) {
            textView.setTextColor(Color.parseColor(hnjVar.qor));
        }
        if (!TextUtils.isEmpty(hnjVar.gjv)) {
            textView.setBackgroundColor(Color.parseColor(hnjVar.gjv));
        }
        textView.setGravity(17);
        textView.setTextSize(hnjVar.f12139sk);
    }

    private void qor(float f10) {
        List<com.bytedance.adsdk.hn.ta.hnj> listQor;
        com.bytedance.adsdk.hn.ta taVar = ((gjv) this).dse;
        if (taVar == null || (listQor = taVar.qor()) == null || listQor.size() <= 0) {
            return;
        }
        this.aq.setOrientation(0);
        this.aq.setGravity(17);
        if (this.aq.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.aq.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.aq.removeAllViews();
        if (linearLayout.getChildCount() != listQor.size()) {
            return;
        }
        List<String> listBug = bug();
        this.dnm.clear();
        int i10 = 0;
        while (i10 < listQor.size()) {
            com.bytedance.adsdk.hn.ta.hnj hnjVar = listQor.get(i10);
            TextView textView = (TextView) linearLayout.getChildAt(i10);
            this.dnm.add(textView);
            hnj(textView, hnjVar, (listBug == null || i10 >= listBug.size()) ? "" : listBug.get(i10));
            i10++;
        }
        linearLayout.removeAllViews();
        for (int i11 = 0; i11 < listQor.size(); i11++) {
            com.bytedance.adsdk.hn.ta.hnj hnjVar2 = listQor.get(i11);
            TextView textView2 = this.dnm.get(i11);
            textView2.setAlpha(f10);
            linearLayout.setAlpha(f10);
            int i12 = hnjVar2.dkl;
            if (i12 != 0) {
                this.ojm.bottomMargin = (int) (i12 * com.bytedance.adsdk.hn.dkl.dkl.hnj());
                linearLayout.addView(textView2, this.ojm);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.aq.setAlpha(f10);
        this.aq.addView(linearLayout);
        float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj();
        hnj(this.aq, (int) (((gjv) this).dse.hnj() * fHnj), (int) (((gjv) this).dse.hn() * fHnj));
    }

    @Override // com.bytedance.adsdk.hn.qor.qor.gjv, com.bytedance.adsdk.hn.qor.qor.hnj
    public void hn(Canvas canvas, Matrix matrix, int i10) {
        if (this.aq != null) {
            canvas.save();
            canvas.concat(matrix);
            hnj(i10);
            qor(dkl());
            this.aq.draw(canvas);
            canvas.restore();
            return;
        }
        super.hn(canvas, matrix, i10);
    }

    private static void hnj(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void hnj(String str) {
        this.bug = str;
    }
}
