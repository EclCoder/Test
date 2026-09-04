package com.hecorat.screenrecorder.free.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.hecorat.screenrecorder.free.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/hecorat/screenrecorder/free/data/prefs/FontPreference;", "Landroidx/preference/DialogPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "name", "Lfl/g0;", "V0", "(Ljava/lang/String;)V", "", "defaultValue", "c0", "(Ljava/lang/Object;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "W", "Ljava/lang/String;", "U0", "()Ljava/lang/String;", "W0", "fontPath", "X", "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FontPreference extends DialogPreference {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private String fontPath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.h(context, "context");
        this.fontPath = "";
    }

    /* JADX INFO: renamed from: U0, reason: from getter */
    public final String getFontPath() {
        return this.fontPath;
    }

    public final void V0(String name) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        s.h(name, "name");
        SharedPreferences sharedPreferencesB = B();
        if (sharedPreferencesB == null || (editorEdit = sharedPreferencesB.edit()) == null || (editorPutString = editorEdit.putString(j().getString(R.string.pref_watermark_font_name), name)) == null) {
            return;
        }
        editorPutString.apply();
    }

    public final void W0(String value) {
        s.h(value, "value");
        this.fontPath = value;
        j0(value);
    }

    @Override // androidx.preference.Preference
    protected void c0(Object defaultValue) {
        W0(x(defaultValue instanceof String ? (String) defaultValue : null));
    }
}
