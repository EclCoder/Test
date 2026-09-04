package com.hecorat.screenrecorder.free.data.prefs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import androidx.preference.l;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import com.hecorat.screenrecorder.free.data.prefs.AdsPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/hecorat/screenrecorder/free/data/prefs/AdsPreference;", "Landroidx/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/preference/l;", "holder", "Lfl/g0;", "S", "(Landroidx/preference/l;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Q", "Landroidx/constraintlayout/widget/ConstraintLayout;", "upgradeLayout", "Landroid/app/Activity;", "R", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Q0", "(Landroid/app/Activity;)V", "activity", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdsPreference extends Preference {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private ConstraintLayout upgradeLayout;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private Activity activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        s.h(context, "context");
        s.h(attrs, "attrs");
        I0(R.layout.preference_ads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(AdsPreference adsPreference, View view) {
        Intent intent = new Intent(adsPreference.j(), (Class<?>) UpgradeActivity.class);
        intent.putExtra("action_source", "settings_fragment_banner");
        Activity activity = adsPreference.activity;
        if (activity != null) {
            activity.startActivityForResult(intent, 882);
        }
    }

    public final void Q0(Activity activity) {
        this.activity = activity;
    }

    @Override // androidx.preference.Preference
    public void S(l holder) {
        s.h(holder, "holder");
        super.S(holder);
        this.upgradeLayout = (ConstraintLayout) holder.b(R.id.upgrade_layout);
        TypedValue typedValue = new TypedValue();
        j().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        ConstraintLayout constraintLayout = this.upgradeLayout;
        if (constraintLayout != null) {
            constraintLayout.setForeground(androidx.core.content.a.getDrawable(j(), typedValue.resourceId));
        }
        ConstraintLayout constraintLayout2 = this.upgradeLayout;
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: sf.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdsPreference.P0(this.f52373a, view);
                }
            });
        }
    }
}
