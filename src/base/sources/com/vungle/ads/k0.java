package com.vungle.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k0 {
    public static final k0 INSTANCE = new k0();

    private k0() {
    }

    public static final String getCCPAStatus() {
        return yj.c.INSTANCE.getCcpaStatus();
    }

    public static final String getCOPPAStatus() {
        return yj.c.INSTANCE.getCoppaStatus().name();
    }

    public static final String getGDPRMessageVersion() {
        return yj.c.INSTANCE.getConsentMessageVersion();
    }

    public static final String getGDPRSource() {
        return yj.c.INSTANCE.getConsentSource();
    }

    public static final String getGDPRStatus() {
        return yj.c.INSTANCE.getConsentStatus();
    }

    public static final long getGDPRTimestamp() {
        return yj.c.INSTANCE.getConsentTimestamp();
    }

    public static final void setCCPAStatus(boolean z10) {
        yj.c.INSTANCE.updateCcpaConsent(z10 ? yj.b.OPT_IN : yj.b.OPT_OUT);
    }

    public static final void setCOPPAStatus(boolean z10) {
        yj.c.INSTANCE.updateCoppaConsent(z10);
    }

    public static final void setGDPRStatus(boolean z10, String str) {
        yj.c.INSTANCE.updateGdprConsent(z10 ? yj.b.OPT_IN.getValue() : yj.b.OPT_OUT.getValue(), "publisher", str);
    }
}
