package com.bytedance.adsdk.ugeno.sk;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends com.bytedance.adsdk.ugeno.hn.hnj<sk> {
    private int dlk;
    private int iwu;

    /* JADX INFO: renamed from: lf, reason: collision with root package name */
    private int f12395lf;

    /* JADX INFO: renamed from: vk, reason: collision with root package name */
    private int f12396vk;

    /* JADX INFO: renamed from: yo, reason: collision with root package name */
    private int f12397yo;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static class hnj extends com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj {

        /* JADX INFO: renamed from: gm, reason: collision with root package name */
        public int f12398gm;
        public int hqh;
        public float nyv;
        public int pty;
        public int tgn;

        /* JADX INFO: renamed from: ua, reason: collision with root package name */
        public int f12399ua;

        /* JADX INFO: renamed from: ul, reason: collision with root package name */
        public int f12400ul;

        /* JADX INFO: renamed from: vf, reason: collision with root package name */
        public float f12401vf;
        public float xyo;

        public hnj(com.bytedance.adsdk.ugeno.hn.hnj hnjVar) {
            super(hnjVar);
            this.tgn = 1;
            this.xyo = 0.0f;
            this.f12401vf = 0.0f;
            this.hqh = -1;
            this.nyv = -1.0f;
            this.pty = -1;
            this.f12398gm = -1;
            this.f12400ul = 16777215;
            this.f12399ua = 16777215;
        }

        private float gjv(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float hn(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float qor(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private int sk(String str) {
            str.getClass();
            switch (str) {
                case "stretch":
                    return 4;
                case "baseline":
                    return 3;
                case "center":
                    return 2;
                case "flex_start":
                    return 0;
                case "flex_end":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
        public sk.hnj hnj() {
            sk.hnj hnjVar = new sk.hnj((int) this.hnj, (int) this.f12268hn);
            ((ViewGroup.MarginLayoutParams) hnjVar).leftMargin = (int) this.dkl;
            ((ViewGroup.MarginLayoutParams) hnjVar).rightMargin = (int) this.dse;
            ((ViewGroup.MarginLayoutParams) hnjVar).topMargin = (int) this.aq;
            ((ViewGroup.MarginLayoutParams) hnjVar).bottomMargin = (int) this.ojm;
            hnjVar.qor(this.tgn);
            hnjVar.gjv(this.hqh);
            hnjVar.hnj(this.xyo);
            hnjVar.hn(this.f12401vf);
            hnjVar.qor(this.nyv);
            return hnjVar;
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        public void hnj(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.hnj(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.nyv = gjv(str2);
                    break;
                case "order":
                    this.tgn = hnj(str2);
                    break;
                case "flexShrink":
                    this.f12401vf = qor(str2);
                    break;
                case "flexGrow":
                    this.xyo = hn(str2);
                    break;
                case "alignSelf":
                    this.hqh = sk(str2);
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        public String toString() {
            return "LayoutParams{mWidth=" + this.hnj + ", mHeight=" + this.f12268hn + ", mMargin=" + this.f12270sk + ", mMarginLeft=" + this.dkl + ", mMarginRight=" + this.dse + ", mMarginTop=" + this.aq + ", mMarginBottom=" + this.ojm + ", mParams=" + this.f9do + ", mOrder=" + this.tgn + ", mFlexGrow=" + this.xyo + ", mFlexShrink=" + this.f12401vf + ", mAlignSelf=" + this.hqh + ", mFlexBasisPercent=" + this.nyv + ", mMinWidth=" + this.pty + jyeoXJ.aqVtmo + this.f12398gm + ", mMaxWidth=" + this.f12400ul + ", mMaxHeight=" + this.f12399ua + "} " + super.toString();
        }

        private int hnj(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public dkl(Context context) {
        super(context);
    }

    private int fc(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    private int jip(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 4;
            case -1720785339:
                return str.equals("baseline") ? 3 : 4;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 4;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 4;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 4;
            default:
                return 4;
        }
    }

    private int mjg(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int uua(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 5;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 5;
            case -932331738:
                return str.equals("space_around") ? 4 : 5;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 5;
            case 1682480591:
                return str.equals("space_between") ? 3 : 5;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 5;
            default:
                return 5;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        super.hn();
        ((sk) this.f12293sk).setFlexDirection(this.iwu);
        ((sk) this.f12293sk).setFlexWrap(this.dlk);
        ((sk) this.f12293sk).setJustifyContent(this.f12396vk);
        ((sk) this.f12293sk).setAlignItems(this.f12395lf);
        ((sk) this.f12293sk).setAlignContent(this.f12397yo);
    }

    int orl(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public sk hnj() {
        sk skVar = new sk(this.f12280hn);
        skVar.hnj(this);
        return skVar;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj ta() {
        return new hnj(this);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    public void hnj(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.hnj(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.f12395lf = jip(str2);
                break;
            case "flexDirection":
                this.iwu = orl(str2);
                break;
            case "alignContent":
                this.f12397yo = uua(str2);
                break;
            case "flexWrap":
                this.dlk = mjg(str2);
                break;
            case "justifyContent":
                this.f12396vk = fc(str2);
                break;
        }
    }
}
