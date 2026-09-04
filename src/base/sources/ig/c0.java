package ig;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0005J#\u0010$\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b$\u0010%R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lig/c0;", "Landroidx/preference/g;", "Landroidx/preference/Preference$d;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "<init>", "()V", "", "keyId", "Lfl/g0;", "O", "(I)V", "P", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "rootKey", "z", "(Landroid/os/Bundle;Ljava/lang/String;)V", "Landroidx/preference/Preference;", "preference", "", "newValue", "", CampaignEx.JSON_KEY_AD_K, "(Landroidx/preference/Preference;Ljava/lang/Object;)Z", "onDestroy", "Landroid/content/SharedPreferences;", "sharedPreferences", "key", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "Llg/a;", "j", "Llg/a;", "L", "()Llg/a;", "setPreferenceManager", "(Llg/a;)V", "preferenceManager", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 extends androidx.preference.g implements Preference.d, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public lg.a preferenceManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(EditText editText) {
        kotlin.jvm.internal.s.h(editText, "editText");
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: ig.b0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                return c0.N(charSequence, i10, i11, spanned, i12, i13);
            }
        }});
        editText.setInputType(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence N(CharSequence source, int i10, int i11, Spanned dest, int i12, int i13) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(dest, "dest");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) dest);
            sb2.append((Object) source);
            int i14 = Integer.parseInt(sb2.toString());
            if (1 > i14 || i14 >= 7201) {
                return "";
            }
            return null;
        } catch (NumberFormatException e10) {
            wp.a.e(e10);
            return "";
        }
    }

    private final void O(int keyId) {
        String string;
        String string2 = getString(keyId);
        kotlin.jvm.internal.s.g(string2, "getString(...)");
        if (keyId == R.string.pref_time_limit_value) {
            if (L().b(R.string.pref_stop_on_time_limit, false)) {
                string = L().h(R.string.pref_time_limit_value, "600") + " sec";
            } else {
                string = getString(R.string.stop_on_time_limit_default_summary);
                kotlin.jvm.internal.s.e(string);
            }
            Preference preferenceJ = j(string2);
            kotlin.jvm.internal.s.e(preferenceJ);
            preferenceJ.D0(string);
        }
    }

    private final void P() {
        boolean zB = L().b(R.string.pref_stop_on_time_limit, false);
        Preference preferenceJ = j(getString(R.string.pref_time_limit_value));
        if (preferenceJ != null) {
            preferenceJ.r0(zB);
        }
    }

    public final lg.a L() {
        lg.a aVar = this.preferenceManager;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.s.w("preferenceManager");
        return null;
    }

    @Override // androidx.preference.Preference.d
    public boolean k(Preference preference, Object newValue) {
        int i10;
        kotlin.jvm.internal.s.h(preference, "preference");
        String strQ = preference.q();
        kotlin.jvm.internal.s.g(strQ, "getKey(...)");
        if (kotlin.jvm.internal.s.c(strQ, "com.facebook.appevents.SessionInfo.sessionEndTime")) {
            return true;
        }
        if (kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_screen_off), strQ) && 35 <= (i10 = Build.VERSION.SDK_INT) && i10 < 38 && kotlin.jvm.internal.s.c(newValue, Boolean.FALSE)) {
            new AlertDialog.Builder(requireContext(), R.style.GeneralDialogTheme).setTitle(R.string.screen_record_lock_dialog_api35_title).setMessage(R.string.screen_record_lock_dialog_api35).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).show();
            return false;
        }
        if ((!kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_time_limit), strQ) && !kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_screen_off), strQ) && !kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_shake), strQ)) || !ef.a.h()) {
            return true;
        }
        nh.j0.j(getActivity(), R.string.toast_change_preference_during_recording);
        return false;
    }

    @Override // androidx.preference.g, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.s.g(viewOnCreateView, "onCreateView(...)");
        viewOnCreateView.setBackgroundColor(-1);
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        L().f().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (isAdded()) {
            try {
                if (kotlin.jvm.internal.s.c(getString(R.string.pref_stop_on_time_limit), key)) {
                    O(R.string.pref_time_limit_value);
                    P();
                } else if (kotlin.jvm.internal.s.c(key, getString(R.string.pref_time_limit_value))) {
                    O(R.string.pref_time_limit_value);
                }
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    @Override // androidx.preference.g
    public void z(Bundle savedInstanceState, String rootKey) {
        SwitchPreference switchPreference;
        AzRecorderApp.d().E(this);
        q(R.xml.stop_preferences);
        P();
        Preference preferenceJ = j(getString(R.string.pref_stop_on_screen_off));
        if (preferenceJ != null) {
            preferenceJ.z0(this);
        }
        Preference preferenceJ2 = j(getString(R.string.pref_stop_on_shake));
        if (preferenceJ2 != null) {
            preferenceJ2.z0(this);
        }
        Preference preferenceJ3 = j(getString(R.string.pref_stop_on_time_limit));
        if (preferenceJ3 != null) {
            preferenceJ3.z0(this);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 38) {
            SwitchPreference switchPreference2 = (SwitchPreference) j(getString(R.string.pref_stop_on_screen_off));
            if (switchPreference2 != null) {
                switchPreference2.H0(false);
            }
        } else if (i10 >= 35 && (switchPreference = (SwitchPreference) j(getString(R.string.pref_stop_on_screen_off))) != null) {
            switchPreference.P0(true);
        }
        O(R.string.pref_stop_on_time_limit);
        O(R.string.pref_time_limit_value);
        EditTextPreference editTextPreference = (EditTextPreference) j(getString(R.string.pref_time_limit_value));
        if (editTextPreference != null) {
            editTextPreference.W0(new EditTextPreference.a() { // from class: ig.a0
                @Override // androidx.preference.EditTextPreference.a
                public final void a(EditText editText) {
                    c0.M(editText);
                }
            });
        }
        L().f().registerOnSharedPreferenceChangeListener(this);
    }
}
