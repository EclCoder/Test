package com.bytedance.sdk.openadsdk.hnj.hn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.core.uua;
import com.bytedance.sdk.openadsdk.utils.nyv;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.tgn;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq extends PAGNativeAd {
    private boolean aq;
    protected int dkl;
    protected String dse;
    protected hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected final as f14506hn;
    protected uua hnj;
    private boolean ojm;
    protected final Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected int f14507sk;

    public aq(Context context, as asVar, int i10, boolean z10) {
        this.f14506hn = asVar;
        this.qor = context;
        this.f14507sk = i10;
        this.dkl = asVar.atw();
        String strQor = orp.qor(i10);
        this.dse = strQor;
        if (z10) {
            this.gjv = new hnj(context, asVar, strQor);
            this.hnj = new uua(context, this, asVar, hnj(i10), this.gjv);
        }
    }

    private List<View> hnj(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                linkedList.add(list.get(i10));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                linkedList.add(list2.get(i11));
            }
        }
        return linkedList;
    }

    public hnj aq() {
        return this.gjv;
    }

    protected boolean dse() {
        as asVar = this.f14506hn;
        return (asVar == null || asVar.rg() == 5 || oj.gjv().qor(this.dkl) != 1) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        as asVar = this.f14506hn;
        if (asVar == null || asVar.jd() == null) {
            return null;
        }
        try {
            return this.f14506hn.jd().get(str);
        } catch (Throwable th2) {
            apu.qor("TTNativeAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        as asVar = this.f14506hn;
        if (asVar != null) {
            return asVar.jd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new gjv(aq());
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.ojm) {
            return;
        }
        nyv.hnj(this.f14506hn, d10, str, str2);
        this.ojm = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        if (viewGroup == null || list == null || list.size() <= 0) {
            return;
        }
        hnj(viewGroup, null, list, list2, view, new dse(pAGNativeAdInteractionListener));
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.aq) {
            return;
        }
        nyv.hnj(this.f14506hn, d10);
        this.aq = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    private String hnj(int i10) {
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 != 2) {
            return "embeded_ad";
        }
        return "interaction";
    }

    protected void hnj(String str) {
        this.dse = str;
    }

    public void hnj(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final dkl dklVar) {
        if (viewGroup == null || list2 == null || list2.size() <= 0) {
            return;
        }
        if (dse()) {
            list3 = hnj(list2, list3);
        }
        List<View> list4 = list3;
        if (view != null && dklVar != null && dklVar.hn()) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.aq.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    final String strHnj = tgn.hnj();
                    TTDelegateActivity.hnj(aq.this.f14506hn, strHnj, new com.bytedance.sdk.openadsdk.core.gjv.dse.hnj() { // from class: com.bytedance.sdk.openadsdk.hnj.hn.aq.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.gjv.dse.hnj
                        public void hnj() {
                            dklVar.hnj();
                            ta.hn().dkl(strHnj);
                            PAGMediaView pAGMediaViewHnj = aq.this.aq().hnj();
                            if (pAGMediaViewHnj != null) {
                                pAGMediaViewHnj.close();
                            }
                        }
                    });
                }
            });
        }
        this.hnj.hnj(viewGroup, list, list2, list4, dklVar);
        as asVar = this.f14506hn;
        com.bytedance.sdk.openadsdk.p000do.hn.sk.hnj(viewGroup, this.f14506hn, (asVar == null || asVar.th() != 2) ? null : new com.bytedance.sdk.openadsdk.do.hn.sk.hnj(this.f14506hn.rq()));
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }
}
