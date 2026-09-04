package wf;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RadioGroup;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import tf.m2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class z extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    lg.a f56264a;

    public static /* synthetic */ void t(z zVar, RadioGroup radioGroup, int i10) {
        zVar.f56264a.m(R.string.pref_recording_mode, i10 == R.id.advanced_mode_rb ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
        zVar.getParentFragmentManager().y1("SelectRecordingModeDialog", new Bundle());
        zVar.dismiss();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        AzRecorderApp.d().J(this);
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        m2 m2Var = (m2) androidx.databinding.g.h(LayoutInflater.from(getActivity()), R.layout.dialog_select_recording_mode, null, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.GeneralDialogTheme);
        builder.setView(m2Var.B());
        builder.setPositiveButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: wf.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f56262a.dismiss();
            }
        });
        m2Var.C.check(this.f56264a.h(R.string.pref_recording_mode, pf.a.f50031f).equals("1") ? R.id.advanced_mode_rb : R.id.basic_mode_rb);
        m2Var.C.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: wf.y
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                z.t(this.f56263a, radioGroup, i10);
            }
        });
        return builder.create();
    }
}
