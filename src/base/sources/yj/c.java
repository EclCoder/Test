package yj;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.e;
import com.vungle.ads.internal.model.g;
import com.vungle.ads.internal.util.q;
import fl.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static yj.b ccpaConsent;
    private static com.vungle.ads.internal.persistence.b filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    private static SharedPreferences sharedPreferences;
    public static final c INSTANCE = new c();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.DISABLE_ID.ordinal()] = 1;
            iArr[a.FALLBACK.ordinal()] = 2;
            iArr[a.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[g.IABSettings.c.values().length];
            iArr2[g.IABSettings.c.DISABLE_ID.ordinal()] = 1;
            iArr2[g.IABSettings.c.ALLOW_ID.ordinal()] = 2;
            iArr2[g.IABSettings.c.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private c() {
    }

    private final void saveCcpaConsent(yj.b bVar) {
        com.vungle.ads.internal.persistence.b bVarPut;
        com.vungle.ads.internal.persistence.b bVar2 = filePreferences;
        if (bVar2 == null || (bVarPut = bVar2.put("ccpa_status", bVar.getValue())) == null) {
            return;
        }
        bVarPut.apply();
    }

    private final void saveCoppaConsent(boolean z10) {
        com.vungle.ads.internal.persistence.b bVarPut;
        com.vungle.ads.internal.persistence.b bVar = filePreferences;
        if (bVar == null || (bVarPut = bVar.put("is_coppa", z10)) == null) {
            return;
        }
        bVarPut.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j10) {
        com.vungle.ads.internal.persistence.b bVarPut;
        com.vungle.ads.internal.persistence.b bVarPut2;
        com.vungle.ads.internal.persistence.b bVarPut3;
        com.vungle.ads.internal.persistence.b bVarPut4;
        com.vungle.ads.internal.persistence.b bVar = filePreferences;
        if (bVar == null || (bVarPut = bVar.put("gdpr_status", str)) == null || (bVarPut2 = bVarPut.put("gdpr_source", str2)) == null || (bVarPut3 = bVarPut2.put("gdpr_message_version", str3)) == null || (bVarPut4 = bVarPut3.put("gdpr_timestamp", j10)) == null) {
            return;
        }
        bVarPut4.apply();
    }

    public final a allowDeviceIDFromTCF() {
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (!s.c(gdprAppliesFromPreferences, Boolean.TRUE)) {
            return gdprAppliesFromPreferences == null ? a.FALLBACK : a.ALLOW_ID;
        }
        g.IABSettings.c tcfStatus = e.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : b.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return a.DISABLE_ID;
            }
            if (i10 == 2) {
                return a.ALLOW_ID;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return a.FALLBACK;
    }

    public final String getCcpaStatus() {
        String value;
        yj.b bVar = ccpaConsent;
        return (bVar == null || (value = bVar.getValue()) == null) ? yj.b.UNKNOWN.getValue() : value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l10 = gdprConsentTimestamp;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final yj.a getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return yj.a.COPPA_NOTSET;
        }
        if (s.c(atomicReference.get(), Boolean.TRUE)) {
            return yj.a.COPPA_ENABLED;
        }
        return s.c(atomicReference.get(), Boolean.FALSE) ? yj.a.COPPA_DISABLED : yj.a.COPPA_NOTSET;
    }

    public final Boolean getDisableAdId$vungle_ads_release() {
        return disableAdId.get();
    }

    public final Boolean getGdprAppliesFromPreferences() {
        Object objB;
        Object objB2;
        Integer numValueOf;
        String string;
        try {
            r.a aVar = r.f38769b;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            objB = r.b(sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1)) : null);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        if (r.e(objB) != null) {
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 == null || (string = sharedPreferences3.getString("IABTCF_gdprApplies", "-1")) == null) {
                    numValueOf = null;
                } else {
                    s.g(string, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                }
                objB2 = r.b(numValueOf);
            } catch (Throwable th3) {
                r.a aVar3 = r.f38769b;
                objB2 = r.b(fl.s.a(th3));
            }
            objB = objB2;
        }
        if (r.h(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString("IABTCF_TCString", "") : null;
        return string == null ? "" : string;
    }

    public final String getPreviousTcfToken() {
        com.vungle.ads.internal.persistence.b bVar = filePreferences;
        if (bVar != null) {
            return bVar.getString("previous_tcf_token", "");
        }
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(Context context) throws Throwable {
        Throwable th2;
        try {
            try {
                s.h(context, "context");
                AtomicBoolean atomicBoolean = initialized;
                try {
                    if (atomicBoolean.get()) {
                        q.Companion.w("PrivacyManager", "PrivacyManager already initialized");
                        return;
                    }
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    com.vungle.ads.internal.persistence.b bVar = (com.vungle.ads.internal.persistence.b) ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.persistence.b.class);
                    filePreferences = bVar;
                    AtomicReference<Boolean> atomicReference = disableAdId;
                    Boolean bool = atomicReference.get();
                    if (bool != null) {
                        saveDisableAdId(bool.booleanValue());
                    } else {
                        Boolean bool2 = bVar.getBoolean("disable_ad_id");
                        if (bool2 != null) {
                            atomicReference.set(bool2);
                        }
                    }
                    String str = gdprConsent;
                    if (str != null) {
                        String str2 = gdprConsentSource;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = gdprConsentMessageVersion;
                        if (str3 == null) {
                            str3 = "";
                        }
                        Long l10 = gdprConsentTimestamp;
                        saveGdprConsent(str, str2, str3, l10 != null ? l10.longValue() : 0L);
                    } else {
                        String string = bVar.getString("gdpr_status");
                        yj.b bVar2 = yj.b.OPT_IN;
                        if (s.c(string, bVar2.getValue())) {
                            string = bVar2.getValue();
                        } else {
                            yj.b bVar3 = yj.b.OPT_OUT;
                            if (s.c(string, bVar3.getValue())) {
                                string = bVar3.getValue();
                            }
                        }
                        gdprConsent = string;
                        gdprConsentSource = bVar.getString("gdpr_source");
                        gdprConsentMessageVersion = bVar.getString("gdpr_message_version");
                        gdprConsentTimestamp = Long.valueOf(bVar.getLong("gdpr_timestamp", 0L));
                    }
                    yj.b bVar4 = ccpaConsent;
                    if (bVar4 != null) {
                        saveCcpaConsent(bVar4);
                    } else {
                        String string2 = bVar.getString("ccpa_status");
                        yj.b bVar5 = yj.b.OPT_OUT;
                        if (!s.c(bVar5.getValue(), string2)) {
                            bVar5 = yj.b.OPT_IN;
                        }
                        ccpaConsent = bVar5;
                    }
                    AtomicReference<Boolean> atomicReference2 = coppaStatus;
                    Boolean bool3 = atomicReference2.get();
                    if (bool3 != null) {
                        saveCoppaConsent(bool3.booleanValue());
                    } else {
                        Boolean bool4 = bVar.getBoolean("is_coppa");
                        if (bool4 != null) {
                            atomicReference2.set(bool4);
                        }
                    }
                    atomicBoolean.set(true);
                    return;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public final void reset() {
        initialized.set(false);
        gdprConsent = null;
        gdprConsentSource = null;
        gdprConsentMessageVersion = null;
        gdprConsentTimestamp = null;
        ccpaConsent = null;
        disableAdId.set(null);
        coppaStatus.set(null);
        filePreferences = null;
        sharedPreferences = null;
    }

    public final void saveDisableAdId(boolean z10) {
        com.vungle.ads.internal.persistence.b bVarPut;
        com.vungle.ads.internal.persistence.b bVar = filePreferences;
        if (bVar == null || (bVarPut = bVar.put("disable_ad_id", z10)) == null) {
            return;
        }
        bVarPut.apply();
    }

    public final void setPreviousTcfToken(String str) {
        com.vungle.ads.internal.persistence.b bVar;
        com.vungle.ads.internal.persistence.b bVarPut;
        if (str == null || str.length() == 0 || (bVar = filePreferences) == null || (bVarPut = bVar.put("previous_tcf_token", str)) == null) {
            return;
        }
        bVarPut.apply();
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (s.c(getPreviousTcfToken(), iABTCFString)) {
            return false;
        }
        setPreviousTcfToken(iABTCFString);
        return true;
    }

    public final boolean shouldSendAdIds() {
        int i10 = b.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Boolean disableAdId$vungle_ads_release = getDisableAdId$vungle_ads_release();
            if (disableAdId$vungle_ads_release != null && !disableAdId$vungle_ads_release.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldSendTCFString() {
        if (!s.c(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            return false;
        }
        g.IABSettings.c tcfStatus = e.INSTANCE.getTcfStatus();
        int i10 = tcfStatus == null ? -1 : b.$EnumSwitchMapping$1[tcfStatus.ordinal()];
        if (i10 != -1) {
            if (i10 == 1 || i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return shouldReturnTrueForLegacy$vungle_ads_release();
    }

    public final void updateCcpaConsent(yj.b consent) {
        s.h(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean z10) {
        coppaStatus.set(Boolean.valueOf(z10));
        saveCoppaConsent(z10);
    }

    public final void updateDisableAdId(boolean z10) {
        disableAdId.set(Boolean.valueOf(z10));
        saveDisableAdId(z10);
    }

    public final void updateGdprConsent(String consent, String source, String str) {
        s.h(consent, "consent");
        s.h(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = str;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str2 = gdprConsentMessageVersion;
        if (str2 == null) {
            str2 = "";
        }
        saveGdprConsent(consent, source, str2, jCurrentTimeMillis);
    }
}
