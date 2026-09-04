package com.bytedance.sdk.openadsdk.core.orl;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    public static dse hnj(View view, Set<ta> set) {
        AdSession adSessionHnj = hnj(CreativeType.VIDEO, set, Owner.NATIVE);
        return new ojm(adSessionHnj, AdEvents.createAdEvents(adSessionHnj), view, MediaEvents.createMediaEvents(adSessionHnj));
    }

    public static dse hnj(WebView webView) {
        Partner partnerHnj = sk.hnj();
        if (partnerHnj != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerHnj, webView, "", ""));
            return new dse(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession hnj(CreativeType creativeType, Set<ta> set, Owner owner) {
        List<VerificationScriptResource> listHnj = hnj(set);
        listHnj.isEmpty();
        Partner partnerHnj = sk.hnj();
        if (partnerHnj == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerHnj, sk.hn(), listHnj, "", ""));
    }

    private static List<VerificationScriptResource> hnj(Set<ta> set) {
        ArrayList arrayList = new ArrayList();
        for (ta taVar : set) {
            try {
                if (!TextUtils.isEmpty(taVar.hnj()) && !TextUtils.isEmpty(taVar.hn())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(taVar.hnj(), taVar.qor(), taVar.hn()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(taVar.qor()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
