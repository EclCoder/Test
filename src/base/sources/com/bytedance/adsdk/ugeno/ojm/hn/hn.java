package com.bytedance.adsdk.ugeno.ojm.hn;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends com.bytedance.adsdk.ugeno.hn.hnj<com.bytedance.adsdk.ugeno.ojm.hn.hnj> {
    private com.bytedance.adsdk.ugeno.ojm.hn.hnj iwu;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj extends com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj {
        protected int tgn;

        public hnj(com.bytedance.adsdk.ugeno.hn.hnj hnjVar) {
            super(hnjVar);
            this.tgn = -1;
        }

        private int hn(String str) {
            str.getClass();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        /* JADX INFO: renamed from: hn, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams hnj() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.hnj, (int) this.f12268hn);
            layoutParams.leftMargin = (int) this.dkl;
            layoutParams.rightMargin = (int) this.dse;
            layoutParams.topMargin = (int) this.aq;
            layoutParams.bottomMargin = (int) this.ojm;
            layoutParams.gravity = this.tgn;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj
        public void hnj(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.hnj(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.tgn = hnj(str2);
            }
        }

        private int hnj(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iHn = 0;
            for (String str2 : strArrSplit) {
                iHn |= hn(str2);
            }
            return iHn;
        }
    }

    public hn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj, com.bytedance.adsdk.ugeno.hn.qor
    public void hn() {
        this.iwu.setEventMap(this.f12283ko);
        super.hn();
    }

    @Override // com.bytedance.adsdk.ugeno.hn.qor
    /* JADX INFO: renamed from: qor, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.ojm.hn.hnj hnj() {
        com.bytedance.adsdk.ugeno.ojm.hn.hnj hnjVar = new com.bytedance.adsdk.ugeno.ojm.hn.hnj(this.f12280hn);
        this.iwu = hnjVar;
        hnjVar.hnj(this);
        return this.iwu;
    }

    @Override // com.bytedance.adsdk.ugeno.hn.hnj
    public com.bytedance.adsdk.ugeno.hn.hnj.C0169hnj ta() {
        return new hnj(this);
    }
}
