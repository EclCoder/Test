package com.bytedance.sdk.openadsdk.core.bug;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private boolean apu;
    private float bug;
    private float dnm;
    private int dse;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private float f13622fc;
    protected String hnj;
    private float jip;
    private boolean mjg;

    /* JADX INFO: renamed from: oj, reason: collision with root package name */
    private float f13624oj;
    private int ojm;
    private int orl;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f13625sk;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private TextUtils.TruncateAt f13626ta;
    private float uua;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private Context f13627xn;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected int f13623hn = -16777216;
    private float qor = 12.0f;
    private float gjv = -1.0f;
    private int dkl = Integer.MAX_VALUE;
    private int aq = 8388611;

    public hn(Context context, boolean z10) {
        this.f13627xn = context;
        this.apu = z10;
    }

    private int gjv(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    private int hn(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1178781136) {
            return str.equals(TtmlNode.ITALIC) ? 2 : 0;
        }
        if (iHashCode != -1039745817) {
            return (iHashCode == 3029637 && str.equals(TtmlNode.BOLD)) ? 1 : 0;
        }
        str.equals("normal");
        return 0;
    }

    private TextUtils.TruncateAt qor(String str) {
        if (TextUtils.equals(str, DevicePublicKeyStringDef.NONE)) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public void hnj(com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnjVar) {
        if (hnjVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.hnj)) {
            hnjVar.setText(TextUtils.equals("null", this.hnj) ? "" : this.hnj);
        }
        hnjVar.setTextSize(1, this.qor);
        hnjVar.setMinTextSize(aq.hnj(this.f13627xn, this.gjv));
        hnjVar.setTextColor(this.f13623hn);
        hnjVar.setGravity(this.aq);
        hnjVar.setLines(this.dse);
        hnjVar.setMaxLines(this.dkl);
        int i10 = this.ojm;
        if (i10 != Integer.MAX_VALUE) {
            hnjVar.setPaintFlags(i10);
        }
        hnjVar.setEllipsize(this.f13626ta);
        if (this.dnm > 0.0f) {
            if (this.apu) {
                qor(hnjVar);
            } else {
                hn(hnjVar);
            }
        }
        hnjVar.setTypeface(hnj((int) this.bug));
        gjv(hnjVar);
        float fHnj = aq.hnj(this.f13627xn, this.qor);
        if (fHnj > 0.0f) {
            hnjVar.setLetterSpacing(this.f13624oj / fHnj);
        }
        hnjVar.setIncludeFontPadding(false);
    }

    private void gjv(com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnjVar) {
        if (!this.apu) {
            hnjVar.setShadowLayer(this.uua, this.f13622fc, this.jip, this.orl);
        } else if (this.mjg) {
            float f10 = this.uua;
            if (f10 <= 0.0f) {
                f10 = 1.0E-5f;
            }
            hnjVar.setShadowLayer(f10, this.f13622fc, this.jip, this.orl);
        }
    }

    private void hn(com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnjVar) {
        hnjVar.setLineSpacing(0.0f, this.dnm);
    }

    private void qor(com.bytedance.adsdk.ugeno.ojm.dkl.hnj hnjVar) {
        float f10 = this.dnm;
        if (f10 <= 3.0f) {
            hnjVar.setLineSpacing(0.0f, f10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(aq.hnj(this.f13627xn, (f10 - (this.qor * 1.2f)) / 2.0f));
            hnjVar.setPadding(hnjVar.getPaddingLeft(), hnjVar.getPaddingTop() + iRound, hnjVar.getPaddingRight(), hnjVar.getPaddingBottom() + iRound);
            hnjVar.setLineHeight(Math.round(aq.hnj(this.f13627xn, this.dnm)));
        }
    }

    public void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "shadowColor":
                this.orl = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                this.mjg = true;
                break;
            case "shadowOffsetX":
                this.f13622fc = aq.hnj(this.f13627xn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.jip = aq.hnj(this.f13627xn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case "textAlign":
                this.aq = hnj(str2);
                break;
            case "textColor":
                this.f13623hn = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case "textStyle":
                this.f13625sk = hn(str2);
                break;
            case "shadowBlur":
                this.uua = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case "textSize":
                this.qor = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case "textDecoration":
                this.ojm = gjv(str2);
                break;
            case "fontWeight":
                float fHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, -1.0f);
                this.bug = fHnj;
                if (fHnj < 1.0f || fHnj > 1000.0f) {
                    this.bug = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.dnm = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f);
                break;
            case "text":
                this.hnj = str2;
                break;
            case "lines":
                this.dse = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0);
                break;
            case "ellipsis":
                this.f13626ta = qor(str2);
                break;
            case "minTextSize":
                this.gjv = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, -1.0f);
                break;
            case "maxLines":
                int iHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, Integer.MAX_VALUE);
                this.dkl = iHnj > 0 ? iHnj : Integer.MAX_VALUE;
                break;
            case "letterSpacing":
                this.f13624oj = aq.hnj(this.f13627xn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
        }
    }

    private int hnj(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private Typeface hnj(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.DEFAULT, i10, false);
        }
        return i10 >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
