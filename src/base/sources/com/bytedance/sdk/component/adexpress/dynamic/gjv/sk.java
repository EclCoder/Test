package com.bytedance.sdk.component.adexpress.dynamic.gjv;

import android.text.TextUtils;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class sk {
    public static final Map<String, Integer> hnj;
    private String dkl;
    private dkl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f12614hn;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private dkl f12615sk;

    public int dkl() {
        return this.gjv.lko();
    }

    public dkl dse() {
        return this.f12615sk;
    }

    public String gjv() {
        return this.dkl;
    }

    public String hn() {
        return this.f12614hn;
    }

    public int hnj() {
        if (TextUtils.isEmpty(this.f12614hn)) {
            return 0;
        }
        if (this.f12614hn.equals("logo")) {
            String str = this.f12614hn + this.qor;
            this.f12614hn = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f12614hn.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = hnj;
        if (map.get(this.f12614hn) != null) {
            return map.get(this.f12614hn).intValue();
        }
        return -1;
    }

    public String qor() {
        return this.qor;
    }

    public dkl sk() {
        return this.gjv;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f12614hn + "', data='" + this.qor + "', value=" + this.gjv + ", themeValue=" + this.f12615sk + ", dataExtraInfo='" + this.dkl + "'}";
    }

    static {
        HashMap map = new HashMap();
        hnj = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put(CampaignEx.JSON_KEY_TITLE, 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        map.put(KPtaxpyICj.tummNScnyyg, 5);
        map.put("logo-union", 9);
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        map.put("webview-close", 22);
        map.put("feedback-dislike", 12);
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        map.put("carousel-vessel", 26);
        map.put("leisure-interact", 25);
        map.put("video-hd", 7);
        map.put(MimeTypes.BASE_TYPE_VIDEO, 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        map.put("star", 11);
        map.put("skip-countdowns", 19);
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        map.put("skip-with-countdowns-skip-countdown", 20);
        map.put("skip-with-time", 14);
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put(FreeSpaceBox.TYPE, 27);
        map.put("timedown", 13);
        map.put(RewardPlus.ICON, 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public void hn(String str) {
        this.qor = str;
    }

    public void qor(String str) {
        this.dkl = str;
    }

    public void hn(dkl dklVar) {
        this.f12615sk = dklVar;
    }

    public void hnj(String str) {
        this.f12614hn = str;
    }

    public void hnj(dkl dklVar) {
        this.gjv = dklVar;
    }
}
