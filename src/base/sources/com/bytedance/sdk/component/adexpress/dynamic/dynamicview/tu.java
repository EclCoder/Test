package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.text.DecimalFormat;
import java.util.ArrayList;
import o4.Wz.OGoz;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class tu extends dkl {
    public tu(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar) {
        super(context, dynamicRootView, aqVar);
        this.aq += 6;
        if (this.bug.sq()) {
            com.bytedance.sdk.component.adexpress.dkl.hnj hnjVar = new com.bytedance.sdk.component.adexpress.dkl.hnj(context, this.bug.dse(), this.bug.sk(), 1, this.bug.aq());
            this.f12547fc = hnjVar;
            hnjVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.f12547fc = textView;
            textView.setIncludeFontPadding(false);
        }
        this.f12547fc.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12547fc, getWidgetLayoutParams());
    }

    private void dnm() {
        if (this.f12547fc instanceof com.bytedance.sdk.component.adexpress.dkl.hnj) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.optString(i10));
                }
            } catch (JSONException unused) {
                arrayList.add(text);
            }
            ((com.bytedance.sdk.component.adexpress.dkl.hnj) this.f12547fc).setMaxLines(1);
            ((com.bytedance.sdk.component.adexpress.dkl.hnj) this.f12547fc).setTextColor(this.bug.dse());
            ((com.bytedance.sdk.component.adexpress.dkl.hnj) this.f12547fc).setTextSize(this.bug.sk());
            ((com.bytedance.sdk.component.adexpress.dkl.hnj) this.f12547fc).setAnimationText(arrayList);
            ((com.bytedance.sdk.component.adexpress.dkl.hnj) this.f12547fc).setAnimationType(this.bug.ff());
            ((com.bytedance.sdk.component.adexpress.dkl.hnj) this.f12547fc).setAnimationDuration(this.bug.jbd() * 1000);
            ((com.bytedance.sdk.component.adexpress.dkl.hnj) this.f12547fc).hnj();
        }
    }

    private boolean hnj() {
        DynamicRootView dynamicRootView = this.mjg;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.mjg.getRenderRequest().ta() == 4) ? false : true;
    }

    private void ta() {
        int iHnj;
        if (TextUtils.equals(this.orl.ta().hn(), "source") || TextUtils.equals(this.orl.ta().hn(), CampaignEx.JSON_KEY_TITLE) || TextUtils.equals(this.orl.ta().hn(), "text_star")) {
            int[] iArrHn = com.bytedance.sdk.component.adexpress.dynamic.sk.dnm.hn(this.bug.dkl(), this.bug.sk(), true);
            int iHnj2 = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), this.bug.hn());
            int iHnj3 = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), this.bug.qor());
            int iHnj4 = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), this.bug.gjv());
            int iHnj5 = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), this.bug.hnj());
            int iMin = Math.min(iHnj2, iHnj5);
            if (TextUtils.equals(this.orl.ta().hn(), "source") && (iHnj = ((this.aq - ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), this.bug.sk()))) - iHnj2) - iHnj5) > 1 && iHnj <= iMin * 2) {
                int i10 = iHnj / 2;
                this.f12547fc.setPadding(iHnj3, iHnj2 - i10, iHnj4, iHnj5 - (iHnj - i10));
                return;
            }
            int i11 = (((iArrHn[1] + iHnj2) + iHnj5) - this.aq) - 2;
            if (i11 <= 1) {
                return;
            }
            if (i11 <= iMin * 2) {
                int i12 = i11 / 2;
                this.f12547fc.setPadding(iHnj3, iHnj2 - i12, iHnj4, iHnj5 - (i11 - i12));
            } else if (i11 > iHnj2 + iHnj5) {
                final int i13 = (i11 - iHnj2) - iHnj5;
                this.f12547fc.setPadding(iHnj3, 0, iHnj4, 0);
                if (i13 <= ((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), 1.0f)) + 1) {
                    ((TextView) this.f12547fc).setTextSize(this.bug.sk() - 1.0f);
                } else if (i13 <= (((int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(getContext(), 1.0f)) + 1) * 2) {
                    ((TextView) this.f12547fc).setTextSize(this.bug.sk() - 2.0f);
                } else {
                    post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tu.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ViewGroup.LayoutParams layoutParams = tu.this.f12547fc.getLayoutParams();
                                tu tuVar = tu.this;
                                layoutParams.height = tuVar.aq + i13;
                                tuVar.f12547fc.setLayoutParams(layoutParams);
                                tu.this.f12547fc.setTranslationY(-i13);
                                ((ViewGroup) tu.this.f12547fc.getParent()).setClipChildren(false);
                                ((ViewGroup) tu.this.f12547fc.getParent().getParent()).setClipChildren(false);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } else if (iHnj2 > iHnj5) {
                this.f12547fc.setPadding(iHnj3, iHnj2 - (i11 - iMin), iHnj4, iHnj5 - iMin);
            } else {
                this.f12547fc.setPadding(iHnj3, iHnj2 - iMin, iHnj4, iHnj5 - (i11 - iMin));
            }
        }
        if (TextUtils.equals(this.orl.ta().hn(), "fillButton")) {
            this.f12547fc.setTextAlignment(2);
            ((TextView) this.f12547fc).setGravity(17);
        }
    }

    public String getText() {
        String strDkl = this.bug.dkl();
        if (TextUtils.isEmpty(strDkl)) {
            if (!com.bytedance.sdk.component.adexpress.gjv.hn() && TextUtils.equals(this.orl.ta().hn(), "text_star")) {
                strDkl = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.gjv.hn() && TextUtils.equals(this.orl.ta().hn(), "score-count")) {
                strDkl = "6870";
            }
        }
        return (TextUtils.equals(this.orl.ta().hn(), CampaignEx.JSON_KEY_TITLE) || TextUtils.equals(this.orl.ta().hn(), "subtitle")) ? strDkl.replace("\n", "") : strDkl;
    }

    public void hnj(TextView textView, int i10, Context context, String str) {
        textView.setText("(" + String.format(com.bytedance.sdk.component.utils.wu.hnj(context, str), Integer.valueOf(i10)) + ")");
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul
    public boolean ojm() {
        int i10;
        double d10;
        super.ojm();
        if (TextUtils.isEmpty(getText())) {
            this.f12547fc.setVisibility(4);
            return true;
        }
        if (this.bug.sq()) {
            dnm();
            return true;
        }
        ((TextView) this.f12547fc).setText(this.bug.dkl());
        ((TextView) this.f12547fc).setTextDirection(5);
        this.f12547fc.setTextAlignment(this.bug.aq());
        ((TextView) this.f12547fc).setTextColor(this.bug.dse());
        ((TextView) this.f12547fc).setTextSize(this.bug.sk());
        if (!this.bug.wu()) {
            ((TextView) this.f12547fc).setMaxLines(1);
            ((TextView) this.f12547fc).setGravity(17);
            ((TextView) this.f12547fc).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int iAs = this.bug.as();
            if (iAs > 0) {
                ((TextView) this.f12547fc).setLines(iAs);
                ((TextView) this.f12547fc).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVar = this.orl;
        if (aqVar != null && aqVar.ta() != null) {
            boolean zHn = com.bytedance.sdk.component.adexpress.gjv.hn();
            String str = OGoz.rfNeOwoMLiLFa;
            if (zHn && hnj() && (TextUtils.equals(this.orl.ta().hn(), "text_star") || TextUtils.equals(this.orl.ta().hn(), str) || TextUtils.equals(this.orl.ta().hn(), "score-count-type-1") || TextUtils.equals(this.orl.ta().hn(), "score-count-type-2"))) {
                setVisibility(8);
                return true;
            }
            if (!TextUtils.equals(this.orl.ta().hn(), str) && !TextUtils.equals(this.orl.ta().hn(), "score-count-type-2")) {
                if (TextUtils.equals(this.orl.ta().hn(), "text_star")) {
                    try {
                        d10 = Double.parseDouble(getText());
                    } catch (Exception unused) {
                        d10 = -1.0d;
                    }
                    if (d10 < 0.0d || d10 > 5.0d) {
                        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                            setVisibility(8);
                            return true;
                        }
                        this.f12547fc.setVisibility(0);
                    }
                    ((TextView) this.f12547fc).setIncludeFontPadding(false);
                    ((TextView) this.f12547fc).setText(String.format("%.1f", Double.valueOf(d10)));
                } else if (TextUtils.equals("privacy-detail", this.orl.ta().hn())) {
                    ((TextView) this.f12547fc).setText("Permission list | Privacy policy");
                } else if (TextUtils.equals(this.orl.ta().hn(), "development-name")) {
                    ((TextView) this.f12547fc).setText(com.bytedance.sdk.component.utils.wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_text_privacy_development") + getText());
                } else if (TextUtils.equals(this.orl.ta().hn(), "app-version")) {
                    ((TextView) this.f12547fc).setText(com.bytedance.sdk.component.utils.wu.hnj(com.bytedance.sdk.component.adexpress.gjv.hnj(), "tt_text_privacy_app_version") + getText());
                } else {
                    ((TextView) this.f12547fc).setText(getText());
                }
            } else {
                try {
                    try {
                        i10 = Integer.parseInt(getText());
                    } catch (Exception unused2) {
                    }
                } catch (NumberFormatException unused3) {
                    i10 = -1;
                }
                if (i10 < 0) {
                    if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                        setVisibility(8);
                        return true;
                    }
                    this.f12547fc.setVisibility(0);
                }
                if (TextUtils.equals(this.orl.ta().hn(), "score-count-type-2")) {
                    ((TextView) this.f12547fc).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                    ((TextView) this.f12547fc).setGravity(17);
                    return true;
                }
                hnj((TextView) this.f12547fc, i10, getContext(), "tt_comment_num");
            }
            this.f12547fc.setTextAlignment(this.bug.aq());
            ((TextView) this.f12547fc).setGravity(this.bug.ojm());
            if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
                ta();
            }
        }
        return true;
    }
}
