package wf;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.RadioGroup;
import androidx.fragment.app.o0;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import tf.o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d0 extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    lg.a f56198a;

    public static /* synthetic */ void t(d0 d0Var, RadioGroup radioGroup, int i10) {
        d0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_internal", i10 == R.id.internal_storage_rb);
        d0Var.getParentFragmentManager().y1("SelectStorageDialog", bundle);
        d0Var.dismiss();
    }

    public static d0 v(boolean z10) {
        d0 d0Var = new d0();
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_internal", z10);
        d0Var.setArguments(bundle);
        return d0Var;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        AzRecorderApp.d().h(this);
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z10 = getArguments().getBoolean("use_internal");
        o2 o2Var = (o2) androidx.databinding.g.h(LayoutInflater.from(getActivity()), R.layout.dialog_select_storage, null, false);
        o2Var.G.check(z10 ? R.id.internal_storage_rb : R.id.external_storage_rb);
        long jG = nh.e.g();
        long jO = nh.e.o(getActivity());
        o2Var.C.setText(getString(R.string.available_storage, nh.e.u(jG)));
        o2Var.F.setText(getString(R.string.available_storage, nh.e.u(jO)));
        o2Var.B.setText(getString(R.string.time_can_be_recorded, nh.e.j(this.f56198a, jG)));
        o2Var.E.setText(getString(R.string.time_can_be_recorded, nh.e.j(this.f56198a, jO)));
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), R.style.GeneralDialogTheme);
        builder.setView(o2Var.B());
        builder.setPositiveButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: wf.b0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f56191a.dismiss();
            }
        });
        o2Var.G.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: wf.c0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                d0.t(this.f56197a, radioGroup, i10);
            }
        });
        return builder.create();
    }

    @Override // androidx.fragment.app.m
    public void show(androidx.fragment.app.f0 f0Var, String str) {
        try {
            o0 o0VarQ = f0Var.q();
            o0VarQ.d(this, str);
            o0VarQ.h();
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }
}
