package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.Partner;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.inmobi.media.core.config.models.AdConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Partner f25916a;

    static {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        String partnerKey = ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getViewability().getOmidConfig().getPartnerKey();
        if (partnerKey.length() == 0) {
            partnerKey = "Inmobi";
        }
        Partner partnerCreatePartner = Partner.createPartner(partnerKey, a());
        kotlin.jvm.internal.s.g(partnerCreatePartner, "createPartner(...)");
        f25916a = partnerCreatePartner;
    }

    public static AdSessionContext a(String omsdkScript, List adVerifications, Map macros, String str, String customReferenceData) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        kotlin.jvm.internal.s.h(omsdkScript, "omsdkScript");
        kotlin.jvm.internal.s.h(adVerifications, "omidTrackers");
        kotlin.jvm.internal.s.h(macros, "macros");
        kotlin.jvm.internal.s.h(customReferenceData, "customReferenceData");
        kotlin.jvm.internal.s.h(adVerifications, "adVerifications");
        kotlin.jvm.internal.s.h(macros, "macros");
        ArrayList arrayList = new ArrayList(gl.r.v(adVerifications, 10));
        Iterator it = adVerifications.iterator();
        while (it.hasNext()) {
            Hf hf2 = (Hf) it.next();
            try {
                String str2 = hf2.f24652a;
                if (macros != null) {
                    String strI = str2;
                    for (Map.Entry entry : macros.entrySet()) {
                        strI = bm.r.I(strI, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
                    }
                    str2 = strI;
                }
                URL url = new URL(str2);
                String str3 = hf2.f24946c;
                String str4 = hf2.f24947d;
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = (str3.length() <= 0 || !J3.a(str4)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str3, url, str4);
            } catch (MalformedURLException unused) {
                verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = null;
            }
            arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
        }
        AdSessionContext adSessionContextCreateNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(f25916a, omsdkScript, gl.r.Y(arrayList), str, customReferenceData);
        kotlin.jvm.internal.s.g(adSessionContextCreateNativeAdSessionContext, "createNativeAdSessionContext(...)");
        return adSessionContextCreateNativeAdSessionContext;
    }

    public static String a() {
        return "a" + bm.r.I("11.2.0", ".", "", false, 4, null);
    }
}
