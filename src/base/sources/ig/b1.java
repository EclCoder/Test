package ig;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.google.android.gms.ads.AdError;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.FilePickerActivity;
import com.hecorat.screenrecorder.free.data.prefs.FontPreference;
import com.hecorat.screenrecorder.free.data.prefs.SeekBarDialogPreference;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J#\u0010(\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u00010\u000f0\u000f0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010B¨\u0006D"}, d2 = {"Lig/b1;", "Landroidx/preference/g;", "Landroidx/preference/Preference$e;", "Landroidx/preference/Preference$d;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "Lfl/g0;", "U", "", "keyId", "W", "(I)V", "N", "M", "Landroid/content/Intent;", "intent", "S", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "rootKey", "z", "(Landroid/os/Bundle;Ljava/lang/String;)V", "Landroidx/preference/Preference;", "preference", "m", "(Landroidx/preference/Preference;)V", "onDestroy", "", "l", "(Landroidx/preference/Preference;)Z", "", "newValue", CampaignEx.JSON_KEY_AD_K, "(Landroidx/preference/Preference;Ljava/lang/Object;)Z", "Landroid/content/SharedPreferences;", "sharedPreferences", "key", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "Lqg/d;", "j", "Lqg/d;", "Q", "()Lqg/d;", "setWatermarkManager", "(Lqg/d;)V", "watermarkManager", "Lqg/a;", "Lqg/a;", "O", "()Lqg/a;", "setLogoManager", "(Lqg/a;)V", "logoManager", "Llg/a;", "Llg/a;", "P", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "Lf/c;", "kotlin.jvm.PlatformType", "Lf/c;", "resultLauncher", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b1 extends androidx.preference.g implements Preference.e, Preference.d, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public qg.d watermarkManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public qg.a logoManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final f.c resultLauncher;

    public b1() {
        f.c cVarRegisterForActivityResult = registerForActivityResult(new g.f(), new f.b() { // from class: ig.a1
            @Override // f.b
            public final void a(Object obj) {
                b1.V(this.f41334a, (f.a) obj);
            }
        });
        kotlin.jvm.internal.s.g(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.resultLauncher = cVarRegisterForActivityResult;
    }

    private final void M() {
        boolean zB = P().b(R.string.pref_enable_logo, false);
        if (zB) {
            O().g();
        } else {
            O().d();
        }
        Preference preferenceJ = j(getString(R.string.pref_logo_image_path));
        if (preferenceJ != null) {
            preferenceJ.r0(zB);
        }
        Preference preferenceJ2 = j(getString(R.string.pref_logo_size));
        if (preferenceJ2 != null) {
            preferenceJ2.r0(zB);
        }
    }

    private final void N() {
        boolean zB = P().b(R.string.pref_enable_watermark, false);
        if (zB) {
            Q().l();
        } else {
            Q().d();
        }
        Preference preferenceJ = j(getString(R.string.pref_watermark_text));
        if (preferenceJ != null) {
            preferenceJ.r0(zB);
        }
        Preference preferenceJ2 = j(getString(R.string.pref_watermark_font));
        if (preferenceJ2 != null) {
            preferenceJ2.r0(zB);
        }
        Preference preferenceJ3 = j(getString(R.string.pref_watermark_text_color));
        if (preferenceJ3 != null) {
            preferenceJ3.r0(zB);
        }
        Preference preferenceJ4 = j(getString(R.string.pref_watermark_bg_color));
        if (preferenceJ4 != null) {
            preferenceJ4.r0(zB);
        }
        Preference preferenceJ5 = j(getString(R.string.pref_watermark_text_size));
        if (preferenceJ5 != null) {
            preferenceJ5.r0(zB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(EditText editText) {
        kotlin.jvm.internal.s.h(editText, "editText");
        editText.setInputType(2);
    }

    private final void S(Intent intent) {
        String stringExtra = intent.getStringExtra(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        P().m(R.string.pref_logo_image_path, stringExtra);
        P().m(R.string.pref_logo_url, stringExtra);
        W(R.string.pref_logo_image_path);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Preference preference, b1 b1Var, boolean z10) {
        kotlin.jvm.internal.s.f(preference, "null cannot be cast to non-null type androidx.preference.SwitchPreference");
        ((SwitchPreference) preference).P0(z10);
        if (z10) {
            return;
        }
        nh.j0.b(b1Var.getActivity(), R.string.toast_must_grant_permission_alert);
    }

    private final void U() {
        Intent intent = new Intent(getActivity(), (Class<?>) FilePickerActivity.class);
        intent.putExtra("type", 2);
        this.resultLauncher.b(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(b1 b1Var, f.a result) {
        Intent intentA;
        kotlin.jvm.internal.s.h(result, "result");
        if (result.b() != -1 || (intentA = result.a()) == null) {
            return;
        }
        b1Var.S(intentA);
    }

    private final void W(int keyId) {
        String string = getString(keyId);
        kotlin.jvm.internal.s.g(string, "getString(...)");
        if (keyId == R.string.pref_watermark_font) {
            Preference preferenceJ = j(string);
            if (preferenceJ != null) {
                preferenceJ.D0(P().h(R.string.pref_watermark_font_name, AdError.UNDEFINED_DOMAIN));
                return;
            }
            return;
        }
        if (keyId == R.string.pref_watermark_text) {
            Preference preferenceJ2 = j(string);
            if (preferenceJ2 != null) {
                preferenceJ2.D0(P().h(keyId, getString(R.string.app_name)));
                return;
            }
            return;
        }
        if (keyId == R.string.pref_watermark_text_size) {
            Preference preferenceJ3 = j(string);
            if (preferenceJ3 != null) {
                preferenceJ3.D0(P().h(keyId, "30"));
                return;
            }
            return;
        }
        if (keyId == R.string.pref_logo_size) {
            Preference preferenceJ4 = j(string);
            if (preferenceJ4 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(vl.a.b(P().c(R.string.pref_logo_size, 0.2f) * 100));
                sb2.append('%');
                preferenceJ4.D0(sb2.toString());
                return;
            }
            return;
        }
        if (keyId == R.string.pref_logo_image_path) {
            String strH = P().h(R.string.pref_logo_image_path, "App icon");
            kotlin.jvm.internal.s.g(strH, "getString(...)");
            Preference preferenceJ5 = j(string);
            if (preferenceJ5 != null) {
                preferenceJ5.D0(strH);
            }
        }
    }

    public final qg.a O() {
        qg.a aVar = this.logoManager;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("logoManager");
        return null;
    }

    public final lg.a P() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("preferenceManager");
        return null;
    }

    public final qg.d Q() {
        qg.d dVar = this.watermarkManager;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.s.w("watermarkManager");
        return null;
    }

    @Override // androidx.preference.Preference.d
    public boolean k(final Preference preference, Object newValue) {
        kotlin.jvm.internal.s.h(preference, "preference");
        String strQ = preference.q();
        kotlin.jvm.internal.s.g(strQ, "getKey(...)");
        if (kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_enable_watermark)) || kotlin.jvm.internal.s.c(strQ, getString(R.string.pref_enable_logo))) {
            kotlin.jvm.internal.s.f(newValue, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) newValue).booleanValue() || lg.c.c()) {
                return true;
            }
            lg.c.k(new lg.c.a() { // from class: ig.y0
                @Override // lg.c.a
                public final void a(boolean z10) {
                    b1.T(preference, this, z10);
                }
            });
            return false;
        }
        if (!kotlin.jvm.internal.s.c(getString(R.string.pref_watermark_text_size), strQ)) {
            return true;
        }
        String strV0 = ((EditTextPreference) preference).V0();
        if (strV0 != null && strV0.length() != 0) {
            int i10 = Integer.parseInt(strV0);
            if (8 <= i10 && i10 < 73) {
                return true;
            }
            nh.j0.b(getActivity(), R.string.toast_font_size_out_of_range);
        }
        return false;
    }

    @Override // androidx.preference.Preference.e
    public boolean l(Preference preference) {
        kotlin.jvm.internal.s.h(preference, "preference");
        String strQ = preference.q();
        kotlin.jvm.internal.s.g(strQ, "getKey(...)");
        if (!kotlin.jvm.internal.s.c(getString(R.string.pref_logo_image_path), strQ)) {
            return false;
        }
        U();
        return true;
    }

    @Override // androidx.preference.g, androidx.preference.j.a
    public void m(Preference preference) {
        kotlin.jvm.internal.s.h(preference, "preference");
        if (preference instanceof FontPreference) {
            sf.c cVarA = sf.c.INSTANCE.a(((FontPreference) preference).q());
            cVarA.setTargetFragment(this, 0);
            cVarA.show(getParentFragmentManager(), "fontPreference");
        } else {
            if (!(preference instanceof SeekBarDialogPreference)) {
                super.m(preference);
                return;
            }
            sf.f fVarA = sf.f.INSTANCE.a(((SeekBarDialogPreference) preference).q());
            fVarA.setTargetFragment(this, 1);
            fVarA.show(getParentFragmentManager(), "seekbarPreference");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        P().f().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (isAdded()) {
            try {
                if (kotlin.jvm.internal.s.c(getString(R.string.pref_enable_watermark), key)) {
                    N();
                    return;
                }
                if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_watermark_font))) {
                    Q().h();
                    W(R.string.pref_watermark_font);
                    return;
                }
                if (kotlin.jvm.internal.s.c(getString(R.string.pref_watermark_text_size), key)) {
                    Q().k();
                    W(R.string.pref_watermark_text_size);
                    return;
                }
                if (kotlin.jvm.internal.s.c(getString(R.string.pref_watermark_text), key)) {
                    Q().i();
                    W(R.string.pref_watermark_text);
                    return;
                }
                if (kotlin.jvm.internal.s.c(getString(R.string.pref_watermark_text_color), key)) {
                    Q().j();
                    return;
                }
                if (kotlin.jvm.internal.s.c(getString(R.string.pref_watermark_bg_color), key)) {
                    Q().g();
                    return;
                }
                if (kotlin.jvm.internal.s.c(getString(R.string.pref_enable_logo), key)) {
                    M();
                    return;
                }
                if (!kotlin.jvm.internal.s.c(key, getString(R.string.pref_logo_size)) && !kotlin.jvm.internal.s.c(key, getString(R.string.pref_logo_url))) {
                    return;
                }
                O().h();
                W(R.string.pref_logo_size);
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    @Override // androidx.preference.g
    public void z(Bundle savedInstanceState, String rootKey) {
        AzRecorderApp.d().o(this);
        H(R.xml.watermark_preferences, rootKey);
        N();
        M();
        Preference preferenceJ = j(getString(R.string.pref_logo_image_path));
        if (preferenceJ != null) {
            preferenceJ.A0(this);
        }
        Preference preferenceJ2 = j(getString(R.string.pref_enable_watermark));
        if (preferenceJ2 != null) {
            preferenceJ2.z0(this);
        }
        Preference preferenceJ3 = j(getString(R.string.pref_watermark_text_size));
        if (preferenceJ3 != null) {
            preferenceJ3.z0(this);
        }
        Preference preferenceJ4 = j(getString(R.string.pref_enable_logo));
        if (preferenceJ4 != null) {
            preferenceJ4.z0(this);
        }
        EditTextPreference editTextPreference = (EditTextPreference) j(getString(R.string.pref_watermark_text_size));
        if (editTextPreference != null) {
            editTextPreference.W0(new EditTextPreference.a() { // from class: ig.z0
                @Override // androidx.preference.EditTextPreference.a
                public final void a(EditText editText) {
                    b1.R(editText);
                }
            });
        }
        if (kotlin.jvm.internal.s.c(P().h(R.string.pref_watermark_font, AdError.UNDEFINED_DOMAIN), AdError.UNDEFINED_DOMAIN)) {
            m0.c cVarA = og.b.a();
            if (cVarA != null) {
                P().m(R.string.pref_watermark_font, (String) cVarA.f45059a);
                P().m(R.string.pref_watermark_font_name, (String) cVarA.f45060b);
            } else {
                P().m(R.string.pref_watermark_font, AdError.UNDEFINED_DOMAIN);
                P().m(R.string.pref_watermark_font_name, AdError.UNDEFINED_DOMAIN);
            }
        }
        W(R.string.pref_watermark_font);
        W(R.string.pref_watermark_text);
        W(R.string.pref_watermark_text_size);
        W(R.string.pref_logo_image_path);
        W(R.string.pref_logo_size);
        P().f().registerOnSharedPreferenceChangeListener(this);
    }
}
