package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.google.common.collect.c0;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzod {
    private final Map zza;

    zzod(Map map) {
        HashMap map2 = new HashMap();
        this.zza = map2;
        map2.putAll(map);
    }

    private final int zzf() {
        try {
            String str = (String) this.zza.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzod) {
            return zza().equalsIgnoreCase(((zzod) obj).zza());
        }
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    public final String toString() {
        return zza();
    }

    final String zza() {
        StringBuilder sb2 = new StringBuilder();
        c0 c0Var = zzof.zza;
        int size = c0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) c0Var.get(i10);
            Map map = this.zza;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    public final Bundle zzb() {
        Map map = this.zza;
        if ("1".equals(map.get("gdprApplies")) && "1".equals(map.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (map.get("Version") == null) {
                if (!"1".equals(map.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int iZzf = zzf();
                if (iZzf < 0) {
                    return Bundle.EMPTY;
                }
                String str2 = (String) map.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString(zzjk.AD_STORAGE.zze, str2.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str2.length() > 3) {
                    bundle.putString(zzjk.AD_PERSONALIZATION.zze, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str2.length() > 6 && iZzf >= 4) {
                    String str3 = zzjk.AD_USER_DATA.zze;
                    if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                        str = "granted";
                    }
                    bundle.putString(str3, str);
                }
                return bundle;
            }
            if (zzf() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(zzjk.AD_STORAGE.zze, true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString(zzjk.AD_PERSONALIZATION.zze, (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (zzf() >= 4) {
                    String str4 = zzjk.AD_USER_DATA.zze;
                    if (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString(str4, str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    public final String zzc() {
        String str = (String) this.zza.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String zze() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int i10 = -1;
        try {
            String str = (String) this.zza.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 < 0 || i10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        }
        int iZzf = zzf();
        if (iZzf < 0 || iZzf > 63) {
            sb2.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iZzf));
        }
        Preconditions.checkArgument(true);
        Map map = this.zza;
        int i11 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i12 = i11 | 4;
        if (zEquals) {
            i12 = i11 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final String zzd(zzod zzodVar) {
        Map map = zzodVar.zza;
        boolean zIsEmpty = map.isEmpty();
        String str = mDXVAtwcaFMHJ.SuHvnTgHIB;
        String str2 = (zIsEmpty || ((String) map.get("Version")) != null) ? str : "1";
        Bundle bundleZzb = zzb();
        Bundle bundleZzb2 = zzodVar.zzb();
        if (bundleZzb.size() != bundleZzb2.size() || !Objects.equals(bundleZzb.getString("ad_storage"), bundleZzb2.getString("ad_storage")) || !Objects.equals(bundleZzb.getString("ad_personalization"), bundleZzb2.getString("ad_personalization")) || !Objects.equals(bundleZzb.getString("ad_user_data"), bundleZzb2.getString("ad_user_data"))) {
            str = "1";
        }
        return str2.concat(str);
    }
}
