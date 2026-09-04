package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.sk.dnm;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse {
    private String dkl;
    private dkl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public String f12599hn;
    public int hnj;
    public JSONObject qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private sk f12600sk;

    public dse(sk skVar) {
        this.f12600sk = skVar;
        this.hnj = skVar.hnj();
        this.f12599hn = skVar.qor();
        this.qor = skVar.sk().hkr();
        this.dkl = skVar.gjv();
        if (com.bytedance.sdk.component.adexpress.gjv.qor() == 1) {
            this.gjv = skVar.dse();
        } else {
            this.gjv = skVar.sk();
        }
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            this.gjv = skVar.sk();
        }
    }

    private boolean krm() {
        if (com.bytedance.sdk.component.adexpress.gjv.hn()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.f12599hn) && this.f12599hn.contains("adx:")) || dnm.hn();
    }

    private boolean meb() {
        return (com.bytedance.sdk.component.adexpress.gjv.hn() && (this.f12600sk.hn().contains("logo-union") || this.f12600sk.hn().contains("logounion") || this.f12600sk.hn().contains("logoad"))) || "logo-union".equals(this.f12600sk.hn()) || "logounion".equals(this.f12600sk.hn()) || "logoad".equals(this.f12600sk.hn());
    }

    public boolean apu() {
        return this.gjv.rg();
    }

    public int aq() {
        String strEum = this.gjv.eum();
        if (TtmlNode.LEFT.equals(strEum)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(strEum)) {
            return 4;
        }
        return TtmlNode.RIGHT.equals(strEum) ? 3 : 2;
    }

    public int as() {
        return this.gjv.dzo();
    }

    public String bug() {
        return this.dkl;
    }

    public boolean cm() {
        return this.gjv.zd();
    }

    public String dkl() {
        if (this.hnj == 0) {
            return !TextUtils.isEmpty(this.f12599hn) ? this.f12599hn : this.qor.optString(com.bytedance.sdk.component.adexpress.gjv.dse.qor(com.bytedance.sdk.component.adexpress.gjv.hnj()));
        }
        return "";
    }

    public String dnm() {
        return this.hnj == 1 ? this.f12599hn : "";
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public String m8do() {
        return this.gjv.sq();
    }

    public int dse() {
        return hnj(this.gjv.wu());
    }

    public double dy() {
        return this.gjv.fvt();
    }

    public int dzo() {
        return this.gjv.dse();
    }

    public String eta() {
        return this.gjv.hqh();
    }

    public String eum() {
        return this.gjv.m5do();
    }

    public float fc() {
        return this.gjv.dnm();
    }

    public int ff() {
        return this.gjv.jo();
    }

    public int fr() {
        return this.gjv.ul();
    }

    public String fvt() {
        return this.gjv.ta();
    }

    public int fzb() {
        return this.gjv.ko();
    }

    public int gjv() {
        return (int) this.gjv.jip();
    }

    public int gm() {
        return this.gjv.sk();
    }

    public double gn() {
        return this.gjv.ua();
    }

    public String hkr() {
        return this.gjv.sh();
    }

    public int hn() {
        return (int) this.gjv.uua();
    }

    public int hnj() {
        return (int) this.gjv.mjg();
    }

    public double hqh() {
        return this.gjv.aq();
    }

    public int idl() {
        return this.gjv.vk();
    }

    public boolean izk() {
        return this.gjv.orl();
    }

    public int jbd() {
        return this.gjv.fzb();
    }

    public int jip() {
        return hnj(this.gjv.tgn());
    }

    public int jo() {
        return this.gjv.af();
    }

    public String ka() {
        return this.gjv.tq();
    }

    public String lhi() {
        return this.gjv.nyv();
    }

    public String lko() {
        return this.gjv.tu();
    }

    public int lu() {
        return this.gjv.aip();
    }

    public double mjg() {
        return this.gjv.xn();
    }

    public boolean mkl() {
        return this.gjv.pty();
    }

    public int nyv() {
        return this.gjv.qor();
    }

    public int oj() {
        return this.gjv.sg();
    }

    public int ojm() {
        int iAq = aq();
        if (iAq == 4) {
            return 17;
        }
        return iAq == 3 ? 8388613 : 8388611;
    }

    public double orl() {
        if (this.hnj == 11) {
            try {
                double d10 = Double.parseDouble(this.f12599hn);
                return !com.bytedance.sdk.component.adexpress.gjv.hn() ? (int) d10 : d10;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public String orp() {
        return this.gjv.jbd();
    }

    public int pnz() {
        return this.gjv.mw();
    }

    public int pty() {
        return this.gjv.hn();
    }

    public int pv() {
        return this.gjv.mn();
    }

    public int qb() {
        return this.gjv.gm();
    }

    public int qor() {
        return (int) this.gjv.fc();
    }

    public boolean rmr() {
        return this.gjv.iwu();
    }

    public boolean rq() {
        return this.gjv.iwu();
    }

    public float sk() {
        return this.gjv.oj();
    }

    public boolean sq() {
        return this.gjv.th();
    }

    public String ta() {
        int i10 = this.hnj;
        return (i10 == 2 || i10 == 13) ? this.f12599hn : "";
    }

    public long tgn() {
        return this.gjv.kby();
    }

    public boolean th() {
        return this.gjv.rd();
    }

    public String tll() {
        return this.gjv.jle();
    }

    public String tu() {
        return this.gjv.tb();
    }

    public int ua() {
        return this.gjv.ojm();
    }

    public int ul() {
        return this.gjv.gjv();
    }

    public float uua() {
        return this.gjv.bug();
    }

    public int vf() {
        return hnj(this.gjv.as());
    }

    public boolean wu() {
        return this.gjv.cm();
    }

    public String xad() {
        return this.gjv.orp();
    }

    public int xn() {
        return this.gjv.wxi();
    }

    public int xo() {
        return this.gjv.bgg();
    }

    public int xyo() {
        String strSq = this.gjv.sq();
        if ("skip-with-time-skip-btn".equals(this.f12600sk.hn()) || FreeSpaceBox.TYPE.equals(this.f12600sk.hn()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f12600sk.hn())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f12600sk.hn()) && !"skip-with-time".equals(this.f12600sk.hn())) {
            if (this.hnj == 10 && TextUtils.equals(this.gjv.jbd(), CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                return 5;
            }
            if (meb() && krm()) {
                return 0;
            }
            if (meb()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f12600sk.hn())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strSq) && !strSq.equals(DevicePublicKeyStringDef.NONE)) {
                if (strSq.equals(MimeTypes.BASE_TYPE_VIDEO) || (this.f12600sk.hnj() == 7 && TextUtils.equals(strSq, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.gjv.hn() && this.f12600sk.sk() != null && this.f12600sk.sk().qi()) ? 11 : 4;
                }
                if (strSq.equals("normal")) {
                    return 1;
                }
                return (strSq.equals("creative") || "slide".equals(this.gjv.jbd())) ? 2 : 0;
            }
        }
        return 0;
    }

    public int znr() {
        return this.gjv.xw();
    }

    public String zt() {
        return this.gjv.dlk();
    }

    public static float[] hn(String str) {
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        return (strArrSplit == null || strArrSplit.length != 4) ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public void hnj(float f10) {
        this.gjv.hnj(f10);
    }

    public static int hnj(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (strArrSplit.length == 4) {
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public boolean hnj(int i10) {
        sk skVar = this.f12600sk;
        if (skVar == null) {
            return false;
        }
        if (i10 == 1) {
            this.gjv = skVar.dse();
        } else {
            this.gjv = skVar.sk();
        }
        return this.gjv != null;
    }
}
