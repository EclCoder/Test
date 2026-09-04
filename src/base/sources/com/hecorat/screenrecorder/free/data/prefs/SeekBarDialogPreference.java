package com.hecorat.screenrecorder.free.data.prefs;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.hecorat.screenrecorder.free.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/hecorat/screenrecorder/free/data/prefs/SeekBarDialogPreference;", "Landroidx/preference/DialogPreference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/TypedArray;", "a", "", "index", "", "W", "(Landroid/content/res/TypedArray;I)Ljava/lang/Object;", "defaultValue", "Lfl/g0;", "c0", "(Ljava/lang/Object;)V", "P0", "()I", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "F", "U0", "()F", "V0", "(F)V", "sbValue", "X", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SeekBarDialogPreference extends DialogPreference {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private float sbValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekBarDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s.h(context, "context");
        this.sbValue = 20.0f;
    }

    @Override // androidx.preference.DialogPreference
    public int P0() {
        return R.layout.seek_bar_logo_size;
    }

    /* JADX INFO: renamed from: U0, reason: from getter */
    public final float getSbValue() {
        return this.sbValue;
    }

    public final void V0(float f10) {
        this.sbValue = f10;
        h0(f10);
    }

    @Override // androidx.preference.Preference
    protected Object W(TypedArray a10, int index) {
        s.h(a10, "a");
        return Float.valueOf(a10.getFloat(index, 20.0f));
    }

    @Override // androidx.preference.Preference
    protected void c0(Object defaultValue) {
        Float f10 = defaultValue instanceof Float ? (Float) defaultValue : null;
        V0(v(f10 != null ? f10.floatValue() : 20.0f));
    }
}
