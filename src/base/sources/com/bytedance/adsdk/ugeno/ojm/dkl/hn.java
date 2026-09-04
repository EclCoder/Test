package com.bytedance.adsdk.ugeno.ojm.dkl;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.dse.aq;
import com.bytedance.adsdk.ugeno.hn.qor;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class hn extends qor<hnj> {
    private float dlk;
    protected String hnj;
    private float hw;
    protected int iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private int f12340lf;

    @Deprecated
    private float lx;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f12341mn;
    private int mw;
    private int pwt;

    /* JADX INFO: renamed from: qi, reason: collision with root package name */
    private float f12342qi;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    @Deprecated
    private TextUtils.TruncateAt f12343rg;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private int f12344sg;

    /* JADX INFO: renamed from: sh, reason: collision with root package name */
    private float f12345sh;

    /* JADX INFO: renamed from: sl, reason: collision with root package name */
    private float f12346sl;

    /* JADX INFO: renamed from: tb, reason: collision with root package name */
    private float f12347tb;
    private boolean tq;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private float f12348vk;
    private TextUtils.TruncateAt wxi;

    /* JADX INFO: renamed from: xd, reason: collision with root package name */
    private float f12349xd;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    @Deprecated
    private float f12350xe;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private int f12351yo;

    public hn(Context context) {
        super(context);
        this.iwu = -16777216;
        this.dlk = 12.0f;
        this.f12348vk = -1.0f;
        this.f12351yo = Integer.MAX_VALUE;
        this.mw = 8388611;
        this.wxi = TextUtils.TruncateAt.END;
        this.hw = -1.0f;
        this.f12342qi = 400.0f;
    }

    private TextUtils.TruncateAt fc(String str) {
        if (TextUtils.equals(str, DevicePublicKeyStringDef.NONE)) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private void gjv() {
        ((hnj) this.f12293sk).setLineSpacing(0.0f, this.hw);
    }

    private int jip(String str) {
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

    private TextUtils.TruncateAt mjg(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.f12343rg = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.f12343rg = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.f12343rg = TextUtils.TruncateAt.START;
                break;
            default:
                this.f12343rg = null;
                break;
        }
        return this.f12343rg;
    }

    private int oj(String str) {
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

    private void ojm() {
        float f10 = this.hw;
        if (f10 <= 3.0f) {
            ((hnj) this.f12293sk).setLineSpacing(0.0f, f10);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(aq.hnj(this.f12280hn, (f10 - (this.dlk * 1.2f)) / 2.0f));
            int paddingTop = ((hnj) this.f12293sk).getPaddingTop() + iRound;
            int paddingBottom = ((hnj) this.f12293sk).getPaddingBottom() + iRound;
            T t10 = this.f12293sk;
            ((hnj) t10).setPadding(((hnj) t10).getPaddingLeft(), paddingTop, ((hnj) this.f12293sk).getPaddingRight(), paddingBottom);
            ((hnj) this.f12293sk).setLineHeight(Math.round(aq.hnj(this.f12280hn, this.hw)));
        }
    }

    private int uua(String str) {
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

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        if (TextUtils.equals("null", this.hnj)) {
            this.hnj = "";
        }
        orl(this.hnj);
        ((hnj) this.f12293sk).setTextSize(1, this.dlk);
        ((hnj) this.f12293sk).setTextColor(this.iwu);
        ((hnj) this.f12293sk).setLines(this.pwt);
        ((hnj) this.f12293sk).setMaxLines(this.f12351yo);
        ((hnj) this.f12293sk).setGravity(this.mw);
        ((hnj) this.f12293sk).setIncludeFontPadding(false);
        ((hnj) this.f12293sk).setMinTextSize(aq.hnj(this.f12280hn, this.f12348vk));
        hnj(this.f12344sg);
        if (pty()) {
            hnj(this.wxi);
        } else {
            hnj(this.f12343rg);
        }
        if (this.hw > 0.0f) {
            if (pty()) {
                ojm();
            } else {
                gjv();
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        ((hnj) this.f12293sk).setBreakStrategy(0);
        if (!pty()) {
            ((hnj) this.f12293sk).setShadowLayer(this.f12349xd, this.f12350xe, this.lx, this.f12341mn);
        } else if (this.tq) {
            if (this.f12349xd <= 0.0f) {
                this.f12349xd = 1.0E-5f;
            }
            ((hnj) this.f12293sk).setShadowLayer(this.f12349xd, this.f12345sh, this.f12346sl, this.f12341mn);
        }
        int i11 = this.f12340lf;
        if (i11 == 1) {
            ((hnj) this.f12293sk).setTypeface(Typeface.DEFAULT, i11);
        } else if (i10 >= 28) {
            ((hnj) this.f12293sk).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.f12342qi, i11 == 2));
        } else if (this.f12342qi >= 500.0f) {
            ((hnj) this.f12293sk).setTypeface(Typeface.DEFAULT, 1);
        }
        if (aq.hnj(this.f12280hn, this.dlk) > 0.0f) {
            ((hnj) this.f12293sk).setLetterSpacing(this.f12347tb / aq.hnj(this.f12280hn, this.dlk));
        }
    }

    public void orl(String str) {
        this.hnj = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.hnj = "";
        }
        ((hnj) this.f12293sk).setText(this.hnj);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public hnj hnj() {
        hnj hnjVar = new hnj(this.f12280hn);
        hnjVar.hnj(this);
        return hnjVar;
    }

    public void hnj(int i10) {
        this.f12344sg = i10;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        ((hnj) this.f12293sk).setPaintFlags(i10);
    }

    public void hnj(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((hnj) this.f12293sk).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.hnj(str, str2);
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1621067310:
                if (str.equals("shadowRadius")) {
                    b10 = 0;
                }
                break;
            case -1589741021:
                if (str.equals("shadowColor")) {
                    b10 = 1;
                }
                break;
            case -1230714651:
                if (str.equals("shadowOffsetX")) {
                    b10 = 2;
                }
                break;
            case -1230714650:
                if (str.equals("shadowOffsetY")) {
                    b10 = 3;
                }
                break;
            case -1065511464:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                    b10 = 4;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b10 = 5;
                }
                break;
            case -1048634236:
                if (str.equals("textStyle")) {
                    b10 = 6;
                }
                break;
            case -1021145689:
                if (str.equals("shadowBlur")) {
                    b10 = 7;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    b10 = 8;
                }
                break;
            case -879295043:
                if (str.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                    b10 = 9;
                }
                break;
            case -756368940:
                if (str.equals("shadowDx")) {
                    b10 = 10;
                }
                break;
            case -756368939:
                if (str.equals("shadowDy")) {
                    b10 = 11;
                }
                break;
            case -734428249:
                if (str.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                    b10 = 12;
                }
                break;
            case -515807685:
                if (str.equals("lineHeight")) {
                    b10 = 13;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    b10 = 14;
                }
                break;
            case 102977279:
                if (str.equals("lines")) {
                    b10 = 15;
                }
                break;
            case 188702929:
                if (str.equals("ellipsis")) {
                    b10 = 16;
                }
                break;
            case 351195968:
                if (str.equals("minTextSize")) {
                    b10 = 17;
                }
                break;
            case 390232059:
                if (str.equals(lkCBSIFlvmyGX.vQplZBOjD)) {
                    b10 = 18;
                }
                break;
            case 1554823821:
                if (str.equals("ellipsize")) {
                    b10 = 19;
                }
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    b10 = 20;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 7:
                this.f12349xd = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 1:
                this.f12341mn = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                this.tq = true;
                break;
            case 2:
                this.f12345sh = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case 3:
                this.f12346sl = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
            case 4:
                this.mw = uua(str2);
                break;
            case 5:
                this.iwu = com.bytedance.adsdk.ugeno.dse.hnj.hnj(str2);
                break;
            case 6:
                this.f12340lf = jip(str2);
                break;
            case 8:
                this.dlk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 9:
                this.f12344sg = oj(str2);
                break;
            case 10:
                this.f12350xe = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 11:
                this.lx = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f);
                break;
            case 12:
                float fHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, -1.0f);
                this.f12342qi = fHnj;
                if (fHnj < 1.0f || fHnj > 1000.0f) {
                    this.f12342qi = 400.0f;
                }
                break;
            case 13:
                this.hw = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 1.0f);
                break;
            case 14:
                this.hnj = str2;
                break;
            case 15:
                this.pwt = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0);
                break;
            case 16:
                this.wxi = fc(str2);
                break;
            case 17:
                this.f12348vk = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, -1.0f);
                break;
            case 18:
                int iHnj = com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, Integer.MAX_VALUE);
                this.f12351yo = iHnj > 0 ? iHnj : Integer.MAX_VALUE;
                break;
            case 19:
                this.f12343rg = mjg(str2);
                break;
            case 20:
                this.f12347tb = aq.hnj(this.f12280hn, com.bytedance.adsdk.ugeno.dse.qor.hnj(str2, 0.0f));
                break;
        }
    }
}
