package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f30214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SharedPreferences f30215p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30200a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30201b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30202c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30203d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30204e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30205f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30206g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30207h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<String> f30216q = Arrays.asList("IABTCF_gdprApplies", "IABTCF_TCString", "IABTCF_VendorConsents", "IABTCF_PurposeConsents", "IABTCF_AddtlConsent", "IABTCF_DisclosedVendors", "IABTCF_PolicyVersion");

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f30215p = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f30215p;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString("IABTCF_TCString", ""));
            b(this.f30215p.getInt("IABTCF_gdprApplies", 0));
            c(this.f30215p.getString("IABTCF_PurposeConsents", ""));
            e(this.f30215p.getString("IABTCF_VendorConsents", ""));
            b(this.f30215p.getString("IABTCF_AddtlConsent", ""));
            a(this.f30215p.getInt("IABTCF_PolicyVersion", 0));
            f(this.f30215p.getString("IABTCF_DisclosedVendors", ""));
        }
    }

    public String b() {
        return this.f30200a;
    }

    public void c(String str) {
        this.f30208i = a(str, 1);
        this.f30209j = a(str, 2);
        this.f30201b = str;
    }

    public void d(String str) {
        this.f30200a = str;
    }

    public void e(String str) {
        this.f30210k = a(str, 867);
        this.f30202c = str;
    }

    public void f(String str) {
        this.f30213n = a(str, 867);
        this.f30204e = str;
    }

    public void b(int i10) {
        this.f30205f = i10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            List<String> list = this.f30216q;
            if (list == null || list.contains(str)) {
                int iHashCode = str.hashCode();
                String str2 = HqKnbV.WimjgmwAHgFXGBE;
                switch (iHashCode) {
                    case -2004976699:
                        if (str.equals("IABTCF_PurposeConsents")) {
                            c(sharedPreferences.getString("IABTCF_PurposeConsents", str2));
                        }
                        break;
                    case -1595774028:
                        if (str.equals("IABTCF_PolicyVersion")) {
                            a(sharedPreferences.getInt("IABTCF_PolicyVersion", 0));
                        }
                        break;
                    case -1573968861:
                        if (str.equals("IABTCF_DisclosedVendors")) {
                            f(sharedPreferences.getString("IABTCF_DisclosedVendors", str2));
                        }
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies")) {
                            b(sharedPreferences.getInt("IABTCF_gdprApplies", 0));
                        }
                        break;
                    case 1218895378:
                        if (str.equals("IABTCF_TCString")) {
                            d(sharedPreferences.getString("IABTCF_TCString", str2));
                        }
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            b(sharedPreferences.getString("IABTCF_AddtlConsent", str2));
                        }
                        break;
                    case 1450203731:
                        if (str.equals("IABTCF_VendorConsents")) {
                            e(sharedPreferences.getString("IABTCF_VendorConsents", str2));
                        }
                        break;
                }
                a aVar = this.f30214o;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public void b(String str) {
        this.f30203d = str;
        if (TextUtils.isEmpty(str)) {
            this.f30211l = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f30212m = false;
            return;
        }
        this.f30212m = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f30211l = false;
                } else {
                    this.f30211l = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public boolean c() {
        if (this.f30205f == 0) {
            a(true);
            return this.f30207h;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f30210k || (this.f30212m && this.f30211l)) && this.f30208i && this.f30209j);
        } else if (this.f30206g >= 5) {
            a(this.f30213n && this.f30210k && this.f30208i && this.f30209j);
        } else {
            a(this.f30210k && this.f30208i && this.f30209j);
        }
        return this.f30207h;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f30214o = aVar;
        }
    }

    public void a(int i10) {
        this.f30206g = i10;
    }

    public void a(boolean z10) {
        this.f30207h = z10;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}
