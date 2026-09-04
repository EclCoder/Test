package com.hecorat.screenrecorder.free.data.prefs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import f.c;
import nh.j0;
import nh.l0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SingleLineListPreference extends ListPreference {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private CharSequence f22880b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int[] f22881c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private c f22882d0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ArrayAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence[] f22884b;

        public a(Context context, int i10, CharSequence[] charSequenceArr) {
            super(context, i10, charSequenceArr);
            this.f22883a = i10;
            this.f22884b = charSequenceArr;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.f22883a, viewGroup, false);
            }
            if (view != null) {
                CheckedTextView checkedTextView = (CheckedTextView) view.findViewById(R.id.ctv);
                checkedTextView.setText(this.f22884b[i10]);
                checkedTextView.setChecked(SingleLineListPreference.this.W0() == this.f22884b[i10]);
                if (SingleLineListPreference.this.j1(i10)) {
                    view.findViewById(R.id.pro_tv).setVisibility(0);
                } else {
                    view.findViewById(R.id.pro_tv).setVisibility(4);
                }
            }
            return view;
        }
    }

    public SingleLineListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f22882d0 = null;
    }

    public static /* synthetic */ void h1(SingleLineListPreference singleLineListPreference, a aVar, DialogInterface dialogInterface, int i10) {
        if (singleLineListPreference.j1(i10) && !l0.o()) {
            Intent intent = new Intent(singleLineListPreference.j(), (Class<?>) UpgradeActivity.class);
            intent.putExtra("action_source", "record_high_config");
            intent.putExtra("key_extra_data", i10);
            singleLineListPreference.f22882d0.b(intent);
        } else if (singleLineListPreference.c(singleLineListPreference.X0()[i10].toString())) {
            singleLineListPreference.f1(i10);
            aVar.notifyDataSetChanged();
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j1(int i10) {
        int[] iArr = this.f22881c0;
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i10 == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    public CharSequence C() {
        CharSequence charSequenceW0 = W0();
        if (super.C() == null || charSequenceW0 == null) {
            return super.C();
        }
        CharSequence charSequence = this.f22880b0;
        return charSequence instanceof String ? super.C() : charSequence;
    }

    @Override // androidx.preference.ListPreference, androidx.preference.Preference
    public void D0(CharSequence charSequence) {
        super.D0(charSequence);
        this.f22880b0 = charSequence;
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void T() {
        if (q().equals(j().getString(R.string.pref_countdown)) && !lg.c.c()) {
            lg.c.k(null);
            return;
        }
        if (ef.a.h() && (j().getString(R.string.pref_resolution).equals(q()) || j().getString(R.string.pref_frame_rate).equals(q()) || j().getString(R.string.pref_bitrate).equals(q()) || j().getString(R.string.pref_orientation).equals(q()) || j().getString(R.string.pref_audio_source).equals(q()))) {
            j0.j(j(), R.string.toast_change_preference_during_recording);
            return;
        }
        View viewInflate = LayoutInflater.from(j()).inflate(R.layout.title_setting_dialog, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.title_tv)).setText(E());
        final a aVar = new a(j(), R.layout.item_setting_dialog, V0());
        AlertDialog alertDialogShow = new AlertDialog.Builder(j(), R.style.GeneralDialogTheme).setCustomTitle(viewInflate).setSingleChoiceItems(aVar, U0(Y0()), new DialogInterface.OnClickListener() { // from class: com.hecorat.screenrecorder.free.data.prefs.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SingleLineListPreference.h1(this.f22886a, aVar, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: sf.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }).show();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(alertDialogShow.getWindow().getAttributes());
        layoutParams.width = (int) j().getResources().getDimension(R.dimen.setting_dialog_width);
        alertDialogShow.getWindow().setAttributes(layoutParams);
    }

    public void k1(c cVar) {
        this.f22882d0 = cVar;
    }

    public void l1(int[] iArr) {
        this.f22881c0 = iArr;
    }

    public SingleLineListPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22882d0 = null;
    }

    public SingleLineListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22882d0 = null;
    }

    public SingleLineListPreference(Context context) {
        super(context);
        this.f22882d0 = null;
        this.f22880b0 = C();
    }
}
