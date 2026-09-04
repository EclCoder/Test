package com.inmobi.compliance;

import com.inmobi.media.AbstractC2852b4;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/inmobi/compliance/InMobiPrivacyCompliance;", "", "", "doNotSell", "Lfl/g0;", "setDoNotSell", "(Z)V", "", "privacyString", "setUSPrivacyString", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiPrivacyCompliance {
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    public static final void setDoNotSell(boolean doNotSell) {
        AbstractC2852b4.f26244a.put("do_not_sell", doNotSell ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
    }

    public static final void setUSPrivacyString(String privacyString) {
        s.h(privacyString, "privacyString");
        HashMap map = AbstractC2852b4.f26244a;
        s.h(privacyString, "privacyString");
        AbstractC2852b4.f26244a.put("us_privacy", privacyString);
    }
}
